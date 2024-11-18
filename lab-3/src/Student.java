import java.util.Objects;

/**
 * Клас Student представляє інформацію про студента.
 */
class Student {
    private String name;
    private int age;
    private double gpa; // Grade Point Average
    private String group;
    private int year;

    public Student(String name, int age, double gpa, String group, int year) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.group = group;
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", group='" + group + '\'' +
                ", year=" + year +
                '}';
    }

    // Метод для перевірки рівності двох об'єктів Student
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.gpa, gpa) == 0 &&
                year == student.year &&
                Objects.equals(name, student.name) &&
                Objects.equals(group, student.group);
    }
}
