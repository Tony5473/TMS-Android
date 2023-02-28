package by.teachmeskills.lesson6;

public class CreditCard {

    private String accountNumber;
    private double balanceAlfa;
    private double balanceBSB;
    private double balanceSBER;
    public CreditCard(String accountNumber){
        this.accountNumber = accountNumber;
        this.balanceBSB = 100;
        this.balanceSBER = 80;
        this.balanceAlfa = 50;

    }

    public void addSumBSB(double sumToAdd) {
        this.balanceBSB = this.balanceBSB + sumToAdd;
    }
    public void addSumSBER(double sumToAdd){
        this.balanceSBER += sumToAdd;
    }
    public void withdrawSum(double sumToWithdraw){
        this.balanceAlfa = this.balanceAlfa - sumToWithdraw;
    }

    public String getInfo(){
        return "Debit Card " + this.accountNumber;
    }
    public String getSumBSB(){
        return "Balance  " + this.balanceBSB;
    }
    public String getSumSBER(){
        return "Balance  " + this.balanceSBER;
    }
    public String getSumAlfa(){
        return "Balance  " + this.balanceAlfa;
    }
}
