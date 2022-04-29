package ru.gb.lesson_4.decorator;

import org.springframework.context.annotation.Bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class DecoratorClient {





    public static void main(String[] args) throws IOException {

        Notifier notifier = getNotifier();
        notifier.send("Hi!");


        OutputStream output = getOutputStream("output");
        output.write(5);
    }

    @Bean
    private static Notifier getNotifier() {
        return new SlackNotifier(new TelegramNotifier(new BaseNotifier()));
    }

    private static OutputStream getOutputStream(String fileName) throws IOException {
        return new GZIPOutputStream(new FileOutputStream(fileName + ".gzip"));
    }
}
