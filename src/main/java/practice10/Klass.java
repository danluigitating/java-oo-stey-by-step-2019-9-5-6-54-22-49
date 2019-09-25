package practice10;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    int classNumber;
    Student leaderName;
    Set<Student> member;

    public Klass(int classNumber) {
        this.classNumber = classNumber;
        member = new HashSet<>();
    }

    public Integer getNumber() {
        return classNumber;
    }

    public void assignLeader(Student student) {
        if (member.contains(student)) {
            this.leaderName = student;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        member.add(student);
    }


    public Student getLeader() {
        return leaderName;
    }

    public String getDisplayName() {
        return "Class " + classNumber;
    }
}
