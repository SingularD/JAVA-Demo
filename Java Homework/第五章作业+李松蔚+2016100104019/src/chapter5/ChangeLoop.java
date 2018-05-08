package chapter5;

public class ChangeLoop {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0;i< 4;i++){
//            if (i % 3 == 0) continue;
//            sum += i;
//        }
        int i = 0,sum = 0;
        while (i < 4){
            if (i%3 == 0){
                i++;
                continue;
            }
            sum += i;
            i++;
        }
    }
}
