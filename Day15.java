// I Simply Calculated a Avg Engineering Student Total Money Spent For There Engineering life.....


class TotalMoneySpent {
    int collegeFees;
    int monthlyRent;
    int extraAmount;
    int calculateYearlyRent() {
        return monthlyRent * 12;
    }
    int calculateYearlyExtraAmount() {
        return extraAmount * 12;
    }
    int calculateTotalForOneYear() {
        return collegeFees + calculateYearlyRent() + calculateYearlyExtraAmount();
    }
    int calculateTotalForFourYears() {
        return calculateTotalForOneYear() * 4;
    }
}
public class MyAmountCalc {
    public static void main(String[] args) {
        TotalMoneySpent total = new TotalMoneySpent();
        total.collegeFees = 117000;
        total.monthlyRent = 2000;
        total.extraAmount = 1000;
        System.out.println("Yearly Rent: " + total.calculateYearlyRent());
        System.out.println("Yearly Extra: " + total.calculateYearlyExtraAmount());
        System.out.println("Total For One Year: " + total.calculateTotalForOneYear());
        System.out.println("Total For 4 Years: " + total.calculateTotalForFourYears());
    }
}
