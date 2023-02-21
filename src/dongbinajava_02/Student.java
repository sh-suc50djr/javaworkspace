package dongbinajava_02;

public class Student extends Person{
    private String studentID;
    private int grade;
    private double GPA;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, int age, int height, int weight, String studentID, int grade, double GPA) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.GPA = GPA;
    }
    public void show(){
        System.out.println("------------------");
        System.out.println("학생 이름 : " + getName());
        System.out.println("학생 나이 : " + getAge());
        System.out.println("학생 키 : " + getHeight());
        System.out.println("학생 무게 : " + getWeight());
        System.out.println("학생 아이디 : " + getStudentID());
        System.out.println("학생 성적 : " + getGrade());
        System.out.println("학생 GPA : " + getGPA());
    }
}
