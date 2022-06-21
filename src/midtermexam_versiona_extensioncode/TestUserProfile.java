package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 * This class +++ Insert Description Here +++
 * 
 * @author Eric Mogielnicki
 */
public class TestUserProfile {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please choose a genre from the following(Comedy, Drama, Action, Mystery): ");
        String genre = input.nextLine();
        
        UserProfile profile1 = new UserProfile(name,genre);
        
        System.out.print("You profile has been created.");
    }
}
