package tr.edu.maltepe.oop;
public class Student extends    Person {
    Student(String surname )  {
        setSurname(surname);
    }
    void learning () {
        System.out.println(getSurname()+" learning the lesson");


    }
}

