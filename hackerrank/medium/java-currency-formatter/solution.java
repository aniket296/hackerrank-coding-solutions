
import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        // US
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // India
        DecimalFormat india = (DecimalFormat)
            NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        DecimalFormatSymbols indiaSymbols = india.getDecimalFormatSymbols();
        indiaSymbols.setCurrencySymbol("Rs.");
        india.setDecimalFormatSymbols(indiaSymbols);

        // China
        DecimalFormat china = (DecimalFormat)
            NumberFormat.getCurrencyInstance(Locale.CHINA);

        DecimalFormatSymbols chinaSymbols = china.getDecimalFormatSymbols();
        chinaSymbols.setCurrencySymbol("\uFFE5");
        china.setDecimalFormatSymbols(chinaSymbols);

        // France
        DecimalFormat france = (DecimalFormat)
            NumberFormat.getCurrencyInstance(Locale.FRANCE);

        france.applyPattern("#,##0.00 \u00A4");

        String franceFormatted = france.format(payment);

        // Replace narrow non-breaking space with non-breaking space
        franceFormatted = franceFormatted.replace('\u202F', '\u00A0');

        // Print results
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + franceFormatted);

        sc.close();
    }
}
