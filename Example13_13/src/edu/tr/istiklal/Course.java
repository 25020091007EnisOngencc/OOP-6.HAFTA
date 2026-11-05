package edu.tr.istiklal;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    /** Derin Kopyalama (Deep Copy) yapan clone metodu */
    @Override
    public Object clone() {
        try {
            // Course nesnesinin temel kopyasını oluşturma
            Course courseClone = (Course) super.clone();
            
            // students dizisinin derin kopyasını alarak dizileri bağımsız kılma
            courseClone.students = this.students.clone();
            
            return courseClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}