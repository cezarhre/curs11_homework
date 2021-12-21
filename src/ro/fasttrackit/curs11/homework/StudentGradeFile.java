package ro.fasttrackit.curs11.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentGradeFile{

    protected final List<StudentGrade> studentList;

    public StudentGradeFile(){
        studentList = new ArrayList<>();
    }

    public List<StudentGrade> getStudentList()throws Exception{
        return readStudentList("files/grades.txt");
    }

    public List<StudentGrade> readStudentList(String path) throws Exception{
        List<StudentGrade> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null){
                result.add(readStudentFromLine(line));
            }
        }
        return result;
    }

    public StudentGrade readStudentFromLine(String line){
        String[] tokens = line.split(Pattern.quote("|"));
        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }
}
