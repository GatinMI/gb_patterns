package ru.gb.lesson_3.prototype;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
public class User implements Cloneable, Prototype<User> {
    private final Integer id;
    private final String username;
    private final String email;
    private final String password;

    @Override
    public User clone() throws CloneNotSupportedException {

        return (User)super.clone();
    }

    @Override
    public User copy() {
        return new User(this.id, this.username, this.email, this.password);
    }
}
