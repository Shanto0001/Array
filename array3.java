import java.util.*;

public class array3 {
    void threeD() {

        int[][][] arr = new int[3][3][3];
        arr[0][0][0] = 9;
        arr[1][0][0] = 10;
        arr[2][0][0] = 11;

        System.out.println(arr[0][0][0]);
        System.out.println(arr.length);

    }

    public static void main(String[] args) {
        array3 obj = new array3();
        obj.threeD();
    }
}
