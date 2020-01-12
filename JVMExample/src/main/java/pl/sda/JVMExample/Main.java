package pl.sda.JVMExample;


import org.openjdk.jol.info.ClassLayout;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(k);
            k++;
        }

        // User user = new User();

        // System.out.println(ClassLayout.parseClass(User.class).toPrintable(new User()));

    }
}
