package com.crud.card.cardspostgre.Controller;

import com.crud.card.cardspostgre.model.Card;
import com.crud.card.cardspostgre.model.ServiceResponse;
import com.crud.card.cardspostgre.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/card")
@CrossOrigin("*")
public class CardController {
    @Autowired
    private ICardService iCardService;

    public ResponseEntity<List<Card>> list(){
        var result = iCardService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    public ServiceResponse Save(){
        var result = iCardService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
