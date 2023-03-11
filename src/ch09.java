public class ch09 {
    public static void main(String[] args) {
        String str = "Hello Java World!";
        System.out.println("String          = " + str);
        System.out.println("Reversed String = " + reverse(str));
    }

    private static String reverse(String str) {
        String[] words = str.split("");
        String[] reverseWords = new String[words.length];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reverseWords[i] = wordsReverse(words[i].toCharArray());
            stringBuilder.append(reverseWords[i] + " ");
        }
        return stringBuilder.toString();
    }

    private static String wordsReverse(char[] ch) {
        char[] reverse_ch = new char[ch.length];
        int j = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            reverse_ch[i] = ch[j++];
        }
        return new String(reverse_ch);
    }
}
