package chapter4;

public class CheckBoardPattern {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                if (i % 2 == 1){
                    System.out.print("* ");
                    System.out.print(" ");
                }else {
                    System.out.print(" ");
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
