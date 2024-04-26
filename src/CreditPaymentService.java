public class CreditPaymentService {
    public double calculate(int amountOfCredit, double iR, int timeOfPayment) {

        double iRFormula = (iR / (100 / 12));
        double iRDegree = Math.pow(1 + iRFormula, timeOfPayment);
        double monthlyPayment = (int) (amountOfCredit * (iRFormula + iRFormula / (iRDegree) - 1));
        //double monthlyRate = (int) (amountOfCredit * (iRDegree)/((iRDegree)-1));
        // double monthlyPayment = amountOfCredit * (iRFormula/(1-(iRDegree)-1));

        return (int) monthlyPayment;
    }

}
