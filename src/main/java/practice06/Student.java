package practice06;

public class Student extends Person {
    int classNumber;

    public Student(String name, int age, int classNumber) {
        super(name, age);
        this.classNumber= classNumber;
    }

    public int getKlass() {
        return classNumber;
    }

    @Override
    public String introduce() {
        return introduce2() + " I am a Student. I am at Class " + classNumber + ".";
    }
}