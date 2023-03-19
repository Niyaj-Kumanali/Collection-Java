package Collection;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float y = sc.nextFloat();
        float x = sc.nextFloat();

        y = y / 100.0f;
        float bmi = x / (y * y);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi < 24.9)
            System.out.println("Normal");
        else if (bmi >= 24.4 && bmi < 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        System.out.printf("%.1f",bmi);
        sc.close();
    }

}
