package ru.gb.lesson_4.bridge;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SystemInfo {
    private final SystemType systemType;
    private int cpu;
    private int memory;
}
