package ru.gb.lesson_5.state;

public class StateMain {
    public static void main(String[] args) {
        User user = new User();
        //user.setStatus(UserStatus.NORMAL);
        user.write("Admin is not good person!");
        //user.setStatus(UserStatus.READ_MODE);
        user.write("Admin is not good person HAhahah!");
    }
}
