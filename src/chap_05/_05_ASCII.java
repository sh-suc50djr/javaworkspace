package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seat3 = new String[10][15];
        char ch ='A';
        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                seat3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                System.out.print(seat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
