package anonym;

public class AnonymousClassExample {
    private static String BYE_STRING = "Aufwiedersein!";
    public static void main(String[] args) {
        final String hello = "Guten tag";

        SpeakingEntity germanSpeaker = new SpeakingEntity() {
            @Override
            public void sayHello() {
               System.out.println(hello);
            }

            @Override
            public void sayBye() {
                System.out.println(BYE_STRING);

            }
        };
        germanSpeaker.sayHello();
        germanSpeaker.sayBye();
    }
}
