package bankacc;

import java.util.Date;

public class BankAccount {

    public String name ;
    public Integer accNumber ;
    public Float accBalance = 100.0f ;
    String transList[] = {};
    private Date registrationDate ;

    



    public BankAccount (String name){
        this.name = name;
        this.accNumber = (int)(Math.random()*(9999999-1000000+1)+1000000);
    }

    public void deposit(Float deposit){
        this.accBalance += deposit ;
    }
    
    public void withdraw(Float withdraw){
        this.accBalance -= withdraw ;
    }

    public static float strToFloat(String str)
    {
    	return Float.valueOf(str);
    }

    

    public String getName() {
        return name;
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    // public void setAccNumber(Integer accNumber) {
    //     this.accNumber = accNumber;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public Float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(Float accBalance) {
        this.accBalance = accBalance;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String[] getTransList() {
        return transList;
    }

    public void setTransList(String[] transList) {
        this.transList = transList;
    }

    
}
