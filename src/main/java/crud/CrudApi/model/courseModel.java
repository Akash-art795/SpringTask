package crud.CrudApi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courseTable")
public class courseModel {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student ID")
    private int studentid;
    @Column(name = "Student Name")
    private String studentName;
    @Column(name = "Contact No")
    private long phoneno;
    @Column(name = "Course ID")
    private int courseId;
    @Column(name = "Course Name")
    private String courseName;
    @Column(name = "Course Duration")
    private String courseDuration;
    @Column(name = "Course Timing")
    private String courseTime;

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public long getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseDuration() {
        return courseDuration;
    }
    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
    public String getCourseTime() {
        return courseTime;
    }
    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public courseModel(String studentName, long phoneno, int courseId, String courseName, String courseDuration, String courseTime) {
        this.studentName = studentName;
        this.phoneno = phoneno;
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseTime = courseTime;
    }

    public courseModel(){

    }

}
