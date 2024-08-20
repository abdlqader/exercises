package loanCalculator;

import loanCalculator.LoanCalculator.*;

public class application {

    public static void main(String[] args) {

        LoanCalculatorInterface studentLoan = new LoanCalculator().studentLoan(4, 10000L, 3);
        LoanCalculatorInterface workerLoan = new LoanCalculator().workerLoanCreation(5, 10000L);
        LoanCalculatorInterface freeLoan = new LoanCalculator().freeLoanCreation(4, 10000L, 1);

        LoanCalculatorInterface studentLoan1 = new LoanCalculator().factoryBuilder(Strategies.STUDENT_LOAN);
//        calculator.setDuration(4);
//        System.out.println("worked ! & duration = " + freeLoan.getDuration() + " with risk = " + freeLoan.calculate());
        LoanAsset.consoleLog(studentLoan1);
    }
}
