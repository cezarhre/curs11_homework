package ro.fasttrackit.curs11.homework;

public class StudentGrade {
    private String name;
    private String discipline;
    private int grade;

    public StudentGrade(String name, String discipline, int grade){
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;

    }

    public StudentGrade() {

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

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }

}

