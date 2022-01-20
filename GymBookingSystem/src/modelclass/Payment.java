/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.util.Date;

/**
 *
 * @author Hisyam
 */
public class Payment {
    private int PaymentId;
    private int customerId;
    private int coachId;
    private Date paymentDate;
    private double paymentTotal;
    private String paymentStatus;
    
    public Payment() {
        
    }

    public Payment(int PaymentId, int customerId, int coachId, Date paymentDate, double paymentTotal, String paymentStatus) {
        this.PaymentId = PaymentId;
        this.customerId = customerId;
        this.coachId = coachId;
        this.paymentDate = paymentDate;
        this.paymentTotal = paymentTotal;
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int PaymentId) {
        this.PaymentId = PaymentId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(double paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
}
