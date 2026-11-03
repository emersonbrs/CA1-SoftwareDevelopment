import java.util.Scanner;

public class QuotationApp {
    public static void main(String[] args) {
        String myChoice = "";
        String[] menuGeneral = {"1", "2", "3"};
        String[] menuQuotation = {"1", "2", "3", "4"};
        MenuOptionApp menuOption = new MenuOptionApp();

        try (Scanner sc = new Scanner(System.in)) {
            RepairQuotation repairQuotation = new RepairQuotation();
            myChoice = menuOption.menuOption(menuGeneral, sc, repairQuotation.getGeneralMenuOption());

            switch (myChoice) {
                case "1":
                    createQuotation(myChoice, menuQuotation, repairQuotation, sc);
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

    public static void createQuotation(String myChoice, String[] menu, RepairQuotation repairQuotation, Scanner sc) {
        System.out.println("Welcome to the Computer Repair Shop! ;)");
        System.out.println("What's your name?");

        repairQuotation.setCustomerName(sc.nextLine());
        MenuOptionApp menuOption = new MenuOptionApp();
        System.out.println("********************************************");
        System.out.println("Hello " + repairQuotation.getCustomerName() + ", welcome to our system!");
        System.out.println("********************************************");
        myChoice = menuOption.menuOption(menu, sc, repairQuotation.getQuotationMenuOption());
    }

    public static void viewQuotationTotalAndSummary() {
        
    }
}