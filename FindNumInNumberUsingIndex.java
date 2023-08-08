package Collection;
public class FindNumInNumberUsingIndex {
    public static void main(String[] args) {
        int num = 12345;
        int position = 4;
        String temp = Integer.toString(num);
        int posVal = Integer.parseInt(Character.toString(temp.charAt(position -1)));
        System.out.println(posVal);
        findNum(num, position);
    }

    public static void findNum(int num, int pos){
        for (int i = 1; i < pos; i++) {
            num /= 10;
        }
        System.out.println(num % 10);
    }
}
