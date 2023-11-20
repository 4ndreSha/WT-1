package task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5, 6};
        double[] b = {0, 4, 6, 8, 9, 10};
        System.out.println(Arrays.toString(findIndices(a, b)));
    }

    public static double[] findIndices(double[] a, double[] b){
        int bIndex = 0;
        double[] indices = new double[b.length];
        int iIndex = 0;
        int aIndex = 0;
        while (aIndex < a.length && bIndex < b.length){
            if (b[bIndex] <= a[aIndex]) {
                indices[iIndex++] = aIndex;
                bIndex++;
            }
            else aIndex++;
        }
        while (iIndex < b.length){
            indices[iIndex++] = a.length-1;
        }
        return indices;
    }
}
