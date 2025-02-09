/*

Swirled Spoon

- contains the best frozen yogurt and healthy alternative as compared to do the practical dairy filled ice creams.
- our products are chocolate, strawberry, vanilla and Neapolitan
- open from 1 pm to 6 pm (D) and 9pm for instore
- note for professor: I had to branch it all in one file for some reason on VS Studios due to random errors I would incur if it wasn't.


*/



package storefront; // package all the classes in specific folder

// Scanner Import for user input
import java.util.Scanner;

interface Order { // choice of delivery
	public void processOrd(); // processing order message
	public double extFees(double Extra); // the extra fees for delivery or in person
}

interface Feedback {
    void cFeedback(); // for feedback, not really necessary just added for interfaces
}

class CustomerFeed implements Feedback{
    public void cFeedback(){ // feedback that implements interface
        Scanner rate = new Scanner(System.in);
        System.out.println("How would you rate your online Swirled Spoon experience (1-5)?");
        int UserR = rate.nextInt(); // takes their rating
        System.out.println("Thank you for your feedback!");
    }
}

class DeliveryEmp implements Order { // choice of delivery
	public void processOrd(){
	System.out.println("Your order is currently being processed in real time by our employee Tom and will be delivered by him. . .");
	}

	
	public double extFees(double Extra){ // extra fees since realisitically, delivery would not be free
		double deliveryFee = 5;; // base delivery is $5
		return deliveryFee;
	}
}


class InPersonEmp implements Order{ // choice of delivery
	public void processOrd(){
	System.out.println("Your order is currently being processed in real time by our employee Bianca and will be your guide in-store for pickup. . .");
	}

	
	public double extFees(double Extra){
		double Inpersonfee = 0; // base delivery is $0 since in person
		return Inpersonfee;
	}
}

class Swirls { // base class to prove inheritance
    // initialize variables
    protected String flavor;
    protected double price;
    protected String desc;

    // a default constructor
    public Swirls() {
        flavor = "n/a"; // customer flavor
        price = 0.00; // base price
        desc = "n/a"; // initial description
    }
    // constructor
    public Swirls(String Cflav, double Bprice, String Idesc){
        flavor = Cflav; // customer flavor
        price = Bprice; // base price
        desc = Idesc; // initial description
    }

    public void ReadI(){ // displays general info
        System.out.println("This swirl is called: " + flavor);
        System.out.println("Priced at: $" + price);
        System.out.println("Owner Desc: " + desc);
    }

    // solo functions to read out individual variables
    public void ReadFlav(){ // prints flavor
        System.out.println(flavor);
    }

    public void ReadPri(){ // prints price
        System.out.println(price);
    }
    
    public double getPri(){ // to relay price for total income later
        return price;
    }
    public void ReadDes(){ // prints description
        System.out.println(desc);
    }
}

// all flavor subclasses
class Vswirl extends Swirls { // vanilla swirl subclass
    public Vswirl() {
        flavor = "Cream Frost Vanilla";
        price = 28.00;
        desc = "Our Cream Frost Vanilla is filled with scents of Vanilla Bean, Natural Agave and Hints of Tropical Staples.\nPriced at $" + price + " with freshly baked bread cone. ";
    }
}

class Sswirl extends Swirls {  // strawberry swirl subclass
    public Sswirl() {
        flavor = "Strawberry Dew Delight";
        price = 28.00;
        desc = "Our Strawberry Dew Delight produces a reminiscent feeling of Innocence; dribbled with our finest Handmade Strawberry Syrups and Melon Shreds.\nPriced at $" + price + " with freshly baked bread cone. ";
    }
}

class Cswirl extends Swirls { // chocolate swirl subclass
    public Cswirl() {
        flavor = "Cocoa Chocolate Fondue";
        price = 28.00;
        desc = "The Cocoa Chocolate Fondue is a classic and old time flavor with sprinkles of 18k Gold Flakes, Sweetened Caviar along with Truffle.\nPriced at $" + price + " with freshly baked bread cone. ";
    }
}
class VSCswirl extends Swirls { // neopolitan swirl subclass
    public VSCswirl() {
        flavor = "Neapolitan Storm";
        price = 30.00;
        desc = "The Neapolitan Storm is an explosion of each flavor, imitating and evoking the infamous Ratatouille flavor burst. \nPriced at $" + price + " with sugar rimmed agave and freshly baked bowl.";
    }
}

class Customer { // customer information class
    private String customer_name;
    private String email;
    private String phone_number;
    private String c_address;

    Customer() { // default constructor
        customer_name = "N/A";
        email = "N/A";
        phone_number = "N/A";
        c_address = "N/A";
    }
    Customer(String Cname, String Cemail, String Cnum, String Cadd) { // intializes all variables 
        customer_name = Cname;
        email = Cemail;
        phone_number = Cnum;
        c_address = Cadd;
    }

    void DispDetails() { // displays the customers info
        System.out.println(customer_name);
        System.out.println(email);
        System.out.println(phone_number);
        System.out.println(c_address);
    }
}

// main class where everything will run
public class MainMenu{
	
	public static void main(String[] args) {
        // creating and inheriting instances of the subclass's 
        Swirls vanilla = new Vswirl();
        Swirls strawberry = new Sswirl();
        Swirls chocolate = new Cswirl();
        Swirls neapolitan = new VSCswirl();
        Customer cInfo[] = new Customer[1]; // one user entry & one dimensonal array
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome to Swirled Spoon!\nWe are devoted to incorporating health and happiness into each delicious, top-quality swirl that has been reported to produce results of age reduction, weight loss, and refining wrinkles!\nOur in-store pickup time ranges from 1:00 PM to 9:00 PM and delivery ends at 6:00 PM.");
		
		System.out.println("\nWe currently offer four award-winning yogurt flavors. . .\nWhat can we swirl up for you today?\n");
		

        int choice = 0 ; // for menu option

        do { // incorporating a do while to loop until user desires to cancel order
            System.out.println("\nPlease enter the number corresponding to your selection:\n");
            System.out.print("1: ");
            vanilla.ReadFlav();
            System.out.print("2: ");
            chocolate.ReadFlav();
            System.out.print("3: ");
            strawberry.ReadFlav();
            System.out.print("4: ");
            neapolitan.ReadFlav();
            System.out.println("5: Ready to Order ->");
            System.out.println("6: Cancel\n");


            // input validation incase entered out of range
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.\n");
                continue; // skip to the next iteration
            }
			System.out.println("___________________________________________________________________________");
			System.out.println("\nInformation:");
            switch (choice) { // switchcase 
                case 1: // for all the common descriptions of each swirl
                    vanilla.ReadDes();
					break;
                case 2:
                    chocolate.ReadDes();
                    break;
                case 3:
                    strawberry.ReadDes();
                    break;
                case 4:
                    neapolitan.ReadDes();
                    break;
                case 5: // if user is ready to order
                    System.out.println("Proceeding to order placement...");
                    double totalAmt = 0.0;
					System.out.println("We will be asking a series of questions to properly complete your order at Swirled Spoon.\n");
					Scanner schedule = new Scanner(System.in);
                    System.out.println("What time will you be picking up/expecting delivery for the swirls? Remember, Delivery is from 1-6 pm and Pickup is to 9 pm. (Enter only numbers) \n");
                    int transportation = Integer.parseInt(sc.nextLine());
					System.out.println("Were you planning on doing pickup or delivery today? (P - Pickup / D - delivery) \n");
					char PorD; // p or d


					PorD = schedule.next().charAt(0);
					if((PorD == 'p' || PorD == 'P') && transportation >= 1 && transportation <= 9){
                        InPersonEmp Iorder = new InPersonEmp();  // Create an InPersonEmp object
                        Iorder.processOrd();
                        System.out.println("Since you are in-person your additonal fee is: $" + Iorder.extFees(PorD));
                        totalAmt += Iorder.extFees(PorD);
					}
					else if((PorD == 'd' || PorD == 'D') && transportation >= 1 && transportation <= 6){
                        DeliveryEmp Dorder = new DeliveryEmp();
                        Dorder.processOrd();
                        System.out.println("Since you are delivery your additonal fee is: $" + Dorder.extFees(PorD));
                        totalAmt += Dorder.extFees(PorD);
					}
                    else{
                        System.out.println("Oh no! Your choice was invalid. . . Thank you for stopping by Swirled Spoons!");
                        System.exit(0);
                    }



                    // utilizing class
                    System.out.println("We operate on a loyalty-based system here. Could I have your first name?");
                    Scanner info = new Scanner(System.in); 
                    String Fname = info.nextLine();         // input
                    
                    System.out.println("Where can we email you?");
                    String email = info.nextLine();         // email
                    
                    System.out.println("Please enter your phone number (no spaces or dashes):");
                    String phoneN = info.nextLine();        // phone number

                    System.out.println("Please enter a valid address !");
                    String address = info.nextLine();        // phone number
                    
                    cInfo[0] = new Customer(Fname,email,phoneN,address); // intiializes
                    System.out.println("\n___________________________________________________________________________");
                    System.out.println("This was all the information you typed for sign up! Thank you " + Fname + ".");
                    cInfo[0].DispDetails();
                    System.out.println("___________________________________________________________________________\n");

                    System.out.println("Order Screen: "); // order summary input
                    System.out.println("How many Cream Frost Vanilla did you want ? Priced @ $28.00");
                    double vQuant = sc.nextInt();
                    totalAmt += vanilla.getPri() * vQuant;
                    System.out.println("How many Cocoa Chocolate Fondue did you want ? Priced @ $28.00");
                    double cQuant = sc.nextInt();
                    totalAmt += chocolate.getPri() * cQuant;
                    System.out.println("How many Strawberry Dew Delight did you want ? Priced @ $28.00");
                    double sQuant = sc.nextInt();
                    totalAmt += strawberry.getPri() * sQuant;
                    System.out.println("How many Neapolitan Storm did you want ? Priced @ $30.00");
                    double nQuant = sc.nextInt();
                    totalAmt += neapolitan.getPri() * nQuant;


                    System.out.println("ORDER SUMMARY: "); // final order summary
                    System.out.println("You purchased Cream Frost Vanilla " + vQuant + " times.");
                    System.out.println("You purchased Cocoa Chocolate Fondue " + cQuant + " times.");
                    System.out.println("You purchased Strawberry Dew Delight " + sQuant + " times.");
                    System.out.println("You purchased Neapolitan Storm " + nQuant + " times.");
                    System.out.println("Your entire total was: $" + totalAmt + ".");
                    System.out.println("The estimated delivery/ready for pick-up time will be 30 minutes from now. Thank you for your purchase, and we look forward to your results with our swirl benefits, " + Fname + "!");
                    Feedback UserFeed = new CustomerFeed();
                    UserFeed.cFeedback();
                    
                    choice = 6;
                    break;
                case 6:
                    System.out.println("Thank you for stopping by. Have a swirly day!"); // goodbye message
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 6.\n");
            }
			System.out.println("___________________________________________________________________________");
            for(int i =0;i<6;i++){ // end screen
                System.out.print("Swirled!  ");
            }
        } while (choice != 6); // loop continues until the user chooses to Cancel (6)
	}
}


