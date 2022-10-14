public class User {
    public static void n() {
        Account account = new Account();
        account.deposit(20000.0);

        while (true){
            try {account.withDraw(6000.0);
            }catch (AmountException e){
                System.out.println(e.getMessage());
                try {
                    account.withDraw(account.getAmount());
                } catch (AmountException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            }
        }
    }
}
