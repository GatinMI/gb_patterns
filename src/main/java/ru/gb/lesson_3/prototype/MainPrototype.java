package ru.gb.lesson_3.prototype;

public class MainPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = User.builder()
                .username("anonymous")
                .id(1)
                .email("sam_mcdonalds@mail.ru")
                .password("123")
                .build();

        User clone = user.clone();
        User copy = user.copy();

        System.out.println(clone.equals(copy));
    }
}
