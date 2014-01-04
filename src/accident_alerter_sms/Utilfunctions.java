package accident_alerter_sms;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sasi Praveen
 */
public class Utilfunctions {

    public static int executeUpdate(String query) {
        int rowsAffected = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbpwd = Utilfunctions.getDbConfig("password");
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accident_alerter", "root", dbpwd);
            }
            PreparedStatement statement;
            statement = con.prepareStatement(query);

            rowsAffected = statement.executeUpdate();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rowsAffected;
    }

    public static String getDbConfig(String field) {
        String value = "";
        try {
            File directory = new File(".");
            String path = directory.getCanonicalPath();
            String s = File.separator;
            FileInputStream fstream = new FileInputStream(path + s + "src" + s + "config" + s + "dbconfig.cfg");

            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                if (strLine.indexOf("password") >= 0 && field.equals("password") == true) {
                    value = strLine.substring(strLine.indexOf('\t') + 1);
                    break;
                }

                if (strLine.indexOf("username") >= 0 && field.equals("username") == true) {
                    value = strLine.substring(strLine.indexOf('\t') + 1);
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return value;
    }

   
    public static void setLocation(JFrame jf) {
        toolkit = Toolkit.getDefaultToolkit();
        dim = toolkit.getScreenSize();

        width = dim.width;
        height = dim.height;

        Dimension dm = jf.getContentPane().getSize();

        int x = (width - dm.width) / 2;
        int y = (height - dm.height) / 2;

        jf.setLocation(x, y);

    }

    public static void setIconImage(JFrame jf) {
        File directory = new File(".");
        try {
            String path = directory.getCanonicalPath();
            String s = File.separator;
            jf.setIconImage(Toolkit.getDefaultToolkit().getImage(path + s + "src" + s + "images" + s + "logo.gif"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unexpected Error. Exiting application");
        }
    }
    private static Toolkit toolkit;
    private static Dimension dim;
    private static int width;
    private static int height;
    private static ResultSet result;
    private static Connection con;
}
