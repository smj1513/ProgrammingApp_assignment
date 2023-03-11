/**
 * 프로그래밍 응용 과제
 * 1.2 숫자와 알파벳 매칭
 * 작성일: 2023-03-06
 * main 함수 내부
 * Scanner sc = new Scanner(System.in);
 * final int daf_ASCII=97;
 * int number = 0;
 * char alpha='\0';
 * System.out.printf("정수입력:");
 * number=sc.nextInt();
 * if(number>25 || number<0){
 * System.out.printf("0~25사이의 정수를 입력해주세요.");
 * System.exit(0);
 * }else{
 * alpha = (char)(daf_ASCII+number);
 * System.out.println("알파벳 출력 = "+ alpha);
 * }
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello Java World!";
 * System.out.println("String          = " + str);
 * System.out.println("Reversed String = " + reverse(str));
 * }
 * private static String reverse(String str){
 * String[] words = str.split(" ");
 * String[] reverseWords = new String[words.length];
 * StringBuilder stringBuilder = new StringBuilder();
 * for(int i = 0; i < words.length; i++){
 * reverseWords[i] = wordsReverse(words[i].toCharArray());
 * stringBuilder.append(reverseWords[i]+" ");
 * }
 * return stringBuilder.toString();
 * }
 * private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 * char[] reverse_ch = new char[ch.length];
 * int j = 0;
 * for(int i = ch.length-1; i>=0 ;i--){
 * reverse_ch[i]=ch[j++];
 * }
 * return new String(reverse_ch);
 * }
 * }
 * <p>
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 * public class Main {
 * public static void main(String[] args) {
 * String str = "12340000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = 0; i < ch.length; i++) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = idx ; i < ch.length; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * <p>
 * <p>
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "0012340001230000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = ch.length-1 ; i >= 0; i--) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = 0 ; i <= idx; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello Java World!";
 * System.out.println("String          = " + str);
 * System.out.println("Reversed String = " + reverse(str));
 * }
 * private static String reverse(String str){
 * String[] words = str.split(" ");
 * String[] reverseWords = new String[words.length];
 * StringBuilder stringBuilder = new StringBuilder();
 * for(int i = 0; i < words.length; i++){
 * reverseWords[i] = wordsReverse(words[i].toCharArray());
 * stringBuilder.append(reverseWords[i]+" ");
 * }
 * return stringBuilder.toString();
 * }
 * private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 * char[] reverse_ch = new char[ch.length];
 * int j = 0;
 * for(int i = ch.length-1; i>=0 ;i--){
 * reverse_ch[i]=ch[j++];
 * }
 * return new String(reverse_ch);
 * }
 * }
 * <p>
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 * public class Main {
 * public static void main(String[] args) {
 * String str = "12340000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = 0; i < ch.length; i++) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = idx ; i < ch.length; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "0012340001230000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = ch.length-1 ; i >= 0; i--) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = 0 ; i <= idx; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello Java World!";
 * System.out.println("String          = " + str);
 * System.out.println("Reversed String = " + reverse(str));
 * }
 * private static String reverse(String str){
 * String[] words = str.split(" ");
 * String[] reverseWords = new String[words.length];
 * StringBuilder stringBuilder = new StringBuilder();
 * for(int i = 0; i < words.length; i++){
 * reverseWords[i] = wordsReverse(words[i].toCharArray());
 * stringBuilder.append(reverseWords[i]+" ");
 * }
 * return stringBuilder.toString();
 * }
 * private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 * char[] reverse_ch = new char[ch.length];
 * int j = 0;
 * for(int i = ch.length-1; i>=0 ;i--){
 * reverse_ch[i]=ch[j++];
 * }
 * return new String(reverse_ch);
 * }
 * }
 * <p>
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 * public class Main {
 * public static void main(String[] args) {
 * String str = "12340000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = 0; i < ch.length; i++) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = idx ; i < ch.length; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "0012340001230000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = ch.length-1 ; i >= 0; i--) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = 0 ; i <= idx; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello Java World!";
 * System.out.println("String          = " + str);
 * System.out.println("Reversed String = " + reverse(str));
 * }
 * private static String reverse(String str){
 * String[] words = str.split(" ");
 * String[] reverseWords = new String[words.length];
 * StringBuilder stringBuilder = new StringBuilder();
 * for(int i = 0; i < words.length; i++){
 * reverseWords[i] = wordsReverse(words[i].toCharArray());
 * stringBuilder.append(reverseWords[i]+" ");
 * }
 * return stringBuilder.toString();
 * }
 * private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 * char[] reverse_ch = new char[ch.length];
 * int j = 0;
 * for(int i = ch.length-1; i>=0 ;i--){
 * reverse_ch[i]=ch[j++];
 * }
 * return new String(reverse_ch);
 * }
 * }
 * <p>
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 * public class Main {
 * public static void main(String[] args) {
 * String str = "12340000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = 0; i < ch.length; i++) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = idx ; i < ch.length; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "0012340001230000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = ch.length-1 ; i >= 0; i--) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = 0 ; i <= idx; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello Java World!";
 * System.out.println("String          = " + str);
 * System.out.println("Reversed String = " + reverse(str));
 * }
 * private static String reverse(String str){
 * String[] words = str.split(" ");
 * String[] reverseWords = new String[words.length];
 * StringBuilder stringBuilder = new StringBuilder();
 * for(int i = 0; i < words.length; i++){
 * reverseWords[i] = wordsReverse(words[i].toCharArray());
 * stringBuilder.append(reverseWords[i]+" ");
 * }
 * return stringBuilder.toString();
 * }
 * private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 * char[] reverse_ch = new char[ch.length];
 * int j = 0;
 * for(int i = ch.length-1; i>=0 ;i--){
 * reverse_ch[i]=ch[j++];
 * }
 * return new String(reverse_ch);
 * }
 * }
 * <p>
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 * public class Main {
 * public static void main(String[] args) {
 * String str = "12340000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = 0; i < ch.length; i++) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = idx ; i < ch.length; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "0012340001230000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = ch.length-1 ; i >= 0; i--) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = 0 ; i <= idx; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.2 a-z 알파벳 출력
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인함수
 * final int daf_ASCII = 97;
 * final int loop_num = 26;
 * char ch = daf_ASCII;
 * StringBuffer Alpha = new StringBuffer();
 * for(int i = 0; i < loop_num; i++){
 * Alpha.append(ch++);
 * }
 * System.out.printf(String.valueOf(Alpha));
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello Java World!";
 * System.out.println("String          = " + str);
 * System.out.println("Reversed String = " + reverse(str));
 * }
 * private static String reverse(String str){
 * String[] words = str.split(" ");
 * String[] reverseWords = new String[words.length];
 * StringBuilder stringBuilder = new StringBuilder();
 * for(int i = 0; i < words.length; i++){
 * reverseWords[i] = wordsReverse(words[i].toCharArray());
 * stringBuilder.append(reverseWords[i]+" ");
 * }
 * return stringBuilder.toString();
 * }
 * private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 * char[] reverse_ch = new char[ch.length];
 * int j = 0;
 * for(int i = ch.length-1; i>=0 ;i--){
 * reverse_ch[i]=ch[j++];
 * }
 * return new String(reverse_ch);
 * }
 * }
 * <p>
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 * public class Main {
 * public static void main(String[] args) {
 * String str = "12340000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = 0; i < ch.length; i++) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = idx ; i < ch.length; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "0012340001230000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = ch.length-1 ; i >= 0; i--) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = 0 ; i <= idx; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 * final int LOWER_CASE_ASCII_MIN = 97;
 * final int LOWER_CASE_ASCII_MAX = 122;
 * final int UPPER_CASE_ASCII_MIN = 65;
 * final int UPPER_CASE_ASCII_MAX = 90;
 * char alpha = '\0';
 * int ascii = 0;
 * Scanner sc = new Scanner(System.in);
 * System.out.printf("Input charcter?");
 * alpha = sc.next().charAt(0);
 * ascii = alpha;
 * if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 소문자");
 * System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 * }
 * else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 * System.out.println(alpha+"는 대문자");
 * System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 * }else{
 * System.out.println(alpha+"는 문자가 아님.");
 * }
 * <p>
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input the string: ");
 * String str = in.nextLine();
 * System.out.print("Number of words: " + count_Words(str) + "\n");
 * }
 * <p>
 * private static int count_Words(String str){
 * return str.split(" ").length;
 * }
 * <p>
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * System.out.println(sTimes("Hi", 3));
 * System.out.println(sTimes("Hello", 2));
 * System.out.println(sTimes("My Java", 2));
 * }
 * private static String sTimes(String str, int num){
 * StringBuffer strb = new StringBuffer(str);
 * for(int i = 0; i<num-1;i++){
 * strb.append(str);
 * }
 * return strb.toString();
 * }
 * }
 * <p>
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input a string: ");
 * String str = in.nextLine();
 * System.out.print("The middle character in the string: " + middle(str) + "\n");
 * }
 * <p>
 * private static String middle(String str){
 * String temp;
 * int mid = str.length()/2;
 * if(str.length()%2==1){
 * temp = Character.toString(str.charAt(mid));
 * }else{
 * temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 * }
 * return temp;
 * }
 * }
 * <p>
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.print("1. 8글자 이상입니다.\n"
 * + "2. 영문자와 숫자만 사용 가능합니다. \n"
 * + "3. 숫자는 2개 이상이어야 합니다.\n"
 * + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 * String s = input.nextLine();
 * if (is_Valid_Password(s)) {
 * System.out.println("적절한 패스워드입니다: " + s);
 * } else {
 * System.out.println("패스워드 규칙에 어긋납니다: " + s);
 * }
 * }
 * public static boolean is_Valid_Password(String s){
 * if(s.length()<8){ //조건1
 * return false;
 * }
 * int count = 0;
 * char[] ch_Arr = s.toCharArray();
 * for (char c : ch_Arr) {
 * if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 * if (c >= '0' && c <= '9') {
 * count++;
 * }
 * } else {
 * return false;
 * }
 * }
 * if(count < 2){ //조건 3
 * return false;
 * }
 * return true;
 * }
 * }
 * <p>
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello this is Java World";
 * System.out.println("String is : " + str);
 * count(str);
 * }
 * <p>
 * public static void count(String str) {
 * String[] words = str.split("");
 * for (int i = 0; i < words.length; i++) {
 * System.out.println((i + 1) + " : " + words[i] + " : " + words[i].length());
 * }
 * }
 * }
 * <p>
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 * <p>
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "Hello Java World!";
 * System.out.println("String          = " + str);
 * System.out.println("Reversed String = " + reverse(str));
 * }
 * private static String reverse(String str){
 * String[] words = str.split(" ");
 * String[] reverseWords = new String[words.length];
 * StringBuilder stringBuilder = new StringBuilder();
 * for(int i = 0; i < words.length; i++){
 * reverseWords[i] = wordsReverse(words[i].toCharArray());
 * stringBuilder.append(reverseWords[i]+" ");
 * }
 * return stringBuilder.toString();
 * }
 * private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 * char[] reverse_ch = new char[ch.length];
 * int j = 0;
 * for(int i = ch.length-1; i>=0 ;i--){
 * reverse_ch[i]=ch[j++];
 * }
 * return new String(reverse_ch);
 * }
 * }
 * <p>
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 * public class Main {
 * public static void main(String[] args) {
 * String str = "12340000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = 0; i < ch.length; i++) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = idx ; i < ch.length; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * String str = "0012340001230000";
 * System.out.println("String    = " + str);
 * str = removeTrailZ(str);
 * System.out.println("Converted = " + str);
 * }
 * <p>
 * public static String removeTrailZ(String str) {
 * char[] ch = str.toCharArray();
 * int idx=0;
 * for (int i = ch.length-1 ; i >= 0; i--) {
 * if (ch[i] != '0') {
 * idx=i;
 * break;
 * }
 * }
 * StringBuffer stringBuffer = new StringBuffer();
 * for (int i = 0 ; i <= idx; i++){
 * stringBuffer.append(ch[i]);
 * }
 * return stringBuffer.toString();
 * }
 * }
 * <p>
 * 문제1.12
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * for (int i = 1; i < 10; i++) {
 * for (int j = 2; j < 10; j++) {
 * System.out.format("%d * %d = %2d ", j, i, j * i);
 * }
 * System.out.println();
 * }
 * }
 * }
 * <p>
 * 문제 1.13
 * 작성일:2023-03-07
 * 작성자:성민제
 * <p>
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * while (true) {
 * int size = 0;
 * System.out.print("Input Shape Size:");
 * size = sc.nextInt();
 * if (size == -1) {
 * break;
 * } else {
 * for (int i = 0; i < size; i++) {
 * if (i == 0 || i == size - 1) {
 * for (int j = 0; j < size; j++) {
 * System.out.print("*");
 * }
 * } else {
 * System.out.print("*");
 * for (int j = 1; j < size - 1; j++) {
 * System.out.print(" ");
 * }
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * }
 * }
 * }
 * }
 * <p>
 * 문제1.14
 * 작성일:2023-03-08
 * 작성자:성민제
 * <p>
 * import java.util.Scanner;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int num = 0;
 * System.out.print("Input Number?");
 * num = sc.nextInt();
 * <p>
 * for(int i = num; i > 0 ; i--){
 * for(int j = 0; j < i; j++){
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * }
 * }
 */

/**
 * 문제 1.3 대소문자 판별 및 변환기
 * 작성일:2023-03-06
 * 작성자:성민제
 * 메인메서드
 *   final int LOWER_CASE_ASCII_MIN = 97;
 *        final int LOWER_CASE_ASCII_MAX = 122;
 *        final int UPPER_CASE_ASCII_MIN = 65;
 *        final int UPPER_CASE_ASCII_MAX = 90;
 *        char alpha = '\0';
 *        int ascii = 0;
 *        Scanner sc = new Scanner(System.in);
 *        System.out.printf("Input charcter?");
 *        alpha = sc.next().charAt(0);
 *        ascii = alpha;
 *        if(ascii >= LOWER_CASE_ASCII_MIN && ascii <= LOWER_CASE_ASCII_MAX){
 *            System.out.println(alpha+"는 소문자");
 *            System.out.println(alpha+"의 대문자는 "+(char) (ascii-' '));
 *        }
 *        else if(ascii >= UPPER_CASE_ASCII_MIN && ascii <= UPPER_CASE_ASCII_MAX){
 *            System.out.println(alpha+"는 대문자");
 *            System.out.println(alpha+"의 소문자는 "+(char) (ascii+' '));
 *        }else{
 *            System.out.println(alpha+"는 문자가 아님.");
 *        }
 * */
/**
 * 문제 1.4
 * 작성일:2023-03-06
 * 작성자:성민제
 * public static void main(String[] args) {
 *         Scanner in = new Scanner(System.in);
 *         System.out.print("Input the string: ");
 *         String str = in.nextLine();
 *         System.out.print("Number of words: " + count_Words(str) + "\n");
 *     }
 *
 *     private static int count_Words(String str){
 *         return str.split(" ").length;
 *     }
 * */
/**
 * 문제 1.5
 * 작성일:2023-03-06
 * 작성자:성민제
 *
 public class Main {
 public static void main(String[] args) {
 System.out.println(sTimes("Hi", 3));
 System.out.println(sTimes("Hello", 2));
 System.out.println(sTimes("My Java", 2));
 }
 private static String sTimes(String str, int num){
 StringBuffer strb = new StringBuffer(str);
 for(int i = 0; i<num-1;i++){
 strb.append(str);
 }
 return strb.toString();
 }
 }
 * */
/**
 * 문제 1.6
 * 작성일:2023-03-06
 * 작성자:성민제
 *
 import java.util.Scanner;
 public class Main {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.print("Input a string: ");
 String str = in.nextLine();
 System.out.print("The middle character in the string: " + middle(str) + "\n");
 }

 private static String middle(String str){
 String temp;
 int mid = str.length()/2;
 if(str.length()%2==1){
 temp = Character.toString(str.charAt(mid));
 }else{
 temp = String.valueOf(str.charAt(mid-1))+str.charAt(mid);
 }
 return temp;
 }
 }
 * */
/**
 * 문제 1.7
 * 작성일:2023-03-06
 * 작성자:성민제
 *
 import java.util.Scanner;
 public class Main {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("1. 8글자 이상입니다.\n"
 + "2. 영문자와 숫자만 사용 가능합니다. \n"
 + "3. 숫자는 2개 이상이어야 합니다.\n"
 + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
 String s = input.nextLine();
 if (is_Valid_Password(s)) {
 System.out.println("적절한 패스워드입니다: " + s);
 } else {
 System.out.println("패스워드 규칙에 어긋납니다: " + s);
 }
 }
 public static boolean is_Valid_Password(String s){
 if(s.length()<8){ //조건1
 return false;
 }
 int count = 0;
 char[] ch_Arr = s.toCharArray();
 for (char c : ch_Arr) {
 if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) { //조건2
 if (c >= '0' && c <= '9') {
 count++;
 }
 } else {
 return false;
 }
 }
 if(count < 2){ //조건 3
 return false;
 }
 return true;
 }
 }
 * */
/**
 * 문제 1.8
 * 작성일:2023-03-06
 * 작성자:성민제
 *
 public class Main {
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
 * */
/**
 * 문제 1.9
 * 작성일:2023-03-06
 * 작성자:성민제
 *
 *
 public class Main {
 public static void main(String[] args) {
 String str = "Hello Java World!";
 System.out.println("String          = " + str);
 System.out.println("Reversed String = " + reverse(str));
 }
 private static String reverse(String str){
 String[] words = str.split(" ");
 String[] reverseWords = new String[words.length];
 StringBuilder stringBuilder = new StringBuilder();
 for(int i = 0; i < words.length; i++){
 reverseWords[i] = wordsReverse(words[i].toCharArray());
 stringBuilder.append(reverseWords[i]+" ");
 }
 return stringBuilder.toString();
 }
 private static String wordsReverse(char[] ch){//단어를 반전시켜주는 메서드
 char[] reverse_ch = new char[ch.length];
 int j = 0;
 for(int i = ch.length-1; i>=0 ;i--){
 reverse_ch[i]=ch[j++];
 }
 return new String(reverse_ch);
 }
 }
 * */
/**
 * 문제 1.10
 * 작성일:2023-03-06
 * 작성자:성민제
 public class Main {
 public static void main(String[] args) {
 String str = "12340000";
 System.out.println("String    = " + str);
 str = removeTrailZ(str);
 System.out.println("Converted = " + str);
 }

 public static String removeTrailZ(String str) {
 char[] ch = str.toCharArray();
 int idx=0;
 for (int i = 0; i < ch.length; i++) {
 if (ch[i] != '0') {
 idx=i;
 break;
 }
 }
 StringBuffer stringBuffer = new StringBuffer();
 for (int i = idx ; i < ch.length; i++){
 stringBuffer.append(ch[i]);
 }
 return stringBuffer.toString();
 }
 }
 * */
/**
 * 문제 1.11
 * 작성일:2023-03-07
 * 작성자:성민제
 *
 public class Main {
 public static void main(String[] args) {
 String str = "0012340001230000";
 System.out.println("String    = " + str);
 str = removeTrailZ(str);
 System.out.println("Converted = " + str);
 }

 public static String removeTrailZ(String str) {
 char[] ch = str.toCharArray();
 int idx=0;
 for (int i = ch.length-1 ; i >= 0; i--) {
 if (ch[i] != '0') {
 idx=i;
 break;
 }
 }
 StringBuffer stringBuffer = new StringBuffer();
 for (int i = 0 ; i <= idx; i++){
 stringBuffer.append(ch[i]);
 }
 return stringBuffer.toString();
 }
 }
 * */

/**
 * 문제1.12
 * 작성일:2023-03-07
 * 작성자:성민제
 *
 public class Main {
 public static void main(String[] args) {
 for (int i = 1; i < 10; i++) {
 for (int j = 2; j < 10; j++) {
 System.out.format("%d * %d = %2d ", j, i, j * i);
 }
 System.out.println();
 }
 }
 }
 * */
/**
 * 문제 1.13
 * 작성일:2023-03-07
 * 작성자:성민제
 *
 public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 while (true) {
 int size = 0;
 System.out.print("Input Shape Size:");
 size = sc.nextInt();
 if (size == -1) {
 break;
 } else {
 for (int i = 0; i < size; i++) {
 if (i == 0 || i == size - 1) {
 for (int j = 0; j < size; j++) {
 System.out.print("*");
 }
 } else {
 System.out.print("*");
 for (int j = 1; j < size - 1; j++) {
 System.out.print(" ");
 }
 System.out.print("*");
 }
 System.out.println();
 }
 }
 }
 }
 }
 * */
/**
 * 문제1.14
 * 작성일:2023-03-08
 * 작성자:성민제
 *
 import java.util.Scanner;
 public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num = 0;
 System.out.print("Input Number?");
 num = sc.nextInt();

 for(int i = num; i > 0 ; i--){
 for(int j = 0; j < i; j++){
 System.out.print("*");
 }
 System.out.println();
 }
 }
 }
 * */

import java.util.Scanner;

public class ch15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, mid = 0;
        while (true) {
            System.out.print("Input Number?");
            num = sc.nextInt();
            if (num % 2 != 0) {
                break;
            }
        }
        mid = num / 2;
        for (int i = 1; i <= mid; i++) { //상단 삼각형출력
            for (int j = 0; j <= mid - i; j++) { //공백 출력
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = mid+1; i > 0; i--) { //중간 줄 포함 하단 삼각형 출력
            for (int j = mid+1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}