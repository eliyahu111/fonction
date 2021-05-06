import java.util.Arrays;

public class fanction {
    public static int Minnut(int[] Min) {
        int a = Min[0];
        for (int i = 0; i < Min.length; i++) {
            a = Math.min(a, Min[i]);
            //  a = Min[i];


        }
        return a;
    }

    public static int NimIndext(int[] index) {
        int Min = 0;
        for (int i = 0; i < index.length; i++) {
            if (index[Min] > index[i]) {
                Min = i;


            }
        }

        return Min;

    }


    public static void main(String[] args) {
        int[] b = {3, 50, 3, 0, 5};
       // Minnut(b);
       // System.out.println(Minnut(b));
        NimIndext(b);
        System.out.println(NimIndext(b));

    }


}







