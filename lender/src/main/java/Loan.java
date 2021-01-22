public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interestRate;
    private String contactNumbers;

    public Loan(int amount, String borrower, double interestRate, String contactNumbers) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRate = interestRate;
        this.contactNumbers = contactNumbers;
        this.isPaid = false;
    }

    public int getAmount() {
        return amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getContactNumbers() {
        return contactNumbers;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }
}
