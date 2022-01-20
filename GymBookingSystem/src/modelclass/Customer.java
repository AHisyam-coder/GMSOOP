/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
abstract public class Customer {
    protected String custIc;
    protected String custName;
    protected String custPhoneNum;
    protected String custGender;
    protected int custAge;
    protected int promotion;
    protected GymSession gymSession;

    public Customer(String custIc, String custName, String custPhoneNum, String custGender, int custAge, GymSession gymSession) {
        this.custIc = custIc;
        this.custName = custName;
        this.custPhoneNum = custPhoneNum;
        this.custGender = custGender;
        this.custAge = custAge;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public String getCustIc() {
        return custIc;
    }

    public void setCustIc(String custIc) {
        this.custIc = custIc;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhoneNum() {
        return custPhoneNum;
    }

    public void setCustPhoneNum(String custPhoneNum) {
        this.custPhoneNum = custPhoneNum;
    }

    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    public GymSession getGymSession() {
        return gymSession;
    }

    public void setGymSession(GymSession gymSession) {
        this.gymSession = gymSession;
    }
    
    public double gymSessionTotalPayment(){
        return 0;
    }
    
    //POLYMORPHISM
    public void customerType(){
    }
}
