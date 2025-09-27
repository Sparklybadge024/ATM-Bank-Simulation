class Dog{
    String name;
    int age;
    void bark(){
        System.out.println("Woof");
    }
    int umber(int n){
        return n+1;
    }

    void naam(){
        this.name="Pascal";
    }
}

class Test{
    static void renameDog(Dog d){
        d.name="Buddy";
    }
    static void replacing(Dog d){
        d=new Dog();
        d.name="Charlie";
    }
}


public class PrimitiveAndReference {
    public static void main(String[] args){
        // Answer 1:-
        // Dog d;
        // d.bark();//Compile time error

        // Answer 2:-
        Dog d1=new Dog();
        Dog d2=d1;
        d1.name="Alpha";
        System.out.println(d2.name);//Alpha its like 2 remote controlls are controlling a single TV

        // Answer 3:-
        d1.name="Rex";
        d1=new Dog();
        d1.name="Buddy";
        System.out.println(d2.name);//Rex because d2 object is unaware of d1's transformation

        // Answer 4:-
        Dog d3=new Dog();
        d3.name="Pluto";
            Test t1=new Test();
            t1.replacing(d3);//Reassigning
            System.out.println(d3.name);//Pluto 
            t1.renameDog(d3);//Modifing the parameter
            System.out.println(d3.name);//Buddy

        // Answer 5:-
        System.out.println(d1==d2);//false
        // Because their memory addresses are different.

        // Answer 6:-
        Dog d4=null;
        Dog d5=null;
        System.out.println(d4==d5);//true
        // Because their memory addresses are same.

        // Answer 7:-
        // There are 2 scenarios to question 7
        // Scenario 1:-
        Dog d6=new Dog();
        Dog d7=d6;

        d6.name="Bruno";
        d7.name="Mar";
        System.out.println(d6.name);//Mar
        System.out.println(d7.name);//Mar 2 remotes 1 TV logic. or same memory address.
        d6=null;
        System.out.println(d7.name);//Mar still pointing to the memory address
        // System.out.println(d6.name);//RunTime Error
        // But d7 still pointing to the memory address so no garbage collection for now.

        // Scenario 2:-
        Dog d8=new Dog();
        Dog d9=new Dog();

        d8.name="Jolly";
        d9.name="Rancher";
        System.out.println(d8.name);
        System.out.println(d9.name);
    }
}
