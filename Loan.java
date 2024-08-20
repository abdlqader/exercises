package loanCalculator;

public class Loan implements LoanCalculatorInterface {
    private int duration = 0; // number of years
    private Long amount = 0L;
    private double rate;
    private Strategies strategy = Strategies.FREE_LOAN;
    public Loan workerLoanCreation(int duration, Long amount){
        setDuration(duration);
        this.amount = amount;
        this.strategy = Strategies.EMPLOYMENT_LOAN;
        this.rate = 0.16;
        return this;
    }
    //this is for free loans
    public Loan freeLoanCreation(int duration, Long amount){
        setDuration(duration);
        this.amount = amount;
        this.strategy = Strategies.FREE_LOAN;
        this.rate = 0.2;
        return this;
    }
    public Loan studentLoan(int duration, Long amount){
        setDuration(duration);
        this.amount = amount;
        this.strategy = Strategies.STUDENT_LOAN;
        this.rate = 0.12;
        return this;
    }
    public Loan(){}

    public Loan factoryBuilder(Strategies type){
        if(type.equals(Strategies.STUDENT_LOAN))
            return studentLoan(3,10000L);
        if(type.equals(Strategies.EMPLOYMENT_LOAN))
            return workerLoanCreation(3,10000L);
        if(type.equals(Strategies.FREE_LOAN))
            return freeLoanCreation(3,10000L);

        return this;
    }

    private void setDuration(int duration){
        if(duration <= 10 && duration > 0)
            this.duration = duration;
    }
    @Override
    public  int getDuration(){
        return this.duration;
    }

    @Override
    public LoanType RiskLevel(){
        if(this.strategy.equals(Strategies.STUDENT_LOAN)){
            if(amount > 100000L)
                return LoanType.HIGH_RISK;
            if(amount < 100000L && amount > 50000L)
                return LoanType.MEDIUM_RISK;
            if(amount < 10000L)
                return LoanType.LOW_RISK;
        }
        if(this.strategy.equals(Strategies.FREE_LOAN)){
            return LoanType.HIGH_RISK;
        }
        if(this.strategy.equals(Strategies.EMPLOYMENT_LOAN)){
            if(amount > 500000L && duration < 2)
                return LoanType.HIGH_RISK;
            if(duration > 2)
                return LoanType.LOW_RISK;
        }

        return LoanType.HIGH_RISK;
    }

    public enum Strategies{
        EMPLOYMENT_LOAN,
        FREE_LOAN,
        STUDENT_LOAN
    }
    public enum LoanType{
        HIGH_RISK,
        MEDIUM_RISK,
        LOW_RISK
    }
}
