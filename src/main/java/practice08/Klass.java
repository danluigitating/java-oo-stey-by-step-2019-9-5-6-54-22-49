package practice08;

public class Klass {
    int classNumber;
    Student leaderName;

    public Klass(int classNumber) {
        this.classNumber = classNumber;
    }

    public Integer getNumber() {
        return classNumber;
    }

    public void assignLeader(Student student) {
      this.leaderName= student;
    }

    public Student getLeader() {
        return leaderName;
    }

    public String getDisplayName() {
        return "Class " + classNumber;
    }
}
