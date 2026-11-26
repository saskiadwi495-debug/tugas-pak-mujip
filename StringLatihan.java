public class StringLatihan {
    public static void main(String[] args) {

    
        String myString = "abc";

        String myString2 = new String("abc");

        String myString3;
        myString3 = "abc";

        System.out.println("Nomor 1:");
        System.out.println(myString);
        System.out.println(myString2);
        System.out.println(myString3);

        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("\nNomor 2:");
        System.out.println("a. " + s1.compareTo(s2));
        System.out.println("b. " + s2.equals(s3));
        System.out.println("c. " + (s3 == s1));
        System.out.println("d. " + s2.compareTo(s3));
        System.out.println("e. " + s3.equals(s1));

        String kata1 = "Hello";
        String kata2 = "Java";
        String kata3 = kata1 + " " + kata2;

        System.out.println("\nNomor 3:");
        System.out.println(kata3);
    }
}
