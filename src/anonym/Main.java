package anonym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int input = scanner.nextInt();
        System.out.println(input);
        System.out.println(new java.util.Scanner(System.in).nextInt());

        SpeakingEntity person = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye");

            }
        };
        SpeakingEntity newPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayBye() {
                System.out.println("See ya later");

            }
        };
        person.sayHello();
        person.sayBye();
    }
}