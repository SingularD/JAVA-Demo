package chapter6;

 class father{
    public void sayHi(){
        System.out.println("hello");
    }
}

class son extends father{

}

public class test {
     void say(){
         son s = new son();
        s.sayHi();
     }


}
