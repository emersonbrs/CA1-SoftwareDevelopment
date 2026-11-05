import java.util.Scanner;

public class MenuOptionApp {
    public String options(String[] menu, Scanner sc, String menuText) {
        // Declaring variables
        boolean tryAgain = true;
        String myChoice = "";

        // looping until the user choose a valid option
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
                System.out.println("You need to choose a valid option.");
                System.out.println("********************************************");
            }
        } while (tryAgain);
        
        return "";
    }
}
