package Collection;

public class ClassNamingForLeetCodePrograms
{
    public static void main(String[] args)
    {
        System.out.println(nameForClass("  Final Value of Variable After Performing Operations"));
    }

    static String nameForClass(String str) {
        str = " LeetCode".concat(str);
        String newStr = "";
        String[] arr = str.split(" ");
        for(String i: arr) {
                newStr += i;
        }
        return newStr;
    }

}
