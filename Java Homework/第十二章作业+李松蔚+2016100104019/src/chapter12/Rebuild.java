package chapter12;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Rebuild {
    public static void main(String[] args){
        File file = new File("Test.java");
        try(Scanner cin = new Scanner(file)){
            ArrayList<StringBuilder> ls = new ArrayList<>();
            while(cin.hasNext()){
                ls.add(new StringBuilder(cin.nextLine()));
            }
            int len = ls.size();
            for(int i = 1; i < len; ++i){
                int index = -1;
                if((index = ls.get(i).indexOf("{"))!= -1){
                    ls.get(i).replace(index,index+1," ");
                    ls.get(i-1).insert(ls.get(i-1).length(), "{");
                }
            }
            try(PrintWriter out = new PrintWriter(file)){
                for(StringBuilder str : ls){
                    out.println(str);
                }
            }
            catch(FileNotFoundException ex){
                System.out.println(ex.toString());
            }
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.toString());
        }
    }
}
