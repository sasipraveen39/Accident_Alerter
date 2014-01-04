package accident_alerter_sms;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sasi Praveen
 */
public class SMSEvaluator {

    private static String North = "NULL";
    private static String South = "NULL";
    private static String East = "NULL";
    private static String West = "NULL";
    private static String helmet_id = "";
    private static String Blood = "NULL";
    private static String time = "";
    private static String date = "";

    public static void Evaluate(String Sender, String Message) throws ParseException, URISyntaxException, IOException, InterruptedException {

        //System.out.println(Sender + " " + Message);
        if (Message.contains("Accident")) {
            helmet_id = Sender;
            //System.out.println(Message);
            String[] input = Message.split(" ");
            String URL = "http://maps.google.com/maps?z=16&t=m&q=loc:" + input[3] + "" + input[4];
            input[3] = input[3].substring(0, input[3].length() - 1); //to remove comma after lattitude
            if (input[3].endsWith("N")) {
                North = "\"" + input[3] + "\"";
            } else {
                South = "\"" + input[3] + "\"";
            }
            if (input[4].endsWith("E")) {
                East = "\"" + input[4] + "\"";
            } else {
                West = "\"" + input[4] + "\"";
            }
            Blood = input[6];
            //System.out.println("North:" + North + "\nSouth:" + South + "\nEast:" + East + "\nWest:" + West + "\nBlood group:" + Blood);

            //getting date and time 
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            Date d = new Date();
            date = dateFormat.format(d);
            time = timeFormat.format(d);

            //inserting into database 
            Utilfunctions.executeUpdate("INSERT INTO alerts(date, time, helmet_id, north, south, east, west, blood_group) VALUES ('" + date + "', '" + time + "', '" + helmet_id + "', " + North + ", " + South + ", " + East + ", " + West + ", '" + Blood + "')");

            //displaying map 
            //System.out.println(URL);
            DisplayMap map = new DisplayMap();
            map.show(URL);

            //displaying blood group
            Thread.sleep(2000);
            BloodGroup b = new BloodGroup(Blood);
        }
    }
}
