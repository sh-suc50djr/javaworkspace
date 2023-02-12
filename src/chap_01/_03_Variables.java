package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;  //-21억부터 21억까지
        double score = 90.5;
        char grade = 'A';
        boolean pass = true;
        float d = 3.14f; //기본적으로 double 자료형이라고 인식 걍 float은 안쓴다 쓸려면 뒤에 f,F 를 넣어줘야 함
        //float은 기본적으로 소수점 밑 7자리까지 운용 가능 걍 double 쓰셈 메모리 차이인듯
        long l = 10000000000L; //int 보다 더 넓은 범위의 정수형
        l = 1_000_000_000_000L;

        System.out.println(name + "의 평균 점수는" + score + "점이고" + " 학점은" + grade + " 입니다");
        System.out.println(name + " 하이" + hour + "시에 방문");
    }
}
