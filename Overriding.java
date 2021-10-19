/*
@Override This annotation informs the compiler that we want to override a method in the parent class. If the method doesn’t exist in the parent class, we’ll get a helpful error when we compile the program.
*/
//rename the file to BankAccount.java to run this code
class BankAccount {
  protected double balance;
 
  public BankAccount(double balanceIn){
    balance = balanceIn;
  }
 
  public void printBalance() {
    System.out.println("Your account balance is $" + balance);
  }
}
 
class CheckingAccount extends BankAccount {
 
  public CheckingAccount(double balance) {
    super(balance);
  }
 
  @Override
  public void printBalance() {
    System.out.println("Your checking account balance is $" + balance);
  }
}
