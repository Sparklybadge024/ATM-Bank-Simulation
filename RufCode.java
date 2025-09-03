class Book{
  byte a1;
  short b1;
  int c1;
  long d1;
  float e1;
  double f1;
  char g1;
  boolean h1;

}

class Pen{
  String brand;
}

class Dog{
  String name;
}

class Car {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Car is being collected");
    }
}

class BankAccount{
  String ownerName;
  double balance;
  void deposit(double amount){
    balance+=amount;
  }
  }
class RufCode{
  public static void main(String[] args){
    // Answer 1:-
  byte a=120;
  System.out.println(a); 
  
  short b=1000;
  System.out.println(b);

  int c=35555;
  System.out.println(c); 

  long d=30000000000L;
  System.out.println(d); 

  float e=30.18291f;
  System.out.println(e); 

  double f=100.782812312127;
  System.out.println(f); 

  char g='A';
  System.out.println(g); 

  boolean h=true;
  System.out.println(h); 

  // Answer 2:-
  Book bro=new Book();
  System.out.println(bro.a1);//0
  System.out.println(bro.b1);//0
  System.out.println(bro.c1);//0
  System.out.println(bro.d1);//0
  System.out.println(bro.e1);//0.0
  System.out.println(bro.f1);//0.0
  System.out.println(bro.g1);//NUL
  System.out.println(bro.h1);//false

  // Answer 3:-
  byte a2=127;
  int b2=a2;
  System.out.println(b2);

  double c2=b2;
  System.out.println(c2);

  // Answer 4:-
  int a3=150;
  byte b3=(byte) a3;

  System.out.println(b3);

  // Answer 5:-
  System.out.println(Byte.MIN_VALUE);
  System.out.println(Byte.MAX_VALUE);
  System.out.println(Short.MIN_VALUE);
  System.out.println(Short.MAX_VALUE);
  System.out.println(Integer.MIN_VALUE);
  System.out.println(Integer.MAX_VALUE);
  System.out.println(Long.MIN_VALUE);
  System.out.println(Long.MAX_VALUE);

  //  Answer 6:-
short goat=3000;
short goat0=6000;

int shor=goat+goat0;
// I dont know the answer.

// Answer 7:-
char go='A';
int got=(int) go;
System.out.println("answer 7:- "+got);

// Answer 8:-
boolean bo=true;
boolean boo=false;

System.out.println(bo||boo);//true
System.out.println(bo&&boo);//false
System.out.println(!bo||boo);//false
System.out.println(bo&&!boo);//true

// Answer 9:-
double celcius=25.50;
double fah=(celcius*9/5)+32;
System.out.println(fah);

// Answer 10:-
System.out.println(a3%3==0);
System.out.println(a3%5==0);

// Answer 11:-
double deci=242417.2716261;
// float popi=deci; its not compiling here
float popi=(float) deci;
System.out.println("Non Explicit casting: "+deci);//242417.2716261
System.out.println("Explict casting printing: "+popi);//242417.27

// Answer 12:-
long lolo=33720368547L;
int lolo2=(int) lolo;
System.out.println(lolo);//33720368547
System.out.println(lolo2);//-639369821

// Answer 13:-
byte byteVal=110;
double byteVal0=byteVal;
System.out.println(byteVal);//110
System.out.println(byteVal0);//110.0

// Answer 14:-
double largeVal=2152152.253122673126753612;
float largeVal0=(float) largeVal;
System.out.println(largeVal);//2152152.253122673
System.out.println(largeVal0);//2152152.2

// Answer 15:-
int intVal=125615261;
float floVal=52615.121251265165f;
System.out.println(intVal+floVal);//1.2566788E8

// Answer 16:-
Pen penCls=new Pen();
System.out.println(penCls.brand);//It prints null
// It prints null because no value have been assigned to the brand variable.

// Answer 17:-
String s1=null;
// System.out.println(s1.length());
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local44>" is null
// at RufCode.main(RufCode.java:146)
// System.out.println(null.length()); //It is giving a compiletime error.

// Answer 18:-
Dog d1=new Dog();
Dog d2=d1;
d2.name="RahulWoofWoof";
System.out.println(d1.name);//RahulWoofWoof
System.out.println(d2.name);//RahulWoofWoof
// I observed that name variable to both are same. I did some experiment below:-
d1.name="Hem Kutta";
System.out.println(d2.name);//Hem Kutta
// Means even if i change d1, d2 will get changed automatically and same is true for if i change d1 ,d2 will change automatically

// Answer 19:-

Car c1=new Car();
System.out.println(c1);//Because here the c1 object is pointing on Car class and it is evident that c1's object have Car class in its memory.
c1=null;//On the flip side here the its memory address got changed to null with that said our original memory address in c1 object got changed hence the first assignment is redy for garbage collection
System.out.println(c1);
// I don't know how to do this :- Add a finalize() method in Car to print a message when GC runs (note: may not always print immediately).
System.gc();
// Answer 20:-
BankAccount account=new BankAccount();
System.out.println(account.ownerName);//null
System.out.println(account.balance);//0.0
account.ownerName="Rishabh Sundli";
account.balance=1000.0;
System.out.println(account.ownerName);//Rishabh Sundli
System.out.println(account.balance);//1000.0
account.deposit(500);
System.out.println(account.balance);
}


}