import java.util.Scanner;

public class CreateQuotationApp {
    public void create(String myChoice, String[] menu, RepairQuotation repairQuotation, Scanner sc, String[] yesOrNo) {
        String ynChoise = "";
        MenuOptionApp menuOption = new MenuOptionApp();
        
        System.out.println("Welcome to the Computer Repair Shop! ;)");
        System.out.println("What's your name?");

        repairQuotation.setCustomerName(sc.nextLine());
        System.out.println("********************************************");
        System.out.println("Hello " + repairQuotation.getCustomerName() + ", welcome to our system!");
        System.out.println("********************************************");

        myChoice = menuOption.options(menu, sc, repairQuotation.getQuotationMenuOption());
        repairQuotation.setServiceNumber(Integer.parseInt(myChoice));
        
        do {
            System.out.println("Are you Student? Y/N");
            ynChoise = sc.nextLine();

            if (ynChoise.toLowerCase().equalsIgnoreCase("y")) {
                repairQuotation.setStudent(true);
                break;
            } else if (ynChoise.equalsIgnoreCase("n")) {
                repairQuotation.setStudent(false);
                break;
            } else {
                System.out.println("********************************************");
                System.out.println("You need to choose Y or N for your answer.");
                System.out.println("********************************************");
            }
        } while (!ynChoise.toLowerCase().equalsIgnoreCase("y") && !ynChoise.toLowerCase().equalsIgnoreCase("n"));

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
        } while (!ynChoise.toLowerCase().equalsIgnoreCase("y") && !ynChoise.toLowerCase().equalsIgnoreCase("n"));
        
        System.out.println("********************************************");
        System.out.println("Quotation added. ;)");
        System.out.println("********************************************");
    }
}
