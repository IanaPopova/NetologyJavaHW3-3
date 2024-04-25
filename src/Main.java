public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1_000_000;
        double iR = 9.99;
        int timeOfPayment = 24;
       double monthlyPayment = (int) service.calculate(amountOfCredit, iR, timeOfPayment);
        System.out.println(monthlyPayment);

    }
}
