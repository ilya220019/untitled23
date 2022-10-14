public class AmountException extends Exception{
    private double remainingAmount;

    public AmountException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        System.out.println("������� �� ����� " + remainingAmount);
        return remainingAmount;
    }
}
