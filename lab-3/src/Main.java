import java.util.Arrays;
import java.util.Comparator;

/**
 * Клас Main виконує основні операції над об'єктами класу Student.
 */
public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів Student
        Student[] students = {
                new Student("Alice", 20, 3.8, "ІК-11", 2),
                new Student("Bob", 21, 3.6, "ІС-13", 3),
                new Student("Charlie", 19, 3.9, "IA-21", 1),
                new Student("Diana", 20, 5, "ІК-24", 3),
                new Student("Eve", 20, 3.8, "ІС-31", 2)
        };

        // Сортування за GPA за зростанням та за роком навчання за спаданням
        Arrays.sort(students, Comparator.comparingDouble(Student::getGpa)
                .thenComparing(Comparator.comparingInt(Student::getYear).reversed()));

        // Виведення відсортованого масиву
        System.out.println("Відсортований список студентів:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Пошук студента, ідентичного заданому
        Student target = new Student("Diana", 20, 5, "ІК-24", 3);
        int index = Arrays.asList(students).indexOf(target);

        // Виведення результату пошуку
        if (index != -1) {
            System.out.println("\nЗнайдено студента: " + students[index]);
        } else {
            System.out.println("\nСтудента не знайдено.");
        }
    }
}