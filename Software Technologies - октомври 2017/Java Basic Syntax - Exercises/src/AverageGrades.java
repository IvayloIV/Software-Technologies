import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageGrades {
    public static void main(String[] args) {
        StartProgram();
    }

    private static void StartProgram() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> book = new ArrayList<Student>();
        Integer n = Integer.parseInt(sc.nextLine());
        book = AllParticipant(book, n, sc);
        PrintResult(book);
    }

    private static ArrayList<Student> AllParticipant(ArrayList<Student> book, Integer n, Scanner sc) {
        for (Integer i = 0; i < n; i++){
            String[] input = sc.nextLine().split("\\s+");
            Student currentStudent = new Student();
            currentStudent.name = input[0];

            ArrayList<Double> currentGrades = new ArrayList<>();
            for (Integer k = 1; k < input.length; k++){
                currentGrades.add(Double.parseDouble(input[k]));
            }
            currentStudent.setGrades(currentGrades);
            currentStudent.averageGrade = currentGrades.stream().mapToDouble(a -> a).average().getAsDouble();
            book.add(currentStudent);
        }
        return  book;
    }

    private static void PrintResult(ArrayList<Student> book) {
        List<Student> sortedBook = book
                .stream()
                .filter(a -> a.averageGrade >= 5.00)
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAverageGrade, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        for (Student current :sortedBook) {
            System.out.printf("%s -> %.2f%s",current.name, current.averageGrade, "\n");
        }
    }

    public static class Student {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        ArrayList<Double> grades;

        public ArrayList<Double> getGrades() {
            return grades;
        }

        public void setGrades(ArrayList<Double> grades) {
            this.grades = grades;
        }
        Double averageGrade;

        public Double getAverageGrade() {
            return averageGrade;
        }

        public void setAverageGrade(Double averageGrade) {
            this.averageGrade = averageGrade;
        }
    }
}


