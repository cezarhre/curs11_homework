package ro.fasttrackit.curs11.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RaportGenerator {

    private final List<StudentGrade> studentGrades;

    public RaportGenerator(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void raportGenerator() throws IOException {
        Classroom classroom = new Classroom(this.studentGrades);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports.out"))) {
            StudentGrade maxNotaStudent = classroom.getMaxAllGrade();
            StudentGrade minNotaStudent = classroom.getMinGrade();
            writer.write("Name student " + maxNotaStudent.getName() + " has maximum grade " + maxNotaStudent.getGrade());
            writer.newLine();
            writer.write("Name student " + minNotaStudent.getName() + " has minimum grade " + minNotaStudent.getGrade());
            writer.newLine();
            writer.write("Media notelor este " + classroom.getAverageGrades());
        }
    }
}