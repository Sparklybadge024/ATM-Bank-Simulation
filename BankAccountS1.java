class Bank{
    private int balance;
    int transfer;
    public int getbalance(){
        return balance;
    }
    public void setbalance(int amount){
        balance=amount;
    }
}
class transfer{
     void transferrd(Bank a,Bank b){
     if(a.getbalance()>=a.transfer){
        b.setbalance(a.transfer)+=b.getbalance();
     }       
    }
}


public class BankAccountS1 {
public static void main(String[] args){
    Bank b1=new Bank();
    Bank b2=new Bank();

    b1.setbalance(1000000);
    b2.setbalance(20000);
    b1.transfer=30000;
    
    transfer t1=new transfer();
    t1.transferrd(b1, b2);
    System.out.println(b2.getbalance());
}
}

