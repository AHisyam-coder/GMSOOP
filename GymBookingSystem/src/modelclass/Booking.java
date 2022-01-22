/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class Booking {
    private String bookingId;
    private String bookingDate;
    private double bookingPrice;
    private String bookingTimeFrom;
    private String bookingTimeTo;
    private String bookingStatus;
    private Payment payment;

    public Booking() {
    }

    public Booking(String bookingId, String bookingDate, double bookingPrice, String bookingTimeFrom, String bookingTimeTo, String bookingStatus, Payment payment) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookingPrice = bookingPrice;
        this.bookingTimeFrom = bookingTimeFrom;
        this.bookingTimeTo = bookingTimeTo;
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

    public String getBookingTimeFrom() {
        return bookingTimeFrom;
    }

    public void setBookingTimeFrom(String bookingTimeFrom) {
        this.bookingTimeFrom = bookingTimeFrom;
    }

    public String getBookingTimeTo() {
        return bookingTimeTo;
    }

    public void setBookingTimeTo(String bookingTimeTo) {
        this.bookingTimeTo = bookingTimeTo;
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
