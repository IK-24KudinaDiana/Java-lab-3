# Java-lab-3

This project implements the student sorting program (GPA) and a year of study using standard sorting tools in Java.

## Content

- [Requirements](##Requirements)
- [Installation](##Installation)
- [Startup](##Startup)
- [Using](##Using)
- [Examples](##Examples)

## Requirements

- JDK 17

## Installation

1. Clone the repository:
   
    ```bash
    git clone https://github.com/IK-24KudinaDiana/Java-lab-3.git
    ```

2. Go to the project directory:
   
    ```bash
    cd Java-lab-3
    ```

## Startup

- Compile and run the program from the command line:

    ```bash
    javac Main.java
    java Main
    ```

## Using

The program creates an array of students, sorts it by two criteria: by the increase in the average score (GPA) and by the decline of the year of study, as well as looking for a student who is identical to the given object.

### Input
- The program accepts an array of students, each of which has a name, age, GPA, group and year of study.

### Output
- a sorted list of students is displayed.
- The result of the search for a given student in the array is also displayed.

## Examples

Example of program execution:

```bash
Відсортований список студентів:
Student{name='Bob', age=21, gpa=3.6, group='ІС-13', year=3}
Student{name='Eve', age=20, gpa=3.8, group='ІС-31', year=2}
Student{name='Alice', age=20, gpa=3.8, group='ІК-11', year=2}
Student{name='Diana', age=20, gpa=5.0, group='ІК-24', year=3}
Student{name='Charlie', age=19, gpa=3.9, group='IA-21', year=1}

Знайдено студента: Student{name='Diana', age=20, gpa=5.0, group='ІК-24', year=3}
