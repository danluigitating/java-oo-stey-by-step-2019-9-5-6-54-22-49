package practice06;

public class Teacher extends Person{
    int classNumber;

    public Teacher(String name, int age, int classNumber) {
        super(name,age);
        this.classNumber= classNumber;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return classNumber;
    }

    @Override
    public String introduce() {
        if(classNumber!=0)
            return introduce2() + " I am a Teacher. I teach Class " + classNumber + ".";
        else
            return introduce2() + " I am a Teacher. I teach No Class.";
    }
}