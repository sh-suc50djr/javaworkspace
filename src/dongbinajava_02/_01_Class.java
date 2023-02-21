package dongbinajava_02;

import java.util.Scanner;

public class _01_Class {
    public static void main(String[] args) {
//        Node one = new Node(10,20);
//        Node two = new Node(30,40);
//        Node result = one.getcenter(two);
//        System.out.println("x :" + result.getX() + " y : " + result.getY());
//
//        Student student = new Student("홍길동",20,175,70,"60205159",1,4.5);
//        Student student2 = new Student("이순신",20,175,70,"60205859",2,4.0);
//        student.show();
//        student2.show();
//        Student[] students = new Student[100];
//        for (int i = 0; i < 100; i++) {
//            students[i] = new Student("홍길동", 20, 175, 70, i+"",1,4.5);
//            students[i].show();
//        }
//        Teacher teacher1 = new Teacher("John doe", 25, 180, 100, "ABC101", 3000, 3);
//        teacher1.show();


        Scanner scanner = new Scanner(System.in);
        System.out.print("총 몇명의 학생을 입력하시겠습니까? ");
        int num = scanner.nextInt();
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++) {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double GPA;
            System.out.print("학생의 이름을 입력해주세요: ");
            name = scanner.next(); // 그냥 next로 받으면 띄어쓰기를 포함하지 않는 문자열을 입력받음
            System.out.print("학생의 나이를 입력해주세요: ");
            age = scanner.nextInt();
            System.out.print("학생의 키를 입력해주세요: ");
            height = scanner.nextInt();
            System.out.print("학생의 몸무게를 입력해주세요: ");
            weight = scanner.nextInt();
            System.out.print("학생의 아이디를 입력해주세요: ");
            studentID = scanner.next();
            System.out.print("학생의 성적을 입력해주세요: ");
            grade = scanner.nextInt();
            System.out.print("학생의 GPA를 입력해주세요: ");
            GPA = scanner.nextDouble();
            students[i] = new Student(name,age,height,weight,studentID,grade,GPA);
        }
        for (int i = 0; i < num; i++) {
            students[i].show();
        }
    }
}
