public class IT24101675DMLab1Q2 {
    public static void main(String[] args) {
        //creating array A and B
        int[] A = {10,20,30,40,50};
        int[] B = {34,67,12,89,12};
        //creating new array C
        int[] C = new int[5];
        //calculating A+B and store in array C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        System.out.print("Array C: [");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
            if (i < C.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
