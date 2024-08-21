package loanCalculator;

public class StudentLoan extends LoanCalculatorAbstract{
    public StudentLoan(int duration, Long amount){
        super(duration, amount);
        this.strategy = Loan.Strategies.STUDENT_LOAN;
        this.rate = 0.12;
    }
}
