package loanCalculator;

public class WorkerLoan extends LoanCalculatorAbstract{
    public WorkerLoan(int duration, Long amount){
        super(duration, amount);
        this.strategy = Loan.Strategies.EMPLOYMENT_LOAN;
        this.rate = 0.16;
    }
    @Override
    public Loan.LoanType RiskLevel() {
        if(amount > 500000L && duration < 2)
            return Loan.LoanType.HIGH_RISK;
        if(duration > 2)
            return Loan.LoanType.LOW_RISK;
        return Loan.LoanType.HIGH_RISK;
    }
}
