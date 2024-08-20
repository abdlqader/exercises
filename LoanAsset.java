package loanCalculator;

public class LoanAsset{
    public static void consoleLog(LoanCalculatorInterface calculator){
        System.out.println("worked ! & duration = " + calculator.getDuration() + " with risk = " + calculator.RiskLevel());
    }
}
