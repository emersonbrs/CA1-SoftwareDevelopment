import java.util.Scanner;

public class MenuOptionApp {
    public String menuOption(String[] menu, Scanner sc, String menuText) {
        boolean tryAgain = true;
        String myChoice = "";
        do {
            System.out.print(menuText);
            myChoice = sc.nextLine();

            for (String i : menu) {
                if (myChoice.equals(i)) {
                    tryAgain = false;
                    return myChoice;
                }
            }

            if (tryAgain) {
                System.out.println("********************************************");
                System.out.println("You need to choose one option from the menu.");
                System.out.println("********************************************");
            }
        } while (tryAgain);
        return "";
    }
}
