import java.util.Scanner;

/*** 문제 1.3 대소문자 판별 및 변환기* 작성일:2023-03-06* 작성자:성민제* */
public class ch03 {
    public static void main(String[] args) {
        final int LOWER_CASE_ASCII_MIN = 97;
        final int LOWER_CASE_ASCII_MAX = 122;
        final int UPPER_CASE_ASCII_MIN = 65;
        final int UPPER_CASE_ASCII_MAX = 90;
        char alpha = '\0';
        int ascii = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input charcter?");
        alpha = sc.next().charAt(0);
        ascii = alpha;
        if (ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX) {
            System.out.println(alpha + "는 소문자");
            System.out.println(alpha + "의 대문자는 " + (char) (ascii - ' '));
        } else if (ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX) {
            System.out.println(alpha + "는 대문자");
            System.out.println(alpha + "의 소문자는 " + (char) (ascii + ' '));
        } else {
            System.out.println(alpha + "는 문자가 아님.");
        }
    }
}