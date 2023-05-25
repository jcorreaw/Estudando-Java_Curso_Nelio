package HerancaEpoli.main;

import HerancaEpoli.entities.Account;
import HerancaEpoli.entities.BusinessAccount;
import HerancaEpoli.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);

        //UP
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Joao", 0.0, 600.0);
        Account acc3 = new SavingsAccount(1004, "vitoria", 0.0, 0.01);

        //DOWN

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(400.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(300.0);
            System.out.println("Loan!");
        }

//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("update!");
//        }

        Account accJ = new Account(1001, "Joao", 1000.0);
        accJ.withDraw(200.0);
        System.out.println(accJ.getBalance());


        Account accJ2 = new SavingsAccount(1002, "Joao", 1000.0, 0.05);
        accJ2.withDraw(200.0);
        System.out.println(accJ2.getBalance());

        Account accJ3 = new BusinessAccount(1003, "Joao", 1000.0, 500.0);
        accJ3.withDraw(200.0);
        System.out.println(accJ3.getBalance());







    }
}
