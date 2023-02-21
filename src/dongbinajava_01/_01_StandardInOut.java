package dongbinajava_01;

import java.util.Scanner;

public class _01_StandardInOut {
    public static void main(String[] args) {
        //Scanner 클래스
        Scanner sc = new Scanner(System.in);
        //시스템인 은 콘솔창에서 다루는 데이터를 의미함
        System.out.print("정수를 입력하세요: ");
        int i = sc.nextInt();
        System.out.println("입력된 정수는 "+i+"입니다.");
        sc.close();

    }
}
