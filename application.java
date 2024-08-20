package loanCalculator;

import loanCalculator.Loan.*;

public class application {

    public static void main(String[] args) {
        //creation pattern or creation methods
        LoanCalculatorInterface creationStudentLoan = new Loan().studentLoan(4, 10000L);
        LoanCalculatorInterface creationWorkerLoan = new Loan().workerLoanCreation(5, 10000L);
        LoanCalculatorInterface creationFreeLoan = new Loan().freeLoanCreation(4, 10000L);
        LoanAsset.consoleLog(creationStudentLoan);

        //basic factory pattern
        LoanCalculatorInterface factoryLoan = new Loan().factoryBuilder(Strategies.STUDENT_LOAN);
        LoanAsset.consoleLog(factoryLoan);

        //Strategy pattern TODO:
        //instead of having a class create 3 versions of it self ( creation pattern )
        //i want to create 3 classes each one represent itself
        //for example i want StudentLoan with its own riskLevel Method
        //all the classes should be working on consoleLog of LoanAsset
        //LoanAsset.consoleLog(StudentLoan);
    }
}
//this sessions questions
//abstraction vs interface
//dependency inversion vs dependency injection
