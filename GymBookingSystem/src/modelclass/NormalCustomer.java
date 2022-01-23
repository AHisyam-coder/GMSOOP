/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class NormalCustomer extends Customer {

    private final double NEW_NORMAL_CUST_FEE = 0;

    public NormalCustomer(String custIc, String custName, String custPhoneNum, String custGender, int custAge, GymSession gymSession) {
        super(custIc, custName, custPhoneNum, custGender, custAge, gymSession);
    }

    public NormalCustomer() {
    }

    //POLYMORPHISM
    @Override
    public String customerType() {
        return "Normal";
    }

    @Override
    public double newCustomerFee() {
        return NEW_NORMAL_CUST_FEE;
    }
}
