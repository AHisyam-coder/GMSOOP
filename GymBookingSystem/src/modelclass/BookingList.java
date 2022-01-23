/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

import java.util.ArrayList;


/**
 *
 * @author Hisyam
 */
public class BookingList {
    private ArrayList<Booking> bookingListInfo;
    
    public BookingList() {
    }

    public BookingList(ArrayList<Booking> bookingListInfo) {
        this.bookingListInfo = bookingListInfo;
    }
    
    public ArrayList<Booking> getBookingListInfo() {
        return bookingListInfo;
    }

    public void setBookingListInfo(ArrayList<Booking> bookingListInfo) {
        this.bookingListInfo = bookingListInfo;
    }

    public void add(Booking book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
