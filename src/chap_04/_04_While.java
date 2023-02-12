package chap_04;

public class _04_While {
    public static void main(String[] args) {
        int dis =25;
        int move = 0;
        while (move < dis){
            System.out.println("현재 이동 거리 :" + move);
            move += 3; //3미터 이동
        }
    }
}
