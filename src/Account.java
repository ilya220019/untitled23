public class Account {
    private double amount = 0.0;

    public void deposit(double som) {
        amount += som;
        System.out.println("�� ��������� ���� ��: " + som );
    }

    public double getAmount() {
        return amount;
    }

    public double withDraw(double som) throws AmountException {
        if (amount - som < 0) {
            throw new AmountException("������������ �������! " +
                    "������� �� ����� " + amount, amount);
        }
        amount = amount - som;
        System.out.println("�� ����� �� �����: " + som +
                "���    " + "������� �� �����: " + amount);
        return amount;
    }
}
