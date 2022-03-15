package tr.edu.maltepe.oop;

public class Person {
    private String name;
    private  int age;
    private String surname;



    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname=surname;
    }

    public String getSurname()
    {
        return surname;
    }

}
