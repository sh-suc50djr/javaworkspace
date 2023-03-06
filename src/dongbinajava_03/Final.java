package dongbinajava_03;

public class Final {
    public static void main(String[] args) {
        //자바는 절대 변하지 않는 특정한 것을 정하고 싶을 때는 final을 사용한다
        // 변수에 사용할 경우 변하지 않는 상수가 되며, 메소드에 사용하면 재정의가 불가능한 메소드가 되고
        // 클래스에 사용하면 상속이 불가능한 하나의 완전한 클래스가 되는 것

        final int number = 10;

    }

    public final void show(){
        // 오버라이딩 불가 내용 그대로 사용해야함
    }

    //final class Parent  <- 상속이 불가능한 하나의 완전한 클래스
}
