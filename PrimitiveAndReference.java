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
        // Answer 11:-
      Dog d1=null;
    //   d1.bark();//Run time error

    // Answer 12:-
d1=new Dog();
d1.name="Bruno";
System.out.println(d1.name);//Bruno
Test t1=new Test();
t1.renameDog(d1);

System.out.println(d1.name);//Buddy and since the method takes a reference variable from dog class as parameter and modify its name as a result buddy is printed.

// Answer 13:-
Dog dog1=new Dog();
dog1.name="Rocky";
Test t2=new Test();
t2.replacing(dog1);
System.out.println(dog1.name);//Rocky the OG name the replacing method tried to change the memory address of the dog1 object but i guess it didn't succeed and the name never changed.

// Answer 14:-

    }
}
