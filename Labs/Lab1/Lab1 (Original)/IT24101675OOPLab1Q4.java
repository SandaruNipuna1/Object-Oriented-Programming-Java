public class IT24101675DMLab1Q4 {
    public static void main(String[] args) {
        //using while loop
        String whilePattern = "* * * * *";
        int i = 1;

        System.out.println("While Pattern");
        while (i <= 5) {
            System.out.println(whilePattern);
            i++;
        }
        System.out.println("\n \n");

        //using for loop
        System.out.println("For Loop Pattern");
        for (int row = 1; row <= 5; row++) {
            for (int space = 5 - row; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}