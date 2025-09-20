import java.util.Scanner;

public class WiFiTroubleshooter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String response;
        
        // Step 1: Reboot computer
        System.out.println("Reboot the computer and try to connect.");
        System.out.println("Did that fix the problem?");
        response = keyboard.nextLine();
        
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            System.out.println("Problem solved!");
            keyboard.close();
            return;
        }
        
        // Step 2: Reboot router
        System.out.println("Reboot the router and try to connect.");
        System.out.println("Did that fix the problem?");
        response = keyboard.nextLine();
        
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            System.out.println("Problem solved!");
            keyboard.close();
            return;
        }
        
        // Step 3: Check cables
        System.out.println("Make sure the cables between the router and modem are plugged in firmly.");
        System.out.println("Did that fix the problem?");
        response = keyboard.nextLine();
        
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            System.out.println("Problem solved!");
            keyboard.close();
            return;
        }
        
        // Step 4: Move router
        System.out.println("Move the router to a new location and try to connect.");
        System.out.println("Did that fix the problem?");
        response = keyboard.nextLine();
        
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            System.out.println("Problem solved!");
            keyboard.close();
            return;
        }
        
        // Step 5: Get new router (no input prompt needed)
        System.out.println("Get a new router.");
        System.out.println("Problem solved!");
        
        keyboard.close();
