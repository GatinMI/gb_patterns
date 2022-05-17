package ru.gb.lesson_5.observer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class Channel implements Observable{
    private final String name;

    private final List<String> news = new ArrayList<>();
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void addNews(String news) {
        this.news.add(news);
        subscribers.forEach(subscriber -> subscriber.inform(this, news));
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}
