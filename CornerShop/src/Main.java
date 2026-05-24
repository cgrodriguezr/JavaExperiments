import java.util.Scanner;

class Main{

    public static void displayItemsWithMoney(String[] itemsNames, double[] money){
        for(int i = 0; i < itemsNames.length; i++){
            System.out.printf("%s: $%.2f\n", itemsNames[i], money[i]);
        }
    }

    public static double calculateTotalRevenue(double[] incomes){
        double revenue = 0;
        for(double income : incomes){
            revenue += income;
        }

        return revenue;
    }

    public static double calculateNetIncome(double revenue){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        System.out.print("> ");
        double staffExpenses = scanner.nextDouble();

        System.out.println("Other expenses:");
        System.out.print("> ");
        double otherExpenses = scanner.nextDouble();

        double totalExpenses = staffExpenses + otherExpenses;
        scanner.close();

        return revenue - totalExpenses;
    }

    public static void main(String[] args){
        final String[] ITEMS = new String[] {"Bubblegum", "Toffee", "Ice cream", "Milk chocolate", "Doughnut", "Pancake"};
        final double[] PRICES = new double[] {2.0, 0.2, 5.0, 4.0, 2.5, 3.2};


        // Stage 1: Display items with their respective prices
        System.out.println("Prices:");
        displayItemsWithMoney(ITEMS, PRICES);

        System.out.println();

        // Stage 2: Display the total revenue
        final double[] MONTH_INCOME = new double[] {202, 118, 2250, 1680, 1075, 80};
        double revenue = calculateTotalRevenue(MONTH_INCOME);

        System.out.println("Earned amount:");
        displayItemsWithMoney(ITEMS, MONTH_INCOME);
        System.out.printf("\nIncome: $%.1f\n", revenue);

        // Stage 3: Display the net income
        double netIncome = calculateNetIncome(revenue);
        System.out.printf("Net income: $%.1f", netIncome);
    }
}