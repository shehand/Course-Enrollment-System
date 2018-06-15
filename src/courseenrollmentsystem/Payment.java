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
public class Payment {

    private int payID;
    private String regNumber;
    private String amount;
    private int semester;
    private String course;

    /**
     * @return the payID
     */
    public int getPayID() {
        return payID;
    }

    /**
     * @param payID the payID to set
     */
    public void setPayID(int payID) {
        this.payID = payID;
    }

    /**
     * @return the regNumber
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * @param regNumber the regNumber to set
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

}
