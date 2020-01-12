package pl.sda.JVMExample;


import java.util.ArrayList;
import java.util.List;

public class MainArray {

    public static void main(String[] args) throws InterruptedException {

        List<User> users = new ArrayList<>();

        while (true) {
            User user = new User(22, "Lukasz");
            users.add(user);
            Thread.sleep(200);
        }
    }
}
