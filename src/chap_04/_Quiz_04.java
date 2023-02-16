package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String car = "disability";
        int time = 10;
        int dollor = 0;
        int max = 30000;

        switch (car){
            case "normal":
                dollor = time * 4000;
                break;
            case "small":
                dollor = (time * 4000) / 2;
                break;
            case "disability":
                dollor = (time * 4000) / 2;
                break;
        }
        if (dollor >= 30000 && car =="small" || car == "disability" ){
            dollor = 15000;
            System.out.println("주차요금은 "+dollor+"원입니다.");
            return;
        }
        System.out.println("주차요금은 "+dollor+"원입니다.");
    }
}

