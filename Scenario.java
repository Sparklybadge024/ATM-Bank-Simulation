class Cat{
    String name;
}

public class Scenario {
    public static void main(String[] args){
        // Realworld scenarios:-
//     // Answer 1:-
//     // So according to question i am assuming that there is a counter variable under byte container and it's value is less than 128.
//     byte counter=127;
//     System.out.println("Number of ATMs: "+counter);
    
//     counter++;//New ATM added
// System.out.println("Number of ATMs: "+counter);//-128
//     //This is a big problem because it flips the whole calculation because what we want is +128 not -128
//     // Is there any way to resolve this problem? Do answer me this after reviewing the question

//     // Answer 2:-
//     // According to question i am assuming that:-
//     int temperature=130;
//     byte temperatureByte=(byte) temperature;//This is how programmer stores it.
//     System.out.println("Programmer has stored "+temperatureByte);//-126 will be stored
//     // Why it will cause a problem because -126 is also a temperature but here it is not applicable because -126 is a cold temperature and it should be pointing out hot temperatures rather than cold ones because it is in desert equipment.

//     // Answer 3:-
//     int items=2;
//     int people=5;
//     System.out.println(items/people);//0
//     System.out.println((double)items/people);//0.4 Maybe by this??
    
//     // Answer 4:-
//     Cat c=new Cat();
//     System.out.println(c.name);//null
//     c.name="Kitty";//My fix
//     System.out.println(c.name);
//     System.out.println(c);//Cat@251a69d7 is this the memory address??

//     // Answer 5:-
//     // if(userExists(username) && passwordIsCorrect(username, password)) { ... }
//     // in above statement short circuiting is useful because if there is no user with that username then there is no point of entering password
//     // And if we use single & it will go through both the conditions which is pointless

// Answer 6:-
int temperature=250;
double temp=(double) temperature;
System.out.println(temp);

// Answer 7:-
float balance=272.54f;
double intrestBalance=(double) balance+52.55;
System.out.println(intrestBalance);

// Answer 8:-
System.out.println(Short.MAX_VALUE);
short distance=0;
// distance+=50000;//Distance covered
// System.out.println(distance);//-15536
int dist=distance+50000;//Distance covered
System.out.println(dist);

// Answer 9:-
byte inventory=0;
short shipment=200;


if(shipment>127){
    int invent=inventory+shipment;
    System.out.println(invent);
}

// Answer 10:-
char character='R';
int character0=(int) character+5;
System.out.println(character0);//87
System.out.println((int) character);//82
// What happened is that character0 converted character which is a string to a unicode value which is a number and added 5 to it.
    }
}
