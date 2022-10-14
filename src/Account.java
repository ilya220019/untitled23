public class Account {
    private double amount = 0.0;

    public void deposit(double som) {
        amount += som;
        System.out.println("Вы пополнили счёт на: " + som );
    }

    public double getAmount() {
        return amount;
    }

    public double withDraw(double som) throws AmountException {
        if (amount - som < 0) {
            throw new AmountException("Недостаточно средств! " +
                    "Остаток на счету " + amount, amount);
        }
        amount = amount - som;
        System.out.println("Вы сняли со счёта: " + som +
                "сом    " + "Остаток на счету: " + amount);
        return amount;
    }
}
