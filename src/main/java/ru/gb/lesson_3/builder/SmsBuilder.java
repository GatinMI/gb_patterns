package ru.gb.lesson_3.builder;

public class SmsBuilder implements Builder {

    private String sender;
    private String to;
    private String subject;
    private String body;

    @Override
    public Builder body(String body) {
        this.body = body;
        return this;
    }

    @Override
    public Builder sender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public Builder to(String to) {
        this.to = to;
        return this;
    }

    @Override
    public Builder subject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public Message build() {
        return new SmsMessage(subject, body, sender, to);
    }
}
