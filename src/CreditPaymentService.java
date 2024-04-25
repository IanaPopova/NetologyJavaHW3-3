public class CreditPaymentService {
    double iR;
    int timeOfPayment;

    public double calculate(int amountOfCredit, double iR, int timeOfPayment) {

        double iRFormula = iR / 100 / timeOfPayment;
        double iRDegree = Math.pow(iRFormula, timeOfPayment);
        double monthlyPayment = (int) (amountOfCredit * (iRFormula + iRFormula / (1 + iRDegree) - 1));

        return (int) monthlyPayment;
    }

}
