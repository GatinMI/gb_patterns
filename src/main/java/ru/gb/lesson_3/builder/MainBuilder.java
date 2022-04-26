package ru.gb.lesson_3.builder;

public class MainBuilder {

    public static void main(String[] args) {
        Message message = new SmsBuilder()
                .body("Hi, Sam! Nice to connect with you :)")
                .to("Sam")
                .sender("Tom")
                .subject("Greetings")
                .build();

        User user = User.builder()
                .username("anonymous")
                .id(1)
                .email("sam_mcdonalds@mail.ru")
                .password("123")
                .build();

        User user2 = user.toBuilder()
                .id(2)
                .build();

        System.out.println(user.equals(user2));

    }
}
