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
    private int hours;
    
    public GymSession() {
    }

    public GymSession(int GymSessionId, int hours) {
        this.GymSessionId = GymSessionId;
        this.hours = hours;
    }

    public int getGymSessionId() {
        return GymSessionId;
    }

    public void setGymSessionId(int GymSessionId) {
        this.GymSessionId = GymSessionId;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
