import java.util.*;

public class array1 {

    Void demoarray() {
        int[] ages = new int[3];
        float[] weight = new float[3];
        
        System.out.println("length of array is => " + ages.length);

        ages[1] = 22;
        ages[0] = 23;
        ages[2] = 24;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        weight[0] = 22.3f;
        weight[1] = 23.2f;
        weight[2] = 24.4f;

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        return null;

    }

    public static void main(String[] args) {

        array1 obj = new array1();
        obj.demoarray();
    }

}
