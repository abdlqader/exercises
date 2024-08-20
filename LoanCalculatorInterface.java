package loanCalculator;

public interface LoanCalculatorInterface {
    Utils utilz = new Utils();
    String test = "test";
    LoanCalculator.LoanType calculate();
    default String status(){
        return test;
    };
    int getDuration();
}
