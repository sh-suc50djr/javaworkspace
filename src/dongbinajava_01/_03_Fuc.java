package dongbinajava_01;

public class _03_Fuc {
    public static int max(int a, int b){
        return (a>b)?a:b;
    }
    public static int fuc(int a, int b, int c){
        int result = max(a,b);
        return max(result,c);
    }

    public static void main(String[] args) {
        System.out.println("345,367,789 중 가장 큰값은 : "+fuc(345,367,789));
    }
}
