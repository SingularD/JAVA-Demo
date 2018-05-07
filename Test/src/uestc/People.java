package uestc;

public class People {
    String name;
    int age;
    int id;
    String grade;
    public People(String name){
        this.name = name;
    }
    public void peoAge(int age){
        this.age = age;
    }
    public void peoId(int id){
        this.id = id;
    }
    public void peoGrade(String grade){
        this.grade = grade;
    }
    public void printF(){
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("id:" + this.id);
        System.out.println("grade:" + this.grade + "\n");
    }
}
