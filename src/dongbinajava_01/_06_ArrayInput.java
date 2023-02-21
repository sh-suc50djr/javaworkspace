package dongbinajava_01;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class _06_ArrayInput {
    public static int max(int a, int b){
        return (a>b)?a:b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 배열의 크기를 입력하세요: ");
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("배열의 원소를 입력하세요: ");
            array[i] = scanner.nextInt();
        }
        int result = -1;
        for (int i = 0; i < num; i++) {
            result = max(result,array[i]);
        }
        System.out.println("배열의 최댓값은: "+result);
    }
}
