package bankacc;

public class FixedDepositAccount extends BankAccount {
    private Float interest = 3f;
    private Integer durationInMonths = 6 ;

public FixedDepositAccount () {
    super("Danny");
}

public FixedDepositAccount(String name, Float balance) {
super(name) ;
super.accBalance = balance ;
}

public FixedDepositAccount(String name, Float balance, Float interest) {
    super(name) ;
    super.accBalance = balance ;
    this.interest = interest ;
}

public FixedDepositAccount(String name, Float balance, Float interest, Integer duration) {
    super(name) ;
    super.accBalance = balance ;
    this.interest = interest ;
    this.durationInMonths = duration ;
    
}

public Float getInterest() {
    return interest;
}

public void setInterest(Float interest) {
    this.interest = interest;
}

public Integer getDurationInMonths() {
    return durationInMonths;
}

public void setDurationInMonths(Integer durationInMonths) {
    this.durationInMonths = durationInMonths;
}




    
}


