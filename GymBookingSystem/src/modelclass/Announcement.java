/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelclass;

/**
 *
 * @author Hisyam
 */
public class Announcement {
    private String announceId;
    private String announceMessage;
    private String announceTitle;
    private String announceDuration;

    public Announcement(String announceId, String announceMessage, String announceTitle, String announceDuration) {
        this.announceId = announceId;
        this.announceMessage = announceMessage;
        this.announceTitle = announceTitle;
        this.announceDuration = announceDuration;
    }

    public String getAnnounceId() {
        return announceId;
    }

    public void setAnnounceId(String announceId) {
        this.announceId = announceId;
    }

    public String getAnnounceMessage() {
        return announceMessage;
    }

    public void setAnnounceMessage(String announceMessage) {
        this.announceMessage = announceMessage;
    }

    public String getAnnounceTitle() {
        return announceTitle;
    }

    public void setAnnounceTitle(String announceTitle) {
        this.announceTitle = announceTitle;
    }

    public String getAnnounceDuration() {
        return announceDuration;
    }

    public void setAnnounceDuration(String announceDuration) {
        this.announceDuration = announceDuration;
    }
    
    
}
