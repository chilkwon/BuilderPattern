import javafx.util.Builder;

public class BankAccount {
    private String owner;
    private long accountNumber;
    private String branch;
    private double balance;
    private double interestRate;

    private BankAccount() {

    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getOwner() {
        return owner;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static class Builder{
        private String owner;
        private long accountNumber;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }
        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder opendingBalance(double balance){
            this.balance = balance;
            return this;
        }
        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }
        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }

    }
}
