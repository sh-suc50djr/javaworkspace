package dongbinajava_06;

public class ObjectPrac {
    // 객체(Object) 클래스는 모든 객체의 조상으로써 쓰인다
    // 자바에서 모든클래스는 암시적으로 Object클래스를 상속 받고 있다
    // 객체 클래스가 존재하는 이유는 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공하기 위함이다
    public static void main(String[] args) {
        Archer archer1 = new Archer("궁수1","상");
        Archer archer2 = new Archer("궁수2", "중");
        // 위 두 인스턴스가 내부변수 값이 같아도 인스턴스 자체가 다르기 때문에 독립의 인스턴스임
        System.out.println(archer1.equals(archer2));
        //equals 함수는 내부 변수의 값만 비교해서 값이 같다면 true 반환

    }
}
