/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Sono
 */
public class CourseEnrollmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();    
        
        try{
            UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
            mf.setVisible(true);
            mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mf.setResizable(false);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
