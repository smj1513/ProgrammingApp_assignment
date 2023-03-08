public class ch11 {
    public static void main(String[] args) {
        String str = "0012340001230000";
        System.out.println("String    = " + str);
        str = removeTrailZ(str);
        System.out.println("Converted = " + str);
    }

    public static String removeTrailZ(String str) {
        char[] ch = str.toCharArray();
        int idx = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] != '0') {
                idx = i;
                break;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <= idx; i++) {
            stringBuffer.append(ch[i]);
        }
        return stringBuffer.toString();
    }
}
