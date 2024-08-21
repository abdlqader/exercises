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

        //Strategy pattern
        LoanCalculatorAbstract strategyStudentLoan = new StudentLoan(4,10000L);
        LoanCalculatorAbstract strategyWorkerLoan = new WorkerLoan(4,10000L);
        FreeLoan strategyFreeLoan = new FreeLoan(4,10000L);
        LoanAsset.consoleLog(strategyStudentLoan);
        LoanAsset.consoleLog(strategyFreeLoan);

        //abstract Factory pattern
        LoanCalculatorAbstract pickedStrategy = LoanAsset.loanFactory(Strategies.STUDENT_LOAN, 5, 70000L); // welcome to abstraction in OOP
        LoanAsset.consoleLog(pickedStrategy);

    }
}
//this sessions questions
//abstraction vs interface
//dependency inversion vs dependency injection
