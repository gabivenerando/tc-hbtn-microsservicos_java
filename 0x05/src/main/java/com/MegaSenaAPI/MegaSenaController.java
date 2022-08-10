package com.example.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value="megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas(){
        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
    }

    @GetMapping("/getNumbers")
    public List<Integer> numeroMegaSena(){
        Random gerador = new Random();
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            number.add(gerador.nextInt(100));
        }
        Collections.sort(number);
        return number;
    }
}
