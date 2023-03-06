package dongbinajava_04;

public class InterFace implements Dog,Cat{
    // 인터페이스는 반드시 사전에 정의된 추상 메소드와 상수만을 가질수 있다는 특징이 있다
    // 인터페이스는 팀 프로젝트의 동시 작업에 유리하고 추상보다 요구되는 설계의 기준이 높아서 더 체계적이라는 평을 받는다
    // 다중상속을 가능케한다
    // 추상화화 비슷하지만 더 엄격하다
    // 인터페이스 안에서 내용을 정의할 수 없다 설계만 가능

    //implements를 사용 겹치는 메소드가 있다면 하나만 정의해도 오류가 안남
    public static void main(String[] args) {
        InterFace main = new InterFace();
        main.cring();
        main.show();
    }

    @Override
    public void cring() {
        System.out.println("월우러");
    }

    @Override
    public void show() {
        System.out.println("hello world");
    }

    @Override
    public void crying() {

    }

    @Override
    public void one() {

    }
}
