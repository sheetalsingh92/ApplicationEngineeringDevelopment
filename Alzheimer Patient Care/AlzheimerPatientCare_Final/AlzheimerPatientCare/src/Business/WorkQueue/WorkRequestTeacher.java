/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import java.util.Date;

/**
 *
 * @author Sheetal
 */
public class WorkRequestTeacher extends WorkRequest{
  private String assignment;
    private String report;
    private Patient patient;
    String problem;
    Date checkupDate;
    String prescription;
    String slotconfirmed;

    public String getSlotconfirmed() {
        return slotconfirmed;
    }

    public void setSlotconfirmed(String slotconfirmed) {
        this.slotconfirmed = slotconfirmed;
    }

    public Date getCheckupDate() {
        return checkupDate;
    }

    public void setCheckupDate(Date checkupDate) {
        this.checkupDate = checkupDate;
    }
    
    
  

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }  
}
