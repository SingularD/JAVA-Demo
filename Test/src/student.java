import java.util.Scanner;

public class student {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()){
            int a = scan.nextInt();
            for (int i = 0;i < 3;i++){
                System.out.println(i);
            }
        }
    }
}
