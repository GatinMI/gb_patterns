package ru.gb.lesson_3.builder;

public class EmailMessage implements Message {

    private final String subject;
    private final String body;
    private final String sender;
    private final String to;

    public EmailMessage(String subject, String body, String sender, String to) {
        this.subject = subject;
        this.body = body;
        this.sender = sender;
        this.to = to;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getTo() {
        return to;
    }
}
