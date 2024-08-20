package loanCalculator;

public class LoanAsset {
//    private LoanCalculatorInterface calculator;
//    public LoanAsset(LoanCalculatorInterface calculator){
//        this.calculator = calculator;
//    }

    public static void consoleLog(LoanCalculatorInterface calculator){
        System.out.println("worked ! & duration = " + calculator.getDuration() + " with risk = " + calculator.calculate());
        System.out.println("status is " + calculator.status());
    }


}
