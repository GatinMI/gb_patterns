package ru.gb.lesson_4.facade;

import ru.gb.lesson_4.facade.video_converter.VideoConverter;
import ru.gb.lesson_4.facade.video_converter.VideoFormat;

public class FacadeClient {
    public static void main(String[] args) {
        VideoConverter videoConverter = new VideoConverter();
        String convert = videoConverter
                .convert("batman_2022.mp4", VideoFormat.AVI);

    }
}
