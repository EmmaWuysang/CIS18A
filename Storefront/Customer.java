/*

Swirl Spoon

- contains the best frozen yogurt and healthy alternative as compared to do the practical dairy filled ice creams.
- our products are chocolate, strawberry, vanilla and Neapolitan
- open from 1 pm to 6 pm.

*/



package storefront; // package all the classes in specific folder

// Scanner Import for user input
import java.util.Scanner;

class Customer {
    private String customer_name;
    private String email;
    private double phone_number;

    Customer(String Cname, String Cemail, double Cnum) {
        customer_name = Cname;
        email = Cemail;
        phone_number = Cnum;
    }

    void DispDetails() { // displays the customers info
        System.out.println(customer_name);
        System.out.println(email);
        System.out.println(phone_number);
    }
}

// main class where everything will run
public class MainMenu{
	
	public static void main(String[] args) {
        Customer cInfo[] = new Customer[1]; // one user entry & one dimensonal array
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome to Swirled Spoon!\nWe are devoted to incorporating health and happiness into each delicious, top-quality swirl!\nOur in-store pickup time ranges from 1:00 PM to 9:00 PM and delivery ends at 6:00 PM.");
		
		System.out.println("\nWe currently offer four award-winning yogurt flavors. . .\nWhat can we swirl up for you today?\n");
		

        int choice = 0 ; // for menu option

        do { // incorporating a do while to loop until user desires to cancel order
            System.out.println("\nPlease enter the number corresponding to your selection:\n");
            System.out.println("1: Cream Frost Vanilla");
            System.out.println("2: Cocoa Chocolate Fondue");
            System.out.println("3: Strawberry Dew Delight");
            System.out.println("4: Neapolitan Storm");
            System.out.println("5: Ready to Order ->");
            System.out.println("6: Cancel\n");

            // Input validation incase entered out of range
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.\n");
                continue; // Skip to the next iteration
            }
			System.out.println("___________________________________________________________________________");
			System.out.println("\nInformation:");
            switch (choice) { // switchcase 
                case 1:
                    System.out.println("Our Cream Frost Vanilla is filled with scents of Vanilla Bean, Natural Agave and Hints of Tropical Staples.\nPriced at $28 with freshly baked bread cone. ");
					break;
                case 2:
                    System.out.println("The Cocoa Chocolate Fondue is a classic and old time flavor with sprinkles of 18k Gold Flakes, Sweetened Caviar along with Truffle.\nPriced at $28 with freshly baked bread cone.");
                    break;
                case 3:
                    System.out.println("Our Strawberry Dew Delight produces a reminiscent feeling of Innocence; dribbled with our finest Handmade Strawberry Syrups and Melon Shreds.\nPriced at $28 with freshly baked bread cone.");
                    break;
                case 4:
                    System.out.println("The Neapolitan Storm is an explosion of each flavor, imitating and evoking the infamous Ratatouille flavor burst. \nPriced at $30 with sugar rimmed agave and freshly baked bowl.");
                    break;
                case 5:
					float ETime = 0; // expected time
                    System.out.println("Proceeding to order placement...");
					System.out.println("We will be asking a series of questions to properly complete your order at Swirled Spoon.\n");
					Scanner schedule = new Scanner(System.in);
					System.out.println("Were you planning on doing pickup or delivery today? (P - Pickup / D - delivery) \n");
					char PorD; // p or d
					PorD = schedule.next().charAt(0);
					if(PorD == 'p' || PorD == 'P' ){
						System.out.println("IM IN! P");
                        
						//inheritance worker xxxxxxxxx
					}
					else if(PorD == 'd' || PorD == 'D'){
						System.out.println("IM IN! DAYYYY");
                        
						// inheritance worker xxxxxxxxxx
					}
                    else{
                        System.out.println("Oh no! Your choice was invalid. . . Thank you for stopping by Swirled Spoons!");
                        System.exit(0);
                    }
                    // utilizing class
                    System.out.println("We operate on a loyalty-based system here. Could I have your first name?");
                    Scanner info = new Scanner(System.in);  // New Scanner instance
                    String Fname = info.nextLine();         // Use 'info' for input
                    
                    System.out.println("Where can we email you?");
                    String email = info.nextLine();         // Capturing the email
                    
                    System.out.println("Please enter your phone number (no spaces or dashes):");
                    String phoneN = info.nextLine();        // Store phone number as String
                    
                    cInfo[0] = new Customer(Fname,email,phoneN);
                    cInfo[0].DispDetails();

                    break;
                case 6:
                    System.out.println("Thank you for stopping by. Have a swirly day! 😊");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 6.\n");
            }
			System.out.println("___________________________________________________________________________");
        } while (choice != 6); // Loop continues until the user chooses to Cancel (6)
	}
}


