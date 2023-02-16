package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열 (2차원 배열)
        String[] seatA = {"A1", "A2", "A3"};
        String[] seatB = {"B1", "B2", "B3"};
        String[] seatC = {"C1", "C2", "C3"};

        //3 * 3크기의 2차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };
        System.out.println(seats[1][1]); //B2

        //3차원 배열 2*2*3
        String[][][] marray = new String[][][]{
                {{},{},{}},
                {{},{},{}}
        };

    }
}
