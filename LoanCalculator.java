package loanCalculator;

public class LoanCalculator implements LoanCalculatorInterface {
    private int duration = 0; // number of years
    private Long amount = 0L;
    private double rate = 0.16; //16%
    private int paymentDuration = 1; // this represents if we pay every month, 3 month, 6 month or 12 months
    private Strategies strategy = Strategies.FREE_LOAN;
    public LoanCalculator workerLoanCreation(int duration, Long amount){
        setDuration(duration);
        this.amount = amount;
        this.strategy = Strategies.EMPLOYMENT_LOAN;
        return this;
    }
    //this is for free loans
    public LoanCalculator freeLoanCreation(int duration, Long amount, int paymentDuration){
        setDuration(duration);
        this.amount = amount;
        this.strategy = Strategies.FREE_LOAN;
        this.paymentDuration = paymentDuration;
        return this;
    }
    public LoanCalculator studentLoan(int duration, Long amount, int paymentDuration){
        setDuration(duration);
        this.amount = amount;
        this.strategy = Strategies.STUDENT_LOAN;
        this.paymentDuration = paymentDuration;
        return this;
    }
    public LoanCalculator(){}

    public LoanCalculator factoryBuilder(Strategies type){
        if(type.equals(Strategies.STUDENT_LOAN))
            return studentLoan(3,10000L,3);
        if(type.equals(Strategies.EMPLOYMENT_LOAN))
            return workerLoanCreation(3,10000L);
        if(type.equals(Strategies.FREE_LOAN))
            return freeLoanCreation(3,10000L,3);

        return this;
    }

    private void setDuration(int duration){
        if(duration <= 10 && duration > 0)
            this.duration = duration;
    }
    public  int getDuration(){
        return this.duration;
    }

    @Override
    public LoanType calculate(){
        // do the math
        if(amount >  100000L || strategy.equals(Strategies.FREE_LOAN) || paymentDuration > 3 || duration > 7)
            return LoanType.HIGH_RISK;

        if(amount >  50000L || strategy.equals(Strategies.STUDENT_LOAN) || paymentDuration > 2 || duration > 4)
            return LoanType.MEDIUM_RISK;

        return LoanType.LOW_RISK;
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
