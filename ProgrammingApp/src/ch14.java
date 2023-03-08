import java.util.Scanner;
public class ch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("Input Number?");
        num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
