package tr.edu.maltepe.oop;

public class main {
    public  static void main (String[] args) {

        /*Professor p1,p2;
        p1= new Professor("ensar gül");
        p1.teaches();
        p2 = new Professor("raif");

         */

        Student s1,s2;
        s1 = new Student("tekdemir");
        s1.learning();
        s2 = new Student("özgen");

        Professor ensar = new Professor("ensar");
        ensar.teaches();

    }
}