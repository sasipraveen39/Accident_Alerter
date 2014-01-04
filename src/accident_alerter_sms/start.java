/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accident_alerter_sms;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Sasi Praveen
 */
public class start {
    
    public static void main(String args[]){
        
        Properties props = new Properties();
        props.put("logoString","");
        HiFiLookAndFeel.setCurrentTheme(props);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        }
        SetPortForm sf = new SetPortForm();
        Utilfunctions.setIconImage(sf);
        Utilfunctions.setLocation(sf);
        sf.setVisible(true);
        
    }
    
}
