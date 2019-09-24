package practice07;

public class Klass {
    int classNumber;

    public Klass(int classNumber) {
        this.classNumber = classNumber;
    }

    public Integer getNumber() {
        return classNumber;
    }

    public String getDisplayName() {
        return "Class " + classNumber;
    }

}
