package com.crud.card.cardspostgre.repository;

import com.crud.card.cardspostgre.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ClassRepository implements ICardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Card> findAll() {
        String SQL = "SELECT * FROM cards WHERE = 1";
        return JdbcTemplate.query(SQL,BeanPropertyRowMapper.newInstance(Card.class));
    }

    @Override //dgdfg
    public int save(Card card) {
        String SQL = "INSERT INTO cards VALUES(?,?,?,?,?)";
        return JdbcTemplate.update(SQL, new Object[]{card.getName(), card.getNumber(), card.getType(), card.getCvv(), card.getStatus()});
    }

    @Override
    public int updateById(int id) {
        return 0;
    }

    @Override
    public int deleteById(Card card) {
        return 0;
    }
}
