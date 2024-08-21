package loanCalculator;

public class LoanAsset{
    public static void consoleLog(LoanCalculatorInterface calculator){
        System.out.println("worked ! & duration = " + calculator.getDuration() + " with risk = " + calculator.RiskLevel());
    }
    public static void consoleLog(LoanCalculatorAbstract calculator){
        System.out.println("worked ! & duration = " + calculator.getDuration() + " with risk = " + calculator.RiskLevel());
    }
    public static LoanCalculatorAbstract loanFactory(Loan.Strategies type, int duration, Long amount){
        //pick strategy
        return switch (type){
            case STUDENT_LOAN -> new StudentLoan(duration, amount);
            case EMPLOYMENT_LOAN -> new WorkerLoan(duration, amount);
            case FREE_LOAN -> new FreeLoan(duration, amount);
        };
    }
}
