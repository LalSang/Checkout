package src.main.com.checkout.ui;
import java.util.ArrayList;
// This will be the screen where users see 
// When checking out 
public class WelcomeScreen {
    public static String companyName = "Hissho Sushi";
    public ArrayList<String> menu;

    public static String message() {
        String message = "Welcome to " + companyName + " Menu Screen: ";
        return message;
    }

    // Getter for Menu
    // Incase admin want to change and get the menu
    public ArrayList<String> getMenu() {
        return this.menu;
    }

    // Setter for Menu 
    // Incase admin want to set changes to the menu 
    public void setMenu(ArrayList arry) {
        this.menu = arry;
    }


    

    public String toString() {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(message());
    }

}