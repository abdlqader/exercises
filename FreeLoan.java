package loanCalculator;

public class FreeLoan extends LoanCalculatorAbstract{
    public FreeLoan(int duration, Long amount){
        super(duration, amount);
        this.strategy = Loan.Strategies.FREE_LOAN;
        this.rate = 0.2;
    }
    @Override
    public Loan.LoanType RiskLevel() {
        return  Loan.LoanType.HIGH_RISK;
    }
}
