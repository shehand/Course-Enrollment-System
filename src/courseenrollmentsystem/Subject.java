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
public class Subject {

    private String name;
    private String subCode;
    private int credits;
    private int semester;
    private String course;
    private int courseFee;
    private String compulsoraTag;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the subCode
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * @param subCode the subCode to set
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
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
     * @param credits the credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * @return the credits
     */
    public int getCredits() {
        return credits;
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

    /**
     * @return the courseFee
     */
    public int getCourseFee() {
        return courseFee;
    }

    /**
     * @param courseFee the courseFee to set
     */
    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    /**
     * @return the compulsoraTag
     */
    public String getCompulsoraTag() {
        return compulsoraTag;
    }

    /**
     * @param compulsoraTag the compulsoraTag to set
     */
    public void setCompulsoraTag(String compulsoraTag) {
        this.compulsoraTag = compulsoraTag;
    }

    /**
     * @return the courseFee
     */
}
