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

            switch (myChoice) {
                case "1":
                    createQuotation();
                    break;
                case "2":
                    viewQuotationTotalAndSummary();
                    break;
                case "3":
                    System.out.println("Thanks.");
                    break;
            
                default:
                    break;
            }
        }
    }

    public static void menuChoice() {
        System.out.println("Application Menu for the Repair Shop");
        System.out.println("1. Create a quotation");
        System.out.println("2. View quotation totals and summary");
        System.out.println("3. Exit");
        System.out.print("Choose one option of the menu: ");
    }

    public static void createQuotation() {
        try (Scanner sc = new Scanner(System.in)){
            RepairQuotation repairQuotation = new RepairQuotation();

            System.out.println("Welcome to the Computer Repair Shop! ;)");
            System.out.println("What's your name?");

            repairQuotation.setCustomerName(sc.nextLine());
            System.out.println(repairQuotation.getCustomerName());

        }

    }

    public static void viewQuotationTotalAndSummary() {
        
    }
}