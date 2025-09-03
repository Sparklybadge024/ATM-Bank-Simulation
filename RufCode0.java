import javax.swing.plaf.TreeUI;

class Cat{
    String name;
}
class Dog{
    String name;
}

class Car{}

public class RufCode0 {
    public static void main(String[] args){
    // Answer 1:-
    byte b = 127;
b++;
System.out.println(b);
System.out.println(Byte.MAX_VALUE);
// It will print -128 and it is because of the fact that Byte.MAX_VALUE is 127 and if any digit gets add to it then it will move to it's negative counterpart.

// Answer 2:-
int x=130;
byte y=(byte) x;
System.out.println(y);
// In above code it will print -126 Because when x was assigned the value 130 it is implicit casting on the flip side when y was assigned it's value it's explicit casting.
// And since y seems like it is been asygned 130 at first glance but its not. First of all y is a byte container and x is been narrow casted as a result x will act like a byte container variable.
// It's calculations will go like this:- 130(in int container) will become 127+3=-126(in byte container).

// Answer 3:-
int a=5;
double b1=2.0;
System.out.println(a/b1);//2.5
System.out.println(a/(int) b1);//2
System.out.println((int) b1);//2
// Double gives a fractional value on the flip side int gives a whole number and when 2 int are involved in a mathematical operation they eventually end up giving a whole number
// For example:-
int a1=9;
float b2=3.5f; 
System.out.println(a1*b2);//31.5
System.out.println(a1*(int)b2);//9*3=27
System.out.println((int) b2);//3
// So the conclusion is that we can't store floating number inside an int container and when we convert a floating container int an int container it's value autonmatically converted to a whole number.

// Answer 4:-
Cat c=new Cat();
System.out.println(c.name);//null
//It prints null because the value is empty but if we add something to it it will not be null anymore such as:-
c.name="Kitten";
System.out.println(c.name);//Kitten

// Answer 5:-
String s=null;
// System.out.println(s.length());//null
//it prints null because we have assigned it's value to null only.

// Answer 6:-
boolean a3=true;
boolean b3=false;
System.out.println(a3&b3);//false;
System.out.println(a3&&b3);//false;
// What i know is && is an logical AND operator thats it i am not sure about what & is but since it has produced false so i am assuming that it is also some kind of logical AND operator.

// Answer 7:-
char c1='A';
int i=c1+1;
System.out.println(i);
System.out.println((int)c1);//65
//So i guess the unicode of A is 65 and when we wrote "int i=c1+1;" the char conainer's value is automatically gets converted to an int here the unicode of A and 1 is added to it hence gives an output 65. 

// Answer 8:-
Dog d1=new Dog();
d1.name="Fido";
Dog d2=d1;
d2.name="Max";
System.out.println(d1.name);//Max
// So when we assigned d1 to Dog d2 the memory address of d1 had been shared with d2 and as a result both became a single unit by memory address and when we modified d2's name and since the d1 share its memory address with d2 d1's name also got changed and previous d1.name got ready for garbage collection.

// Answer 9:-
Car c3=new Car();
c3=null;
System.out.println(c3);//null
// I am not sure about wether its destroyed or not but what happened is we have assigned null to c3 and null is the output we got just that.

// Answer 10:-
double d=0.1+0.2;
System.out.println(d);
// I am not sure but we have studied that double gives a value upto 16 decimal points

// Extra question:-
boolean left=false;
boolean right=true;

System.out.println(left&&(5/0>1));
// System.out.println(left&&(5/0>1));//Throwing exception
System.out.println(right||(5/0>1));//true
System.out.println(left|(5/0>1));//Throwing exception
    }
    
}
