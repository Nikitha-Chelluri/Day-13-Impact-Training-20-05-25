// import java.util.*;
// class CountLetter {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine();
//         String input = s.nextLine();
//         char n = input.charAt(0);
//         int count = 0;
//         char[] arr = str.toCharArray();
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == n){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
import java.util.*;
class CountLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String input = s.nextLine();
        char n = input.charAt(0);
        int count = 0;
        int m = str.length();
        for (int i = 0; i < m; i++) {
            if (str.charAt(i) == n){
                count++;
            }
        }
        System.out.println(count);
    }
}