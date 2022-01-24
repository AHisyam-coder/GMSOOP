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

//interface
public class Payment implements PaymentInterface {

    private int PaymentId;
    private int customerId;
    private int coachId;
    private String paymentDate;
    private double paymentTotal;
    private Boolean paymentStatus;

    public Payment() {

    }

    public Payment(int PaymentId, int customerId, int coachId, String paymentDate, double paymentTotal, Boolean paymentStatus) {
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

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(double paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public float calcBookCoach(int timeFrom, int timeTo) {
        float feeBookCoach;

        feeBookCoach = (float) (((timeTo - timeFrom) / 60) * PAYMENT_BOOK_COACH_PER_HOUR);

        return feeBookCoach;
    }

    public float calcGymSession(int hours) {
        float feeGymSession;

        feeGymSession = (float) (hours * PAYMENT_GYM_PER_HOUR);

        return feeGymSession;
    }
}
