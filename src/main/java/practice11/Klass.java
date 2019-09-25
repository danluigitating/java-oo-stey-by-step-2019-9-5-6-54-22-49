package practice11;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    int classNumber;
    Student leaderName;
    Set<Student> member;
    Set<Teacher> teachers;

    public Klass(int classNumber) {
        this.classNumber = classNumber;
        member = new HashSet<>();
        teachers = new HashSet<>();
    }

    public Integer getNumber() {
        return classNumber;
    }

    public void assignLeader(Student student) {
        if (member.contains(student)) {
            this.leaderName = student;
            notifyTeachers(String.format("%s become Leader of %s.", student.getName(), getDisplayName()));
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void notifyTeachers(String message){
        for (Teacher teacher : teachers){
            teacher.getMessage(message);
        }
    }

    public void appendMember(Student student) {
        member.add(student);
        notifyTeachers(String.format("%s has joined %s.", student.getName(), getDisplayName()));
    }

    public void appendTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public Student getLeader() {
        return leaderName;
    }

    public void setLeader(Student leader) {
        this.leaderName = leader;
    }

    public void setNumber(int number) {
        this.classNumber = number;
    }

    public String getDisplayName() {
        return "Class " + classNumber;
    }


}
