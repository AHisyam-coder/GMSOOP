/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class Admin {
    private Announcement announcement;
    private Coach coach;
    private String testtest;

    public Admin(Announcement announcement, Coach coach) {
        this.announcement = announcement;
        this.coach = coach;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    
    
}
