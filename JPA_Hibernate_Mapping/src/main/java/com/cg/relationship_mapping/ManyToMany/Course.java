package com.cg.relationship_mapping.ManyToMany;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;

    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;


    public Course() {}

    public Course(String courseName) {
        super();
        this.courseName = courseName;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", courseName='" + courseName + '\'' +
                ", students=" + students +
                '}';
    }
}
