public class CreditPaymentService {
    public double calculate(int amountOfCredit, double iR, int timeOfPayment) {

        double iRFormula = (iR / (12*100));
        double iRDegree = Math.pow(iRFormula, timeOfPayment);
        double monthlyPayment = (int) amountOfCredit * iRFormula/(1-(1 + iRDegree)-1);

        return (int) monthlyPayment;
    }

}
