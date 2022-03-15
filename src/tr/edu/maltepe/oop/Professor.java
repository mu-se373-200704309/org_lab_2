package tr.edu.maltepe.oop;
public class Professor extends Person {

    Professor(String name) {
        setName(name);

    }

    void teaches (){
        System.out.println(getName()+" Teaching the lesson");
    }

}