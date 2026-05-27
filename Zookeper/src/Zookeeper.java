import java.util.Scanner;

public class Zookeeper {

    private static void displayWelcomeMessage() {
        System.out.println("""
                I love animals!
                Let's check on the animals...
                The deer looks fine.
                The bat looks happy.
                The lion looks healthy.""");
    }

    private static void askAnimalToPrint(Scanner sc) {
        String userChoice = "dumbValue";
        int camera = 0;
        do {
            displayChannelsMenu();

            System.out.print(":");
            userChoice = sc.nextLine();

            // First part
            if(userChoice.equalsIgnoreCase("exit")) { break;}

            // Second part
            try {
                camera = Integer.parseInt(userChoice) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again");
                continue;
            }

            if(camera < 0 || camera > 5) {
                System.out.println("Invalid number. Please, try again.");
                continue;
            }

            // Third part
            System.out.println(Animals.ANIMALS_ASCII_ART[camera]);

        } while (true);
    }

    private static void displayChannelsMenu() {
        System.out.println("""
                Please enter the number of the habitat you would like to view:
                1. Camel
                2. Lion
                3. Deer
                4. Goose
                5. Bat
                6. Rabbit""");
    }

    private static void displayFinalMessage() {
        System.out.println("""
                ---
                You've reached the end of the program.
                To check another habitat, please restart the watcher.
                See you later!"""
        );
    }

    static void main(String[] args) {
        // Stage 1
        displayWelcomeMessage();

        Scanner sc = new Scanner(System.in);

        // Stage 2, 3 and 4
        askAnimalToPrint(sc);

        displayFinalMessage();

        sc.close();
    }
}
