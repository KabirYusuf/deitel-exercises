package chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N\tN2\tN3\tN4");
        for (int i = 1; i <= 5; i++) {
            int num = i;
            System.out.print(i);
            System.out.print("\t");
            for (int j = 1; j < 4; j++) {
                num *= i;
                System.out.print(num);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
