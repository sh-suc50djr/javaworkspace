package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        // 배열 선언 첫번쨰 방법
        String[] coffees = new String[4];

        //두번쨰 방법
        String coffes[] = new String[4];
        coffees[0] = "아메리카노";

        //세번쨰 방법              여기 숫자 안넣음
        String cofes[] = new String[] {"아메라키노","카페모카","라떼"};

        //네번째 방법
        String[] copess ={"아메라키노","카페모카","라떼"};

        int[] i = new int[3];
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = new boolean[] {true, true, false};
    }
}
