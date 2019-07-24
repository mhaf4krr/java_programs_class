import java.util.ArrayList;

class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }

    void showName(){
        System.out.print(this.name);
    }
}

public class Alist{
    public static void main(String args[]){
        ArrayList<Animal> mylist = new ArrayList<Animal>();
        Animal a = new Animal("Jackie");
        Animal b = new Animal("Puma");
        Animal c = new Animal("Wolf");
        mylist.add(a);
        mylist.add(b);
        mylist.add(c);

        System.out.println(" SIZE : " + mylist.size());

        System.out.println(" REMOVE : " + mylist.remove(c));

        System.out.println(" SIZE : " + mylist.size());


        System.out.println(" CONTAINS : " + mylist.contains(c));


    }
}