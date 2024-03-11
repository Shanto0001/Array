import java.util.*;

class array4 {
    void newarr() {
        int[][] arr = new int[2][4];
        int[] arri = { 1, 2, 3, 4, 5, 6 };

        System.out.println(arri.length);
        for (int i = 0; i < arri.length; i++) {
            System.out.println(arri[0]);
        }
    }

    public static void main(String[] args) {

        array4 obj = new array4();
        obj.newarr();
    }
}
