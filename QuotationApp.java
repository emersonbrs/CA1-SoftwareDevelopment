import java.util.Scanner;

public class QuotationApp {
    public static void main(String[] args) {
        String myChoice = "";
        String[] menu = {"1", "2", "3"};
        boolean tryAgain = true;

    
        try (Scanner sc = new Scanner(System.in)) {
            do {
                menuChoice();
                myChoice = sc.nextLine();

                for (String i : menu) {
                    if (myChoice.equals(i)) {
                        tryAgain = false;
                        break;
                    }
                }

                if (tryAgain) {
                    System.out.println("********************************************");
                    System.out.println("You need to choose one option from the menu.");
                    System.out.println("********************************************");
                }
                
            } while (tryAgain);

            System.out.println("You choose.");
        }
    }

    public static void menuChoice() {
        System.out.println("Application Menu for the Repair Shop");
        System.out.println("1. Create a quotation");
        System.out.println("2. View quotation totals and summary");
        System.out.println("3. Exit");
        System.out.print("Choose one option of the menu: ");
    }

    public static void createQuotation () {

    }

    public static void viewQuotationTotalAndSummary() {
        
    }
}