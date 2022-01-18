/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymbookingsystem;

/**
 *
 * @author Hisyam
 */
public class Booking {
    private String bookingId;
    private String bookingDate;
    private double bookingPrice;
    private int bookingTime;
    private String bookingStatus;
    private Payment payment;
    private String testMerge;

    public Booking() {
    }
    
    public Booking(String bookingId, String bookingDate, double bookingPrice, int bookingTime, String bookingStatus, Payment payment) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookingPrice = bookingPrice;
        this.bookingTime = bookingTime;
        this.bookingStatus = bookingStatus;
        this.payment = payment;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public int getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(int bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    
}
