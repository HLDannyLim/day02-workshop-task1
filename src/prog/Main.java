package prog;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


import bankacc.BankAccount;
import bankacc.FixedDepositAccount;

public class Main {

    public static void main (String[] args){
        String input = "";
        boolean quit = false ;
        boolean login = true ;
        

        ArrayList<BankAccount> accounts = new ArrayList<>();


        Scanner userInput = new Scanner(System.in);
        System.out.println("Have you registered an account before ? Yes/No");
        while(!quit){
            input = userInput.nextLine();
            input = input.trim().toLowerCase() ;
            String[] arrInput = input.split(" ");
    
            switch(arrInput[0]){
                case "quit":
                System.out.print("Bye!");
                quit = true ;
                break;

                case "no":
                System.out.print("What is your name ? \n");
                input = userInput.nextLine();
                BankAccount Account = new BankAccount(input) ;
                accounts.add(Account);
                for(int i=0; i<accounts.size(); i++){
                    if (input.equals(accounts.get(i).name)){
                        System.out.println("\nYour Account has been registered");
                        System.out.printf("Name : %s\n",accounts.get(i).name);
                        System.out.printf("Account No. : %s\n",accounts.get(i).accNumber);
                        System.out.printf("Account Balance : $%s \n",accounts.get(i).accBalance);
                        System.out.println("\nHave you registered an account before ? Yes/No ");
                    }
                }

                break;

                case "yes":
                System.out.print("Hello, whats your account name ?  \n");
                input = userInput.nextLine();
                for(int i=0; i<accounts.size(); i++){
                    if (input.equals(accounts.get(i).name)){
                        System.out.printf("Name : %s\n",accounts.get(i).name);
                        System.out.printf("Account No. : %s\n",accounts.get(i).accNumber);
                        System.out.printf("Account Balance : $%s \n",accounts.get(i).accBalance);
                    }
                    // else{
                    //     System.out.println("You are not registed, please register an account\n");
                    //     System.out.println("Have you registered an account before ? Yes/No \n");
                    //     break;
                    // }
                }
                System.out.print("Hello, how can i help you today ? (Please enter eg. danny deposit 50) \n");
                while(login){
                    input = userInput.nextLine();
                    arrInput = input.split(" ");
                    // arrInput = new String[arrInput.length];
                    // for(int i=0; i<arrInput.length; i++){
                    //     System.out.printf("%s\n", arrInput[i]);
                    // }
                    if (arrInput[1].equals("withdraw")){
                        for(int i=0; i<accounts.size(); i++){
                            if (arrInput[0].equals(accounts.get(i).name)){
                                if (Integer.parseInt(arrInput[2]) > accounts.get(i).accBalance){
                                    System.out.print("Insufficient money  \n");
                                }else{
                                    System.out.printf("You Withdraw %f",Float.parseFloat(arrInput[2]));
                                    accounts.get(i).withdraw(Float.parseFloat(arrInput[2]));
                                    System.out.printf("\nYour Account Balance : %s\n",accounts.get(i).accBalance);
                                    System.out.println(new Date());
                                    login = false ;
                                }
                            }
                            // else {
                            //     System.out.print("Wrong name  \n");
                            // }
                        }
                    }
                    if (arrInput[1].equals("deposit")){

                        for(int i=0; i<accounts.size(); i++){
                            if (arrInput[0].equals(accounts.get(i).name)){
                                if (Integer.parseInt(arrInput[2]) > accounts.get(i).accBalance){
                                    System.out.printf("You Deposit %f",Float.parseFloat(arrInput[2]));
                                    accounts.get(i).deposit(Float.parseFloat(arrInput[2]));
                                    System.out.printf("\nYour Account Balance : %s\n",accounts.get(i).accBalance);
                                    System.out.println(new Date());
                                    login = false ;
                                }
                            }
                            // else {
                            //     System.out.print("Wrong name  \n");
                            // }
                        }

                    }
                }

                break;
                default:
            }
        }
    }


}
