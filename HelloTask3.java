public class HelloTask3 {

    // Method to compute the final investment value
    public static double computeFinalValue(double principal, double interestRate, int numOfYears) {
        return principal * Math.pow((1 + interestRate), numOfYears);
    }

    // Method to compute principal
    public static double computePrincipal(double finalValue, double interestRate, int numOfYears) {
        return finalValue / Math.pow((1 + interestRate), numOfYears);
    }

    // Method to compute interest rate
    public static double computeInterestRate(double principal, double finalValue, int numOfYears) {
        return Math.pow(finalValue / principal, 1.0 / numOfYears) - 1;
    }

    // Method to compute number of years
    public static double computeYears(double principal, double finalValue, double interestRate) {
        return Math.log(finalValue / principal) / Math.log(1 + interestRate);
    }

    public static void main(String[] args) {

        // --- 1. How much to invest today (P)?
        double neededFinal = 1000.00;
        double rate1 = 0.05;
        int years1 = 4;
        double requiredPrincipal = computePrincipal(neededFinal, rate1, years1);
        System.out.println("1. To have $" + neededFinal + " in " + years1 + " years at 5% interest,");
        System.out.printf("   you should invest: $%.2f\n", requiredPrincipal);

        // --- 2. What interest rate is needed (I)?
        double principal2 = 500.00;
        double final2 = 525.00;
        int years2 = 3;
        double requiredRate = computeInterestRate(principal2, final2, years2);
        System.out.println("2. To grow $500.00 to $525.00 in 3 years,");
        System.out.printf("   you need an interest rate of: %.2f%%\n", requiredRate * 100);

        // --- 3. How many years are needed (Y)?
        double principal3 = 100.00;
        double final3 = 150.00;
        double rate3 = 0.044;
        double requiredYears = computeYears(principal3, final3, rate3);
        System.out.println("3. To grow $100.00 to $150.00 at 4.4% interest,");
        System.out.printf("   you need to invest for: %.2f years\n", requiredYears);
    }
}
