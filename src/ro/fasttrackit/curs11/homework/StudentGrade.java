package ro.fasttrackit.curs11.homework;

public class StudentGrade {
    private final String name;
    private final String discipline;
    private final int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;

    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }

}

