// import java.util.*;
// class Vowel {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         int count = 0;
//         int m = str.length();
//         for (int i = 0; i < m; i++) {
//             if (str.charAt(i) == 'a'){
//                 count++;
//             }
//             else if (str.charAt(i) == 'e'){
//                 count++;
//             }
//             else if (str.charAt(i) == 'i'){
//                 count++;
//             }
//             else if (str.charAt(i) == 'o'){
//                 count++;
//             }
//             else if (str.charAt(i) == 'u'){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
import java.util.*;
class Vowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = 0;
        int m = str.length();
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < m; i++) {
            int a = str.charAt(i);
            if (vowel.indexOf(a) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}