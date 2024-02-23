public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] validAccount = new String[]{"123abc_", "_acb123", "_______","123456","abasdjkl"};
    private static final String[] invalidAccount = new String[]{".@","12345","1234","abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for(String account : validAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid     " + isValid ) ;
        }
        for(String account : invalidAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is" + account + " is valid " + isValid);
        }
    }
}
