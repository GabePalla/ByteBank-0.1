package com.api.ByteBank.service;

import com.api.ByteBank.model.Conta;
import com.api.ByteBank.repository.ByteBankContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ByteBankService {

    @Autowired
    private ByteBankContaRepository contaRepository;

    public void criateDadosConta(Conta corpoConta){
        contaRepository.save(corpoConta);
    }

    public List<Conta> listaDadosConta() {
        return contaRepository.findAll();
    }

    @Transactional
    public void deletaDadosConta(String nuemroDaConta) {
        Optional<Conta> lista = contaRepository.findByNumeroDaConta(nuemroDaConta);
        contaRepository.deleteByidCliente(lista.get().getIdCliente());
    }

}