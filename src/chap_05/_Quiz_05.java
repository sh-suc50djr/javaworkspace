package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoesize = new int[10];
        int a =250;
        for (int i = 0; i < shoesize.length; i++) {
            shoesize[i] = a;
            a += 5;
        }
        for (int size:shoesize) {
            System.out.print(size+ " ");
        }
    }
}
