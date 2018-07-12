package accounting.project;

public class transcation {

    private String date;
    private double debit, credit, balance;

    public transcation(String date, double debit, double credit, double balance) {
        super();
        this.date = date;
        this.debit = debit;
        this.credit = credit;
        this.balance = balance;
    }

    public String getdate() {
        return this.date;
    }

    public double getdebit() {
        return this.debit;
    }

    public double getcredit() {
        return this.credit;
    }

    public double getbalance() {
        return this.balance;
    }

}
