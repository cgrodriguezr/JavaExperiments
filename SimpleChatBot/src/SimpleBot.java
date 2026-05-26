import java.util.Scanner;

public class SimpleBot{
    final static String BOT_NAME = "Ryubo";
    final static int BOT_BIRTHYEAR = 2026;

    public static String askName(Scanner sc) {
        System.out.printf("%s: Please, remind me your name.\n", BOT_NAME);
        System.out.print(": ");

        return sc.nextLine();
    }

    public static int guessAge(Scanner sc){
        System.out.printf("%s: Let me guess your age.\n", BOT_NAME);
        System.out.printf("%s: Enter the reminders of dividing your age by 3, 5 and 7.\n", BOT_NAME);

        System.out.print(": ");
        int remainder3 = sc.nextInt();
        System.out.print(": ");
        int remainder5 = sc.nextInt();
        System.out.print(": ");
        int remainder7 = sc.nextInt();

        return (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
    }

    public static void countNumbers(Scanner sc){
        System.out.printf("%s: Now, I will prove to you that I can count to any number you want.\n", BOT_NAME);
        System.out.printf("%s: Please enter the target number to count up to.\n", BOT_NAME);
        System.out.print(": ");
        int maxNumber = sc.nextInt();

        for(int i = 0; i <= maxNumber; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public static void playQuiz(Scanner sc){
        // Generate both the problem and the answer.
        final int maximumNumber = 50;
        int number1 = (int) (Math.random() * maximumNumber) + 1;
        int number2 = (int) (Math.random() * maximumNumber) + 1;
        int correctAnswer = number1 * number2;
        String expression = String.format("%d * %d", number1, number2);

        // Randomly place the correct answer in the choices
        int[] choices = new int[4];
        int randomIndex = (int) (Math.random() * choices.length);
        choices[randomIndex] = correctAnswer;

        // Fill the choices with random numbers based on the correct answer
        for(int i = 0; i < choices.length; i++){
            if(choices[i] != 0) { continue; }
            int multiplier = (int) (Math.random() * 2) + 1;
            int subtrahend = (int) (Math.random() * (correctAnswer * 1.5));
            choices[i] = correctAnswer * multiplier - subtrahend;
        }

        askQuestion(sc, expression, correctAnswer, choices);
    }

    public static void askQuestion(Scanner sc, String expression, int correctAnswer, int[] choices) {
        int userResponse = 0;

        // Display the question with multiple choices
        System.out.printf("%s: Let's test your mathematical skills.\n", BOT_NAME);
        System.out.printf("%s: What is the product of (%s) ?:\n", BOT_NAME, expression);
        char choicePrefix = 'a';
        for (int choice : choices){
            System.out.printf("%c. %d\n", choicePrefix++, choice);
        }

        // The user try to solve the problem
        System.out.printf("%s: Enter the product of the problem to answer the question.\n", BOT_NAME);
        do {
            System.out.print(": ");
            userResponse = sc.nextInt();
            if(userResponse == correctAnswer) { continue; }
            System.out.println("Please, try again.");
        } while (userResponse != correctAnswer);

        System.out.println("Congratulations, have a nice day!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Stage 1
        System.out.printf("Hello! My name is %s.\n", BOT_NAME);
        System.out.printf("I was created in %d\n", BOT_BIRTHYEAR);

        // Stage 2
        String userName = askName(sc);
        System.out.printf("%s: What a great name you have, %s!\n", BOT_NAME, userName);

        // Stage 3
        int guessedAge = guessAge(sc);
        System.out.printf("%s: Your age is %d; that's a good time to start programming!\n", BOT_NAME, guessedAge);

        // Stage 4
        countNumbers(sc);

        // Stage 5
        playQuiz(sc);

        sc.close();
    }
}