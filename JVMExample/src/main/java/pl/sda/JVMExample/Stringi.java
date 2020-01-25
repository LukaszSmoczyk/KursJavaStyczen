package pl.sda.JVMExample;

public class Stringi {

    public static void main(String[] args) {


        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");

        if (s1 == s2) {
            System.out.println("s1 = s2");
        }

        if (s1 == s3) {
            System.out.println("s1 == s3");
        }
    }
}
