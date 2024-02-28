package com.crud.card.cardspostgre.Controller;

import com.crud.card.cardspostgre.model.Card;
import com.crud.card.cardspostgre.model.ServiceResponse;
import com.crud.card.cardspostgre.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/card")
@CrossOrigin("*")

public class CardController {
    @Autowired
    private ICardService iCardService;


    @PostMapping("/list")
    public ResponseEntity<List<Card>> list(){
        var result = iCardService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponse>save(@RequestBody Card card){
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iCardService.save(card);
        if (result ==1) {
            serviceResponse.setMessage("Item saved with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }



}
