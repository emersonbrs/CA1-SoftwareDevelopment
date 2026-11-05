import java.util.Scanner;

public class QuotationApp {
    public static void main(String[] args) {
        String myChoice = "";
        String[] menuGeneral = {"1", "2", "3"};
        String[] menuQuotation = {"1", "2", "3", "4"};
        String[] yesOrNo = {"y", "n"};
        MenuOptionApp menuOption = new MenuOptionApp();

        try (Scanner sc = new Scanner(System.in)) {
            RepairQuotation repairQuotation = new RepairQuotation();
            do {
                myChoice = menuOption.options(menuGeneral, sc, repairQuotation.getGeneralMenuOption());

                switch (myChoice) {
                    case "1":
                        CreateQuotationApp createQuotation = new CreateQuotationApp();
                        createQuotation.create(myChoice, menuQuotation, repairQuotation, sc, yesOrNo);
                        break;
                    case "2":
                        viewQuotationTotalAndSummary();
                        break;
                    case "3":
                        repairQuotation.calculateFinalQuotation();
                        System.out.println("Thanks.");
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