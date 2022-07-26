package com.api.ByteBank.controller;

import com.api.ByteBank.model.Conta;
import com.api.ByteBank.repository.ByteBankContaRepository;
import com.api.ByteBank.service.ByteBankService;
import org.aspectj.weaver.loadtime.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class ByteBankController {

    @Autowired
    private ByteBankService service;

    @PostMapping(path = "/save/conta")
    public void criateDadosConta(@RequestBody Conta corpoConta) {
        service.criateDadosConta(corpoConta);
    }

    @GetMapping(path = "/lista/conta")
    public List<Conta> listaDadosConta() {
        return service.listaDadosConta();
    }


    @DeleteMapping(path = "/lista/delete/{numeroDaConta}")
    public void deletaRegistroConta(@PathVariable String numeroDaConta) {
        service.deletaDadosConta(numeroDaConta);
    }




}
