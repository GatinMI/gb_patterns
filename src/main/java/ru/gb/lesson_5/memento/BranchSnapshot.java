package ru.gb.lesson_5.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class BranchSnapshot {
    private final String code;
    private final LocalDateTime updated;


}
