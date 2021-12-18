package ro.fasttrackit.curs11.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RaportGenerator {

    private List<StudentGrade> studentGrade;
    private Classroom classroom;

    public RaportGenerator() {
        studentGrade = new ArrayList<>();
        classroom = new Classroom(studentGrade);
    }

    public void raportGenerator() throws IOException {
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