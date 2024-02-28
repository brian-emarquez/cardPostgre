package com.crud.card.cardspostgre.service;

import com.crud.card.cardspostgre.model.Card;

import java.util.List;

public interface ICardService {
    public List<Card> findAll();
    public int save (Card card);
    public int update (Card card);
    public int deleteById (int id);
}


