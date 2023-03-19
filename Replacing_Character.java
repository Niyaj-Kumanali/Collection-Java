package Collection;

public class Replacing_Character {
    public static void main(String[] args) {
        System.out.println(change_char("niyajn"));
    }

    public static String change_char(String s) {
        char first = s.charAt(0);
        char[] arr = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (first == s.charAt(i))
                arr[i] = '$';
        }
        return new String(arr);
    }
}
