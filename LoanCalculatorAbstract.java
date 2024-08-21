package loanCalculator;

public abstract class LoanCalculatorAbstract {
    protected int duration = 0; // number of years
    protected Long amount = 0L;
    protected double rate;
    protected Loan.Strategies strategy;
    public LoanCalculatorAbstract(int duration, Long amount){
        setDuration(duration);
        this.amount = amount;
        this.strategy = Loan.Strategies.STUDENT_LOAN;
        this.rate = 0.12;
    }
    public Loan.LoanType RiskLevel() {
        if(amount > 100000L)
            return Loan.LoanType.HIGH_RISK;
        if(amount < 100000L && amount > 50000L)
            return Loan.LoanType.MEDIUM_RISK;
        if(amount < 10000L)
            return Loan.LoanType.LOW_RISK;
        return Loan.LoanType.HIGH_RISK;
    }
    public int getDuration() {
        return 0;
    }
    protected void setDuration(int duration){
        if(duration <= 10 && duration > 0)
            this.duration = duration;
    }
}
