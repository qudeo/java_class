package ch11_array.ex4;

import ch11_array.ex2.Student;

public class StudentDTO {

        private Long id;
        private String studentName;
        private String studentNumber;
        private String studentMajor;
        private String studentmobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentmobile() {
        return studentmobile;
    }

    public void setStudentmobile(String studentmobile) {
        this.studentmobile = studentmobile;
    }

    public static Long getIdValue() {
        return idValue;
    }

    public static void setIdValue(Long idValue) {
        StudentDTO.idValue = idValue;
    }

    public StudentDTO() {

        }
    private static Long idValue = 1L;

    public StudentDTO(String studentName, String studentNumber, String studentMajor, String studentmobile) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentmobile = studentmobile;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentmobile='" + studentmobile + '\'' +
                '}';
    }
}

