

import uestc.People;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        People student1 = new People("lisongwei");
        People student2 = new People("liangtao");

        student1.peoAge(12);
        student2.peoAge(15);
        student1.peoId(12308);
        student2.peoId(91241);
        student1.peoGrade("one");
        student2.peoGrade("two");
        student1.printF();
        student2.printF();
    }
}
