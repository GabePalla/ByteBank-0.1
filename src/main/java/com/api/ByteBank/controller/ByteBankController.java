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

    @GetMapping(path = "/lista/conta/listall")
    public List<Conta> listaDadosConta() {
        return service.listaDadosConta();
    }


    @DeleteMapping(path = "/lista/delete/{numeroDaConta}")
    public void deletaRegistroConta(@PathVariable String numeroDaConta) {
        service.deletaDadosConta(numeroDaConta);
    }

    @GetMapping(path = "/lista/conta/getbynumerodaconta/{numeroDaConta}")
    public Optional<Conta> getByNumeroDaConta(@PathVariable String numeroDaConta) {
       return service.getByNumeroDaConta(numeroDaConta);
    }

    @PutMapping(path = "/lista/update/{numeroDaConta}")
    public void updateDadosConta(@PathVariable String numeroDaConta, @RequestBody Conta corpoDaConta) {
        service.updateDadosConta(numeroDaConta, corpoDaConta);
    }




}
