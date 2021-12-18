package ro.fasttrackit.curs11.homework;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;

    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade stud : studentGrades) {
            if (stud.getDiscipline().equals(discipline)) {
                grades.add(stud.getGrade());
            }
        }
        return grades;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> grade = new ArrayList<>();
        for (StudentGrade stud : studentGrades) {
            if (stud.getName().equals(student)) {
                grade.add(stud.getGrade());
            }
        }
        return grade;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = studentGrades.get(0);
        for (StudentGrade stud : studentGrades) {
            if (stud.getDiscipline().equals(discipline)) {
                if (stud.getGrade() > maxGrade.getGrade()) {
                    maxGrade = stud;
                }
            }
        }
        return maxGrade;
    }

    public StudentGrade getMaxAllGrade() {
        StudentGrade maxAllGrade = new StudentGrade();
        int max = 0;
        for (StudentGrade stud : studentGrades) {
                if (stud.getGrade() > max) {
                    max = stud.getGrade();
                    maxAllGrade = stud;
                }
            }
            return maxAllGrade;
        }

    public StudentGrade getMinGrade(){
        StudentGrade minGrade = studentGrades.get(0);
        for(StudentGrade stud : studentGrades){
            if(stud.getGrade() < minGrade.getGrade()){
                minGrade = stud;
            }
        }
        return minGrade;
    }

    public Integer getAverageGrade(String discipline) {
        int count = 0;
        int total = 0;
        for (StudentGrade stud : studentGrades) {
            if (stud.getDiscipline().equals(discipline)) {
                total += stud.getGrade();
                count++;
            }
        }
        return total / count;
    }

    public Integer getAverageGrades(){
        int count = 0;
        int total = 0;
        for (StudentGrade stud : studentGrades) {
                total += stud.getGrade();
                count++;
            }
        return total / count;
        }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade worstGrade = studentGrades.get(0);
        for (StudentGrade stud : studentGrades) {
            if (stud.getDiscipline().equals(discipline)) {
                if (stud.getGrade() < worstGrade.getGrade()) {
                    worstGrade = stud;
                }
            }
        }
        return worstGrade;
    }
}
