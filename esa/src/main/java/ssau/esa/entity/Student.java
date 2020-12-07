package ssau.esa.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    private long mobile;
    private String name;
    private  String surname;
    private int course;
    private Faculty faculty;

    public Student(){}

    @Id
    @Column(name = "mobile_phone", nullable = false, length = 100)
    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "surname", nullable = false, length = 100)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "course", nullable = false)
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @ManyToOne(optional = false, cascade = {CascadeType.ALL})
    @JoinColumn(name = "faculty_id")
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
