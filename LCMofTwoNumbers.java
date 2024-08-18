package Collection;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        System.out.println(calcLCM(a,b));
        System.out.println(findLCM(a,b));

    }

    public static int calcLCM(int a, int b){
        int max = Math.max(a, b);
        while (true){
            if(max%a==0 && max%b==0){
                return max;
            }
            ++max;
        }
    }

    public static int findLCM(int a, int b){
        int i = 1;
        int max;
        while(true){
            max = Math.max(a, b)*i;
            if(max%a == 0 && max%b== 0){
                return max;
            }
            i++;
        }
    }
}
