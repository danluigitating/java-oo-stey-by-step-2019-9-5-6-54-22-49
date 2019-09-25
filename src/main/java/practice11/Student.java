package practice11;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, int age, int classNumber) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass.leaderName!= null)
            return introduce2() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        else
            return introduce2() + " I am a Student. I am at Class " + klass.getNumber() + ".";
    }
}
