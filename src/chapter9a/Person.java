package chapter9a;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name) {
        System.out.println("This is the second constructor. The name is: ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
