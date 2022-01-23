/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class Coach {
    private int coachId;
    private String coachName;
    private String coachPhoneNum;
    private String coachEmail;
    private String coachGender;
    private boolean isAvailable;
    private GymSession gymSession;
    
    /*public void display()
    {
        System.out.println("Coach name " + coachName + " "
                           + "and Student name is: "
                           + coachPhoneNum + "" + coachEmail);
        System.out.println();
    }*/

    public Coach(){
        
    }
    public Coach(int coachId, String coachName, String coachPhoneNum, String coachEmail, String coachGender, boolean isAvailable, GymSession gymSession) {
        this.coachId = coachId;
        this.coachName = coachName;
        this.coachPhoneNum = coachPhoneNum;
        this.coachEmail = coachEmail;
        this.coachGender = coachGender;
        this.isAvailable = isAvailable;
        this.gymSession = gymSession;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachPhoneNum() {
        return coachPhoneNum;
    }

    public void setCoachPhoneNum(String coachPhoneNum) {
        this.coachPhoneNum = coachPhoneNum;
    }

    public String getCoachEmail() {
        return coachEmail;
    }

    public void setCoachEmail(String coachEmail) {
        this.coachEmail = coachEmail;
    }

    public String getCoachGender() {
        return coachGender;
    }

    public void setCoachGender(String coachGender) {
        this.coachGender = coachGender;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public GymSession getGymSession() {
        return gymSession;
    }

    public void setGymSession(GymSession gymSession) {
        this.gymSession = gymSession;
    }
}
