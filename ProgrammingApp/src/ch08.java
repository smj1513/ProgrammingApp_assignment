public class ch08 {
    public static void main(String[] args) {
        String str = "Hello this is Java World";
        System.out.println("String is : " + str);
        count(str);
    }

    public static void count(String str) {
        String[] words = str.split("");
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
        }
    }
}
