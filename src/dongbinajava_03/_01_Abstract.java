package dongbinajava_03;

public class _01_Abstract extends Player {
    // 자바에서는 미완성의 클래스라고 할 수 있는 추상 클래스를 제공
    // 추상클래스는 직접적으로 객체 인스턴스를 생성할 수 없다
    // 새로운 클래스를 작성하는데 밑바탕이 되는 역할을 해준다는 것에서 의미가 있다
    // 어느정도 미리 설계로서 틀을 갖추고 클래스를 작성할 수 있게 한다는 기능적인 측면에서 의미가 있다

    //추상클래스를 사용하려면 꼭 상속을 받아야하며 모든 추상 메소드는 반드시 구현을 해줘야 한다

    public static void main(String[] args) {
        // static으로 선언된 메인메소드 안에서 다른 메소드를 불러오려면
        // 불려오려는 메소드도 static으로 선언되어야 한다
        // 그래서 메인클래스 인스턴스를 하나 만들어서 해야함

        _01_Abstract main = new _01_Abstract();
        main.play("허각-나를 사랑했던 사람아");
        main.pause();
        main.stop();

        Dog dog = new Dog();
        Cay cat = new Cay();
        dog.crying();
        cat.crying();

    }
    @Override
    void play(String songName) {
        System.out.println(songName + "곡을 재생합니다.");
    }

    @Override
    void pause() {
        System.out.println("곡을 일시정지합니다.");
    }

    @Override
    void stop() {
        System.out.println("곡을 정지합니다.");
    }



}
