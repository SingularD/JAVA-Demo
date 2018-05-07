import uestc.Arr;
import uestc.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arr arr = new Arr();
        int [] copy = arr.getArr();
        System.out.println(Arrays.toString(copy));
    }
}
