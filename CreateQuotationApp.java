import java.util.Scanner;

public class CreateQuotationApp {
    public void createQuotation(String myChoice, String[] menu, RepairQuotation repairQuotation, Scanner sc, String[] yesOrNo) {
        String ynChoise = "";
        System.out.println("Welcome to the Computer Repair Shop! ;)");
        System.out.println("What's your name?");

        repairQuotation.setCustomerName(sc.nextLine());
        MenuOptionApp menuOption = new MenuOptionApp();
        System.out.println("********************************************");
        System.out.println("Hello " + repairQuotation.getCustomerName() + ", welcome to our system!");
        System.out.println("********************************************");

        myChoice = menuOption.menuOption(menu, sc, repairQuotation.getQuotationMenuOption());

        do {
            System.out.println("Are you a Student? Y/N");
            ynChoise = sc.nextLine();

            if (ynChoise.equals("y")) {
                repairQuotation.setStudent(true);
                break;
            } else if (ynChoise.equals("n")) {
                repairQuotation.setStudent(false);
                break;
            } else {
                System.out.println("********************************************");
                System.out.println("You need to choose Y or N for your answer.");
                System.out.println("********************************************");
            }
        } while (ynChoise.toLowerCase() != "y" && ynChoise.toLowerCase() != "n");

        do {
            System.out.println("Do you need an express service? Y/N");
            ynChoise = sc.nextLine();

            if (ynChoise.equals("y")) {
                repairQuotation.setExpress(true);
                break;
            } else if (ynChoise.equals("n")) {
                repairQuotation.setExpress(false);
                break;
            } else {
                System.out.println("********************************************");
                System.out.println("You need to choose Y or N for your answer.");
                System.out.println("********************************************");
            }
        } while (ynChoise.toLowerCase() != "y" && ynChoise.toLowerCase() != "n");
    }
}
