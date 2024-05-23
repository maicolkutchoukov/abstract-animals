package org.bonus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Device type: ");
        String type = scanner.nextLine();
        Creator creator = new Creator();
        try {
            Device device = creator.create(type);
            device.play();
            System.out.println("**************");
            device.stop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
