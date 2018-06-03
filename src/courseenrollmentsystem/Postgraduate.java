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
public class Postgraduate extends Student{
    protected String institute;
    protected int yoc;
    protected String qualification;

    /**
     * @return the institute
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * @param institute the institute to set
     */
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     * @return the yoc
     */
    public int getYoc() {
        return yoc;
    }

    /**
     * @param yoc the yoc to set
     */
    public void setYoc(int yoc) {
        this.yoc = yoc;
    }

    /**
     * @return the qualification
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * @param qualification the qualification to set
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
