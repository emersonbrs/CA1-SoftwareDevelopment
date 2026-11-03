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
            myChoice = menuOption.menuOption(menuGeneral, sc, repairQuotation.getGeneralMenuOption());

            switch (myChoice) {
                case "1":
                    CreateQuotationApp createQuotation = new CreateQuotationApp();
                    createQuotation.createQuotation(myChoice, menuQuotation, repairQuotation, sc, yesOrNo);
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

    public static void viewQuotationTotalAndSummary() {
        
    }
}