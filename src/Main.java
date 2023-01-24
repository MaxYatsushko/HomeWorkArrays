import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1_2_3_4();
    }

    public static void task1_2_3_4(){
        int [] elemInt = new int[3];
        elemInt[0] = 1;
        elemInt[1] = 2;
        elemInt[2] = 3;

        double [] elemDouble = {1.57, 7.654, 9.986};

        char [] elemChar = new char[]{'s', 'v', 'a'};

        System.out.println("Демонастрация задачи 2");
        for (int i = 0; i < elemInt.length; i++)
            System.out.print(elemInt[i] + (i != elemInt.length - 1 ? "," : ""));

        System.out.println();
        //System.out.println(Arrays.toString(elemDouble));

        for (int i = 0; i < elemDouble.length; i++)
            System.out.print(elemDouble[i] + (i != elemDouble.length - 1 ? "," : ""));
        System.out.println();

        for (int i = 0; i < elemChar.length; i++)
            System.out.print(elemChar[i] + (i != elemChar.length - 1 ? "," : ""));
        System.out.println();


        System.out.println("Демонастрация задачи 3");
        for (int i = elemInt.length - 1; i >= 0; i--)
            System.out.print(elemInt[i] + (i != 0 ? "," : ""));

        System.out.println();
        //System.out.println(Arrays.toString(elemDouble));

        for (int i = elemDouble.length - 1; i >= 0; i--)
            System.out.print(elemDouble[i] + (i != 0 ? "," : ""));
        System.out.println();

        for (int i = elemChar.length - 1; i >= 0; i--)
            System.out.print(elemChar[i] + (i != 0 ? "," : ""));
        System.out.println();

        System.out.println("Демонастрация задачи 4");
        for (int i = 0; i < elemInt.length; i++) {
            if (elemInt[i] % 2 != 0) elemInt[i] += 1;
            System.out.print(elemInt[i] + (i != elemInt.length - 1 ? "," : ""));
        }
    }
}