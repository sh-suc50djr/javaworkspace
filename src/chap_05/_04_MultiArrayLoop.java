package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seat3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                seat3[i][j] = eng[i] + (j + 1);
            }
        }

        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                System.out.print(seat3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
