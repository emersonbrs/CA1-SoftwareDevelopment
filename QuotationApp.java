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

        try (Scanner sc = new Scanner(System.in)) {
            RepairQuotation repairQuotation = new RepairQuotation();
            do {
                // Setting the choose using a function to choose an option from the menu and prevent an different option
                myChoice = menuOption.options(menuGeneral, sc, repairQuotation.getGeneralMenuOption());

                switch (myChoice) {
                    case "1":
                        if (total.length < 5) {
                            CreateQuotationApp createQuotation = new CreateQuotationApp();
                            createQuotation.create(myChoice, menuQuotation, repairQuotation, sc, yesOrNo);
                        } else {
                            System.out.println("You have reached the limit of 5 quotations.");
                        }
                        break;
                    case "2":
                        repairQuotation.calculateFinalQuotation();
                        viewQuotationTotalAndSummary();
                        break;
                    case "3":
                        repairQuotation.calculateFinalQuotation();
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