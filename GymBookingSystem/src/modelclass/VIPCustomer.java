/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class VIPCustomer extends Customer {
    
    private final double NEW_VIP_FEE = 20;

    public VIPCustomer(String custIc, String custName, String custPhoneNum, String custGender, int custAge, GymSession gymSession) {
        super(custIc, custName, custPhoneNum, custGender, custAge, gymSession);
    }
    
    public VIPCustomer(){
        
    }
    
    //POLYMORPHISM
    @Override
    public String customerType(){
        return "VIP";
    }
    
    @Override
    public double newCustomerFee(){
        return NEW_VIP_FEE;
    }
    //
    
    @Override
    public int getPromotion() {
        return promotion;
    }

    @Override
    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }
    
    public double newVIPFee(){
        return NEW_VIP_FEE;
    }
}
