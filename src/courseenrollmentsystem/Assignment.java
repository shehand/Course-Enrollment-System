/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

/**
 *
 * @author Sono
 */
public class Assignment {
    private String subjetcName;
    private String date;
    private String posterID;
    private String place;
    private int assignmentID;

    /**
     * @return the subjetcName
     */
    public String getSubjetcName() {
        return subjetcName;
    }

    /**
     * @param subjetcName the subjetcName to set
     */
    public void setSubjetcName(String subjetcName) {
        this.subjetcName = subjetcName;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the posterID
     */
    public String getPosterID() {
        return posterID;
    }

    /**
     * @param posterID the posterID to set
     */
    public void setPosterID(String posterID) {
        this.posterID = posterID;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the assignmentID
     */
    public int getAssignmentID() {
        return assignmentID;
    }

    /**
     * @param assignmentID the assignmentID to set
     */
    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }
}
