package com.api.ByteBank.service;

import com.api.ByteBank.model.Conta;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface ByteBankInterfaceService {

    public void criateDadosConta(Conta corpoConta);

    public List<Conta> listaDadosConta();

    public void deletaDadosConta(String nuemroDaConta);

    public void updateDadosConta(String numeroDaConta, Conta corpoDaConta);

    public Optional<Conta> getByNumeroDaConta(String numeroDaConta);
}
