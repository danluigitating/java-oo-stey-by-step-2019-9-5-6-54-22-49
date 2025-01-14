package practice11;

public class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id= id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public String introduce2() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person= (Person) obj;
            return id == person.getId();
        }
        return false;
    }
}