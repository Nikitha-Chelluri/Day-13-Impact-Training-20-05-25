// import java.util.*;
// class Vowel {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         String r = s.reverse();
//         if (r.equals(str)){
//             System.out.println("True");
//         }
//         else {
//             System.out.println("False");
//         }
//     }
// }

import java.util.*;
class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse+str.charAt(i);
        }
        if (reverse.equals(str)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
