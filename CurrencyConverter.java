import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");

        System.out.print("Enter base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        if (exchangeRate != -1) {
            double convertedAmount = amount * exchangeRate;
            System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
            System.out.println("Conversion Successful!");
        } else {
            System.out.println("Unable to fetch exchange rate. Please try again later.");
        }

        scanner.close();
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        double exchangeRate = -1;
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            exchangeRate = 0.93;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("IDR")) {
            exchangeRate = 16429.0;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            exchangeRate = 83.51; // Updated exchange rate for USD to INR
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            exchangeRate = 1.13;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("IDR")) {
            exchangeRate = 16250.0;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("INR")) {
            exchangeRate = 89.40;
        } else if (baseCurrency.equals("IDR") && targetCurrency.equals("USD")) {
            exchangeRate = 0.000061;
        } else if (baseCurrency.equals("IDR") && targetCurrency.equals("EUR")) {
            exchangeRate = 0.00006;
        } else if (baseCurrency.equals("IDR") && targetCurrency.equals("INR")) {
            exchangeRate = 0.0051;
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("USD")) {
            exchangeRate = 0.012;
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("EUR")) {
            exchangeRate = 0.011;
        } else if (baseCurrency.equals("INR") && targetCurrency.equals("IDR")) {
            exchangeRate = 196.72;
        }
        return exchangeRate;
    }
}