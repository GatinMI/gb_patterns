package ru.gb.lesson_6.relation_object;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class Job extends DomainObject<Long> {
    private final Long id;
    private final String title;
}
