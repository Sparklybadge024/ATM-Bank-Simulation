public class ATMBankSimulation {
    public static void main(String[] args){
        byte ATMs=33;
        
        if(ATMs<Byte.MAX_VALUE){
            ATMs++;
            System.out.println(ATMs);
        }else{
            System.out.println("Cannot add more ATMs because max amount reached");
        }
        

        String accountHolder="Bill Downey";

        System.out.println(accountHolder);
        
        double balance=5000000.623717;
        System.out.println(balance); 

        long withdraw=100000;

        short transaction=0;

        long deposit=10000;
        balance+=deposit;
        transaction++;
        System.out.println(balance);
        if(withdraw<=balance){
           balance-=withdraw;
           transaction++;
        }else{
            System.out.println("Insufficient balance");
        }
        System.out.println(balance);
        
        System.out.println(transaction);

        deposit=1000000000;
        transaction++;
        balance+=deposit;
        System.out.println(balance);
boolean isActive;
        if(balance>0){
            isActive=true;
        }else{
            isActive=false;
        }
        System.out.println("Account is Active: "+isActive);
        
        System.out.println("name: "+accountHolder);
        System.out.println("balance: "+balance);
        System.out.println("Active: "+isActive);
        System.out.println("Number of ATMs: "+ATMs);
        System.out.println("Transactions: "+transaction);
    }
}
