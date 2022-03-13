public class BankAccountImplementation {
    public static void main(String[] args) {
        BankAccount chilAccount = new BankAccount.Builder(1234L)
                .withOwner("chil")
                .atBranch("Toronto")
                .opendingBalance(1234.12)
                .atRate(2.5)
                .build();
        System.out.println(chilAccount.getOwner());

    }
}
