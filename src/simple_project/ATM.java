package simple_project;

import java.util.*;



public class ATM {
    public static void main(String[] args) {

        Account a=new Person();
        char c;
        System.out.println("Welcome to SBI");
        System.out.println("=======================================================");
        System.out.println("1. Display details\n2.Deposit\n3.Withdraw\n4.Check Balance\n5.Modify the details");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter the choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    a.details();
                    break;
                case 2:
                    int amt;
                    System.out.println("Please enter the ammount you want to deposit:");
                    amt = sc.nextInt();
                    a.deposit(amt);

                    break;
                case 3:
                    int amt1;
                    System.out.println("Please enter the amount you want to withdraw:");
                    amt1 = sc.nextInt();
                    a.withdraw(amt1);

                    break;
                case 4:
                    a.checkBalance();

                    break;
                case 5:
                    String name;
                    long accnt;
                    String ifsc;
                    System.out.println("Enter name:");
                    name = sc.next();
                    System.out.println("Enter account number:");
                    accnt = sc.nextLong();
                    System.out.println("Enter IFSC:");
                    ifsc = sc.next();
                    Person p = (Person) a;
                    p.setDetails(name, accnt, ifsc);

                    break;
                default:
                    System.out.println("Invalid choice");

            }
            System.out.println("Do you want to continue");
            c=sc.next().charAt(0);
        }while(c=='y'|| c=='Y');

    }
}
