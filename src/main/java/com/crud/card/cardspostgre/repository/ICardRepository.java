package com.crud.card.cardspostgre.repository;

import com.crud.card.cardspostgre.model.Card;
import java.util.List;

public interface ICardRepository {
    public List<Card> findAll();
    public int save (Card card);
    public int updateById (int id);
    public int delete (Card card);

}
