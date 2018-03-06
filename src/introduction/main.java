package introduction;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // this is not my first java program
        System.out.println("Hallo world");
        String str = "hallo";
        String str2 = "this is the test string";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.concat("ABC"));
        System.out.print(str.contains("is"));
        System.out.println(false);
        System.out.println(false);
        System.out.println(false);

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("index" + i + "is" + charArray[i]);
        }
    }
}
