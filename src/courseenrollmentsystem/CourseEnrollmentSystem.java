/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseenrollmentsystem;

import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;                         // importing java libraries
import javax.swing.JFrame;                                                                  // importing java libraries
import javax.swing.UIManager;                                                               // importing java libraries

/**
 *
 * @author Sono
 */
public class CourseEnrollmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame mf = new MainFrame();                                                     // create inctance to run interface

        try {
            UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());                // load synthetica look and feel for interfaces
            mf.setVisible(true);
            mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mf.setResizable(false);                                                         // resizeble false
        } catch (Exception e) {                                                             // exception handling
            System.out.println(e);
        }
    }

}
