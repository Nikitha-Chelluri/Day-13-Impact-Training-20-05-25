import java.util.*;

class SmallMissingLetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < chars.length(); i++) {
            char n = chars.charAt(i);
            if (str.indexOf(n) != -1) {
                continue;
            }
            else {
                System.out.println(chars.charAt(i));
                break;
            }
        }
    }
}