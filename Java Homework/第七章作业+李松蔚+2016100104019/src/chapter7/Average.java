package chapter7;

public class Average {
    public static int average(int[] array){
        int sum = 0;
        for (int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        int sum = 0;
        for (int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }
    //
}
