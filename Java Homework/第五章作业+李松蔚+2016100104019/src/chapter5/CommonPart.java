package chapter5;

import java.util.Scanner;

public class CommonPart {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String p1 = p.nextLine();
        System.out.print("Enter the second String:");
        String p2 = p.nextLine();
        String[] P1 = new String[100];
        String[] P2 = new String[100];
        String[] all = new String[100];
        P1 = p1.split("");
        P2 = p2.split("");
        for (int i = 0;i < P1.length;i++){
            if (P1[i] == P2[i]){
                all[i] = P1[i];
                System.out.println(all[i]);
            }else break;
        }
        String res = "";
        for (int j = 0;j < all.length;j++){
            res += all[j];
        }
        System.out.println(res);
    }
}
