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

                            quotations[count] = repairQuotation;
                            count ++;
                        } else {
                            System.out.println("********************************************");
                            System.out.println("You have reached the limit of 5 quotations.");
                            System.out.println("********************************************");
                        }
                        break;
                    case "2":
                        double totalQuotations = 0.0;
                        
                        for (int i = 0; i < count; i++) {
                            totalQuotations = totalQuotations + quotations[i].getIndividualTotal();
                        }

                        System.out.println("********************************************");
                        System.out.println("           Repair Service Details           ");
                        System.out.println("********************************************");

                        viewQuotationTotalAndSummary(totalQuotations, quotations, count);
                        
                        System.out.println("********************************************");
                        break;
                    case "3":

                        break;
                    default:
                        break;
                }
            } while (!myChoice.equals("3"));
        }
    }

    public static void viewQuotationTotalAndSummary(double totalQuotations, RepairQuotation[] quotations, int count) {
        double sum = 0.0;
        double avarage = 0.0;
        double highest = quotations[0].getIndividualTotal();

        if (count == 0) {
            System.out.println("No quotations.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Quotation " + (i + 1) + ": " + quotations[i].getCustomerName());
            sum = sum + quotations[i].getIndividualTotal();

            // Highest
            if (quotations[i].getIndividualTotal() > highest) {
                highest = quotations[i].getIndividualTotal();
            }
        }

        avarage = sum / count;

        System.out.println("Number: " + count);
        System.out.printf("Combined value: €%.2f%n", totalQuotations);
        System.out.printf("Highest: €%.2f%n", highest);
        System.out.printf("Avarage: €%.2f%n", avarage);
    }
}
