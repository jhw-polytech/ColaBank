package kr.ac.kopo.colaBank.accountManager.vo;

public class AccountVO {

    private String id;
    private int accountNumber;
    private String bank;
    private double balance;
    private String grade;

    public AccountVO() {
    }

    public AccountVO(String id, int accountNumber, String bank, double balance, String grade) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = balance;
        this.grade = grade;
    }

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
