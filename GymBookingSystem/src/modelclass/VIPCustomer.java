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

    //private final double PAYMENT = 100;
    private final double PAYMENT_EACH_GYM_SESSION = 8;
    private final double NEW_VIP_FEE = 20;

    public VIPCustomer(String custIc, String custName, String custPhoneNum, String custGender, int custAge, GymSession gymSession) {
        super(custIc, custName, custPhoneNum, custGender, custAge, gymSession);
    }
    
    //POLYMORPHISM
    @Override
    public void customerType(){
        System.out.println("VIP Customer"); 
    }
    
    @Override
    public int getPromotion() {
        return promotion;
    }

    @Override
    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }
    
    /*public double newPromoPrice(){
        double promoPrice;
        
        switch (promotion) {
            case 1:
                promoPrice = PAYMENT - 10;
                break;
            case 2:
                promoPrice = PAYMENT - 15;
                break;
            default:
                promoPrice = PAYMENT - 20;
                break;
        }
        return promoPrice;
    }*/
    
    //POLYMORPHISM
    @Override
    public double gymSessionTotalPayment(){
        double total = gymSession.getHours() * PAYMENT_EACH_GYM_SESSION;
        
        return total;
    }
    
    public double newVIPFee(){
        return NEW_VIP_FEE;
    }
}
