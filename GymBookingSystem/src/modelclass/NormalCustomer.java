/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class NormalCustomer extends Customer{
    private final double PAYMENT_EACH_GYM_SESSION = 10;
    
    public NormalCustomer(String custIc, String custName, String custPhoneNum, String custGender, int custAge, GymSession gymSession) {
        super(custIc, custName, custPhoneNum, custGender, custAge, gymSession);
    }
    
    //POLYMORPHISM
    @Override
    public String customerType(){
        return "Normal";
    }
    
    @Override
    public double gymSessionTotalPayment(){
        double total = gymSession.getHours() * PAYMENT_EACH_GYM_SESSION;
        
        return total;
    }
}
