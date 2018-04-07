import java.util.Scanner;

public class Step1 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入：");
//        if(s.hasNext()){
//            String str1 = s.next();
//            System.out.println(str1);
//        }
        if(s.hasNextLine()){
            String str2 = s.nextLine();
            System.out.println(str2);
        }
    }
}
