/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class GymSession {
    private int GymSessionId;
    private Payment payment;
    private int hours;
    
    public GymSession() {
    }

    public GymSession(int GymSessionId, Payment payment, int hours) {
        this.GymSessionId = GymSessionId;
        this.payment = payment;
        this.hours = hours;
    }

    public int getGymSessionId() {
        return GymSessionId;
    }

    public void setGymSessionId(int GymSessionId) {
        this.GymSessionId = GymSessionId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
