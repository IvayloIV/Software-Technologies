import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Average_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> book = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            String name = tokens[0];
            ArrayList<Double> helper = new ArrayList<>();
            for (int j = 1; j < tokens.length; j++) {
                helper.add(Double.parseDouble(tokens[j]));
            }
            Double averageSum = helper.stream().mapToDouble(a -> a).average().getAsDouble();
            book.add(new Student(name, helper, averageSum));
        }
        List<Student> sortedBook = book.stream()
                .filter(a -> a.averageGrade >= 5)
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAverageGrade, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        for (Student currentStud : sortedBook) {
            System.out.printf("%s -> %.2f\n", currentStud.getName(), currentStud.getAverageGrade());
        }
    }

    public static class Student{
        private String name;
        ArrayList<Double> grades;
        Double averageGrade;

        public Student(String name, ArrayList<Double> grades, Double averageGrade) {
            this.name = name;
            this.grades = grades;
            this.averageGrade = averageGrade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Double> getGrades() {
            return grades;
        }

        public void setGrades(ArrayList<Double> grades) {
            this.grades = grades;
        }

        public Double getAverageGrade() {
            return averageGrade;
        }

        public void setAverageGrade(Double averageGrade) {
            this.averageGrade = averageGrade;
        }
    }
}
