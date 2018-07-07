/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreAdmin;



import Business.InventoryDirectory;
import Business.Product;
import Business.ProductCatalog;
import Business.Store;
import Business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sheetal
 */
public class ManageStoreJPanel extends javax.swing.JPanel {

   ProductCatalog pc;
   JPanel upc;
   StoreDirectory storeDirectory;
   private Store s;


    
    public ManageStoreJPanel(ProductCatalog pc,JPanel upc,StoreDirectory storeDirectory,Store s) {
        initComponents();
        this.pc=pc;
        this.upc=upc;
        this.storeDirectory=storeDirectory;
        this.s=s;
       
        
        txtStoreName.setText(s.getStoreName());
        
        
       
            
//                DefaultTableModel dtm = (DefaultTableModel) tblProductDetails.getModel();
//        dtm.setRowCount(0);
//        for (Product p : pc.getProductList()) {
//            Object row[] = new Object[4];
//            row[0] = p;
//            row[1]= p.getProductName();
//            row[2] = p.getManufacturer();
//            row[3]= p.getAvailability();
//           
//            dtm.addRow(row);
populateProductTable();

        
        
   
    }
    
     private void populateProductTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblProductDetails.getModel();
      
        dtm.setRowCount(0);
        
            for (Product product : pc.getProductList()) {
                Object row[] = new Object[5];
                row[0] = product;
                row[1] = product.getProductName();
                row[2] = product.getManufacturer();
                row[3] = product.getAvailability();
                row[4] =product.getMarkedPrice();
                dtm.addRow(row);
            }
            
        
    }

    private void refreshOrderTable() {
     int rowCount = tblsearchedproduct.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) tblsearchedproduct.getModel()).removeRow(i);
        }
       //  Store s = (Store) cmbstorelist.getSelectedItem();
        // if (s != null)
         for (Product p : s.getInventoryDirectory().getInventoryList()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getProductName();
            row[2] = p.getAvailability();
            row[3] = p.getSellingPrice();
            
            ((DefaultTableModel) tblsearchedproduct.getModel()).addRow(row);
        
         }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsearchedproduct = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsalesprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        btnaddtocart = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();
        btntopfive = new javax.swing.JButton();
        btnviewinventory = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStoreName = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();

        jLabel1.setText("Store Name");

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        tblsearchedproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Availability", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblsearchedproduct);

        tblProductDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Manufacturer Name", "Availability", "Marked Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductDetails);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Product Catalog");

        jLabel3.setText("Sales Price");

        jLabel4.setText("Quantity");

        btnaddtocart.setText("Add to Inventory");
        btnaddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddtocartActionPerformed(evt);
            }
        });

        btnreport.setText("Report");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        btntopfive.setText("Profitable Products");
        btntopfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntopfiveActionPerformed(evt);
            }
        });

        btnviewinventory.setText("view Inventory");
        btnviewinventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewinventoryActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Store Inventory");

        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnreport)
                                    .addGap(28, 28, 28)
                                    .addComponent(btntopfive))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsearch)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsalesprice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnaddtocart))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(txtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnviewinventory))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnback)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnviewinventory))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsalesprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddtocart)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntopfive)
                    .addComponent(btnreport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnback)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
//         Store s= (Store)cmbstorelist.getSelectedItem();
       String key = txtsearch.getText();
       Product result = s.getInventoryDirectory().searchProduct(key);
       if(result!=null)
       {      
            DefaultTableModel dtm = (DefaultTableModel) tblsearchedproduct.getModel();
        dtm.setRowCount(0);
        for (Product p : s.getInventoryDirectory().getInventoryList()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1]= p.getProductName();
            row[2] = p.getAvailability();
            row[3] = p.getSellingPrice();
           
            dtm.addRow(row);
        }
       }
       
       else
       {
           JOptionPane.showMessageDialog(null, "Product doesnot exist", "Success", JOptionPane.PLAIN_MESSAGE);
           return;
       }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btnaddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddtocartActionPerformed
        // Store s= (Store)cmbstorelist.getSelectedItem();
        int selectedRow = tblProductDetails.getSelectedRow();
        Product selectedProduct;
        int salesPrice = 0;
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            selectedProduct = (Product) tblProductDetails.getValueAt(selectedRow, 0);
        }
        if(s==null)
        {
           
              JOptionPane.showMessageDialog(this, "Please create a store", "Warning", JOptionPane.WARNING_MESSAGE);
              return;
       
        }
        else
        {

        try {
            salesPrice = Integer.parseInt(txtsalesprice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid sales price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (salesPrice < selectedProduct.getMarkedPrice()) {
            JOptionPane.showMessageDialog(this, "Sales Price should be more than Marked Price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int fetchedQty = (Integer) quantitySpinner.getValue();
        if (fetchedQty <= 0) {
            JOptionPane.showMessageDialog(this, "Selected atlest 1 quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (fetchedQty <= selectedProduct.getAvailability()) {
            boolean alreadyPresent = false;
           
            for (Product p: s.getInventoryDirectory().getInventoryList()) {
                if (p.getProductName() == selectedProduct.getProductName()) {
                    int oldAvail = selectedProduct.getAvailability();
                    int newAvail = oldAvail - fetchedQty;
                    selectedProduct.setAvailability(newAvail);
                    p.setAvailability(fetchedQty + p.getAvailability());
                    p.setQuantity(fetchedQty + p.getQuantity());
                     p.setSellingPrice(Double.parseDouble(txtsalesprice.getText().trim()));
                    alreadyPresent = true;
                    refreshOrderTable();
                    populateProductTable();
                    break;
                }
            }

            if (!alreadyPresent) {
                int oldAvail = selectedProduct.getAvailability();
                int newAvail = oldAvail - fetchedQty;
                selectedProduct.setAvailability(newAvail);
               Product p = new Product() ;
               p.setProductID(selectedProduct.getProductID());
               p.setProductName(selectedProduct.getProductName());
               p.setAvailability(fetchedQty);
               p.setSellingPrice(Double.parseDouble(txtsalesprice.getText().trim()));
               p.setQuantity(fetchedQty);
                s.getInventoryDirectory().addProductinInventory(p);
                refreshOrderTable();
                populateProductTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Quantity > Availability!!", "Warning", JOptionPane.WARNING_MESSAGE);
        
        }
        
      
        
        
        }
    }
     
        
                                       
//
//    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {                                                  
//        // TODO add your handling code here:
//        int selectedRow = orderTable.getSelectedRow();
//        //Product selectedProduct;
//        //int salesPrice=0;
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if (!txtNewQuantity.getText().isEmpty() && !txtNewQuantity.getText().equals("0")) {
//            OrderItem orderItem = (OrderItem) orderTable.getValueAt(selectedRow, 0);
//            int currentAvail = orderItem.getProduct().getAvail();
//            int oldQty = orderItem.getQuantity();
//            int newQty = Integer.parseInt(txtNewQuantity.getText());
//            if (newQty > (currentAvail + oldQty)) {
//                JOptionPane.showMessageDialog(null, "Quantity is more than the availability");
//                //return;
//            } else {
//                if (newQty <= 0) {
//                    JOptionPane.showMessageDialog(null, "Invalid qty");
//                    return;
//                }
//                orderItem.setQuantity(newQty);
//                orderItem.getProduct().setAvail(currentAvail + (oldQty - newQty));
//                refreshOrderTable();
//                populateProductTable();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Quantity cannot be zero!!");
// 
{

    }//GEN-LAST:event_btnaddtocartActionPerformed
 public CategoryDataset plotGrapghInventory() {


        int i = 0;
        int k = 1;
        double swapInventory;
        String swapInventoryName;
        double plotInventory[] = new double[150];
        String Name[] = new String[150];

        for (Product p : s.getInventoryDirectory().getInventoryList()) {
            plotInventory[i] = p.getSellingPrice()- p.getMarkedPrice();
            Name[i] = p.getProductName();
            i++;
        }

        while (k < plotInventory.length) {
            for (int j = 0; j < plotInventory.length - 1; j++) {
                if (plotInventory[j + 1] > plotInventory[j]) {
                    swapInventory = plotInventory[j];
                    plotInventory[j] = plotInventory[j + 1];
                    plotInventory[j + 1] = swapInventory;
                    swapInventoryName = Name[j];
                    Name[j] = Name[j + 1];
                    Name[j + 1] = swapInventoryName;
                }
            }
            k++;
        }

       for (int l = 0; l < plotInventory.length; l++) {
           System.out.println(plotInventory[l]);
       }
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int z = 0; z < 5; z++) {
            dataset.addValue(plotInventory[z], Name[z], Name[z]);
        }

        return dataset;
    }
 
    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
          ReportJPanel panel = new ReportJPanel(upc,storeDirectory);
        upc.add("ReportJPanel", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_btnreportActionPerformed

    private void btntopfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntopfiveActionPerformed
         DefaultTableModel dtm = (DefaultTableModel) tblsearchedproduct.getModel();
        dtm.getRowCount();

        System.out.println(dtm.getRowCount());

        if (dtm.getRowCount() < 4) {
            JOptionPane.showMessageDialog(null, "Inventory must have more than 4 products to plot the graph");

        } else {

            JFreeChart plotGraphInventory = ChartFactory.createBarChart("Top 5 products in Store",
                    "Products",
                    "Profit", plotGrapghInventory(),
                    PlotOrientation.VERTICAL,
                    true, true, false);

            ChartPanel chartPanel = new ChartPanel(plotGraphInventory);
            chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
            ChartFrame frame = new ChartFrame("Market Report", plotGraphInventory);
            frame.setVisible(true);
            frame.setSize(500, 270);
    }//GEN-LAST:event_btntopfiveActionPerformed
    }
    private void btnviewinventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinventoryActionPerformed
          String s = txtStoreName.getText().trim();
        DefaultTableModel dtm = (DefaultTableModel) tblsearchedproduct.getModel();
        dtm.setRowCount(0);
        if(s!=null){

            refreshOrderTable();
        }
        else
        {
              JOptionPane.showMessageDialog(this, "No store created", "Warning", JOptionPane.WARNING_MESSAGE);
              return;
        }
    }//GEN-LAST:event_btnviewinventoryActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddtocart;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btntopfive;
    private javax.swing.JButton btnviewinventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JTable tblProductDetails;
    private javax.swing.JTable tblsearchedproduct;
    private javax.swing.JTextField txtStoreName;
    private javax.swing.JTextField txtsalesprice;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}