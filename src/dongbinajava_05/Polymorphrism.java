package dongbinajava_05;

import java.util.Scanner;

public class Polymorphrism {
    // 자바는 다형성을 이용하여 객체를 사용할 때 변수 형태를 바꾸어 여러 타입의 객체를 참조할 수 있다
    // 다형성은 부모 클래스 타입의 참조 변수로 하위 클래스으 객체를 참조할 수 있게 해준다
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("바나나 : 1, 복숭아 : 2");
        int input = scanner.nextInt();
        Fruit fruit;
        if(input == 1){
            fruit = new Banana();
            fruit.show();
        } else if (input == 2) {
            fruit = new Peach();
            fruit.show();
        }

    }

}
