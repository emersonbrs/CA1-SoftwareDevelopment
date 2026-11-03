import java.util.Scanner;

public class CreateQuotationApp {
    public void createQuotation(String myChoice, String[] menu, RepairQuotation repairQuotation, Scanner sc) {
        System.out.println("Welcome to the Computer Repair Shop! ;)");
        System.out.println("What's your name?");

        repairQuotation.setCustomerName(sc.nextLine());
        MenuOptionApp menuOption = new MenuOptionApp();
        System.out.println("********************************************");
        System.out.println("Hello " + repairQuotation.getCustomerName() + ", welcome to our system!");
        System.out.println("********************************************");
        myChoice = menuOption.menuOption(menu, sc, repairQuotation.getQuotationMenuOption());
    }
}
