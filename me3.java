import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class me3 {
            //
            public static void main(String[] args) {
                System.out.println("LAB PROGRAM 1 PHYTHON IN JAVA");
                Scanner sc = new Scanner(System.in);
                ArrayList dt = new ArrayList<>();
                System.out.println("enter the test1 marks");
                int test1 = sc.nextInt();
                System.out.println("enter the test2 marks");
                int test2 = sc.nextInt();
                System.out.println("enter the test3 marks");
                int  test3= sc.nextInt();
                dt.add(test1);
                dt.add(test2);
                dt.add(test3);
                System.out.println(dt);
                Collections.reverse(dt);
                System.out.println(dt);
                int element1 =  (int) dt.get(0);
                int element2 =   (int) dt.get(1);
                int element3 =  (int) dt.get(2);

                float avg = (element1+element2+element3)/4 ;
                System.out.println("the avg of test marks is"+avg);
                
            }
}
