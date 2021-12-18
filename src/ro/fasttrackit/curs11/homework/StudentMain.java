package ro.fasttrackit.curs11.homework;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) throws Exception {
        StudentGradeFile studentGradeFile = new StudentGradeFile();
        List<StudentGrade> studentGrades = studentGradeFile.getStudentList();
        System.out.println(studentGrades);

        Classroom classroom = new Classroom(studentGrades);
        List<Integer> grades = classroom.getGradesForDiscipline("Computer Science");
        System.out.println(grades);

        List<Integer> grade = classroom.getGradesForStudent("Demetria Cosme");
        System.out.println(grade);

        StudentGrade maxGrade = classroom.getMaxGrade("Mathematics");
        System.out.println(maxGrade);

        StudentGrade maxGrade1 = classroom.getMaxAllGrade();
        System.out.println(maxGrade1);

        StudentGrade worstGradeDiscipline = classroom.getWorstGrade("Computer Science");
        System.out.println(worstGradeDiscipline);

        StudentGrade worstStudentGrade = classroom.getMinGrade();
        System.out.println(worstStudentGrade);

        System.out.println(classroom.getAverageGrades());
        System.out.println(classroom.getAverageGrade("Mathematics"));

        RaportGenerator raportGenerator = new RaportGenerator(studentGrades);
        raportGenerator.raportGenerator();



    }
}