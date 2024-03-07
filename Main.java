import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] roomTypes = {"Premium", "Elite", "Deluxe","Nondeluxe"};
        int[] premiumRooms = { 101,102,103,104,105,106,107,108,109,200};
        int[] eliteRooms = {201,202,203,204,205,206,207,208,209,300};
        int[] deluxeRooms = {301,302,303,304,305,306,307,308,309,400};
        int[]nondeluxeRooms={401,402,403,404,405,406,407,408,409,500};
        System.out.println("Welcome to our Hotel");
        System.out.println("Please choose a room type:");
        for (int i = 0; i < roomTypes.length; i++) {
            System.out.println((i+1) + " " + roomTypes[i]);
        }
        int roomType = sc.nextInt() - 1;
        System.out.println("Available rooms for " + roomTypes[roomType] + ":");
        int[] availableRooms = null;
        switch(roomType) {
            case 0:
                availableRooms = premiumRooms;
                break;
            case 1:
                availableRooms = eliteRooms;
                break;
            case 2:
                availableRooms = deluxeRooms;
                break;
            case 3:
                availableRooms = nondeluxeRooms;
                break;
            default:
                System.out.println("Not Available");
                return;
        }
        for (int i = 0; i < availableRooms.length; i++) {
            System.out.println((i+1) + " Room no " + availableRooms[i]);
        }
        System.out.println("Please choose a room:");
        int room = sc.nextInt() - 1;
        int selectedRoom = availableRooms[room];
        System.out.println("Please enter your personal details:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Phone: ");
        String phone = sc.next();
        System.out.print("Aadharno: ");
        String aadharno= sc.next();
        System.out.print("Address: ");
        String address=sc.next();
        System.out.println("Thank you for Booking, " + name+" " );
        System.out.println("Your booking details:");
        System.out.println("Room type: " + roomTypes[roomType]);
        System.out.println("Room number: " + selectedRoom);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Aadharno: "+aadharno);
        System.out.println("Address: "+address);
        System.out.println("Thanks for your booking!!!");
    }
}
