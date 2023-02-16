package chap_04;

public class _06_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문 왼쪽 삼각형
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        //오른쪽 삼각형
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
