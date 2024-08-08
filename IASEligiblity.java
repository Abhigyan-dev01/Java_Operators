package programmingclass;


//agelimit 21 to 32

import java.util.Scanner;

public class EligiblityforIAS {

    static boolean eligiblity(int age)
    {
        if(age>21 && age<32)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=in.nextInt();
        boolean flag=eligiblity(age);
        
        if(flag)
            System.out.println("ELIGIBLE");
        else
            System.out.println("NOT ELIGIBLE");
    }
}
