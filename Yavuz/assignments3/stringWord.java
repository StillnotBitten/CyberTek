package assignments3;

import java.util.Scanner;

public class stringWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*        System.out.println("In: ");
        String word = scan.nextLine();

        for (int i =0;i<=word.length()-1;i++){
            System.out.println(""+word.charAt(i));
        }
 */

        System.out.println("In: ");
        String word = scan.nextLine();
        for (int i =0;i<=word.length()-1;i++){
           char vowel = word.charAt(i);
            if (vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'){
                System.out.println(vowel);
            }
        }











    }
}
