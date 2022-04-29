package ru.gb.lesson_4.proxy;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class CurrencyRepositoryImpl implements CurrencyRepository {

    private JdbcTemplate template;

    @Override
    public Money getRate(Currency currency) {
        return null;
    }
}
