public class TestStringClass {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String();
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1.length());
        char[] helloArray = str1.toCharArray();
        String str5 = str1 + str3;
        System.out.println(str5);
        System.out.println("Год " + 2015);
        str5 = str5.concat(String.valueOf(117));
        System.out.println(str5);
        str5 = String.join("=", str3, str4);
        System.out.println(str5);
        char c = str5.charAt(5);
        System.out.println(c);
        str5.getChars(3,4, helloArray, 3);
        for (char symb : helloArray){
            System.out.println(symb);
        }
        System.out.println(str3.equals(str4));
        System.out.println(str3.regionMatches(0, str4, 0, 2));
    }
}
