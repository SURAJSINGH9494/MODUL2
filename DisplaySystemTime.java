package surajapplication;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplaySystemTime {
    public static void main(String[] args) {
        // Get the current system time
        LocalTime currentTime = LocalTime.now();
        
        // Format the time as HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        // Display the formatted time
        System.out.println("Current system time: " + formattedTime);
    }
}
