package day19;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);

        String str = zuko.nextLine(); //"rebyC"

        //String result = ""+str.charAt(4)+str.charAt(3)+str.charAt(2)+str.charAt(1)+ str.charAt(0);


        String result = "";

        for (int i= str.length()-1; i>=0;i--){//i: 4, 3, 2, 1, 0
            result+= str.charAt(i);
        }

        System.out.println(result);













    }
}
