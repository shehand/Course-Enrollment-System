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
public class Undergraduate extends Student {

    protected int indexNumber;
    protected String stream;
    protected String zScore;
    protected int islandRank;

    /**
     * @return the indexNumber
     */
    public int getIndexNumber() {
        return indexNumber;
    }

    /**
     * @param indexNumber the indexNumber to set
     */
    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    /**
     * @return the stream
     */
    public String getStream() {
        return stream;
    }

    /**
     * @param stream the stream to set
     */
    public void setStream(String stream) {
        this.stream = stream;
    }

    /**
     * @return the zScore
     */
    public String getzScore() {
        return zScore;
    }

    /**
     * @param zScore the zScore to set
     */
    public void setzScore(String zScore) {
        this.zScore = zScore;
    }

    /**
     * @return the islandRank
     */
    public int getIslandRank() {
        return islandRank;
    }

    /**
     * @param islandRank the islandRank to set
     */
    public void setIslandRank(int islandRank) {
        this.islandRank = islandRank;
    }
}
