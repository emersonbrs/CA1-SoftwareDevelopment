import java.util.Scanner;

public class QuotationApp {
    public static void main(String[] args) {
        // Declaring variables and the objects
        String myChoice = "";
        String[] menuGeneral = {"1", "2", "3"};
        String[] menuQuotation = {"1", "2", "3", "4"};
        String[] yesOrNo = {"y", "n"};
        MenuOptionApp menuOption = new MenuOptionApp();

        // Arrays to make sure the system is saving a limit of 5 quotations
        RepairQuotation[] quotations = new RepairQuotation[5];
        double[] total = new double[5];
        // variable to count how many quotatins have been added
        int count = 0;

        try (Scanner sc = new Scanner(System.in)) {
            // Creating repairQuotationMenu just to get the menu text and show to the user
            RepairQuotation repairQuotationMenu = new RepairQuotation();
            do {
                // Setting the choose using the function options, from MenuOptionApp to choose an option from the menu and prevent an different option
                myChoice = menuOption.options(menuGeneral, sc, repairQuotationMenu.getGeneralMenuOption());

                switch (myChoice) {
                    case "1":
                        if (count < quotations.length) {
                            // A new object everytime the user call the create option
                            RepairQuotation repairQuotation = new RepairQuotation();

                            // Creating the objetc that we gonna use to create the quotation
                            CreateQuotationApp createQuotation = new CreateQuotationApp();
                            createQuotation.create(myChoice, menuQuotation, repairQuotation, sc, yesOrNo);

                            System.out.println("text" + repairQuotation.getCustomerName());
                            count ++;
                        } else {
                            System.out.println("You have reached the limit of 5 quotations.");
                        }
                        break;
                    case "2":
                        repairQuotationMenu.calculateFinalQuotation();
                        viewQuotationTotalAndSummary();
                        break;
                    case "3":
                        repairQuotationMenu.calculateFinalQuotation();
                        break;
                    default:
                        break;
                }
            } while (!myChoice.equals("3"));
        }
    }

    public static void viewQuotationTotalAndSummary() {
        
    }
}