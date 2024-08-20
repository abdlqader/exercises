package loanCalculator;

public abstract class AbstractLoanCalculator {
    private Utils utils;
    public AbstractLoanCalculator(Utils utils){
        this.utils = utils;
    }
    abstract LoanCalculator.LoanType calculate();
    String status(){
        return "abstract default";
    };
    abstract int getDuration();
}
