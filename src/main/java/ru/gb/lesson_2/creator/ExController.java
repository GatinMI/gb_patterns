package ru.gb.lesson_2.creator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import ru.gb.lesson_2.dry.UserRepository;

@Controller
public class ExController {
    Object objectMapper;
    Object repository;

    public ExController() {
        objectMapper = new ObjectMapper();
    }

    public void method() {
        if (repository instanceof UserRepository) {

        }
    }
}
