package com.send.help.sendhelp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="ongs")
public class OngResource {
    @GetMapping(path = "buscar")
    public String buscarOngs(@RequestParam String nome){
        return nome;
    }


}
