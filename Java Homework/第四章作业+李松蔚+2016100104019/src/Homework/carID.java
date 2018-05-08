package Homework;

class Word{
    public static String string = "";
    public static String newWord(){
        for (int i = 0;i < 3;i++){
            string += (char)(Math.random()*26+'A');
        }
        return string;
    }
}

class Number{
    public static String id = "";
    public static String newNumber(){
        for (int j = 0;j<4;j++){
            id += (char) (Math.random()*10+'0');
        }
        return id;
    }
}

public class carID {
    public static String ID = "";
    public static void main(String[] args) {
        Word w = new Word();
        Number n = new Number();
        ID = w.newWord() + n.newNumber();
        System.out.println(ID);
    }
}
