package practice09;

public class Teacher extends Person{
    int classNumber;
    Klass klass;

    public Teacher(int id, String name, int age, int classNumber) {
        super(id, name,age);
        this.classNumber= classNumber;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        int value=0;
        if (klass == null)
            value += classNumber;
        else
            value += classNumber + klass.getNumber();

        if (value != 0)
            return introduce2() + " I am a Teacher. I teach Class " + value + ".";
        else
            return introduce2() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber().equals(klass.classNumber))
            return introduce2() + " I am a Teacher. I teach " + student.name + ".";
        else
            return introduce2() + " I am a Teacher. I don't teach " + student.name + ".";
    }
}
