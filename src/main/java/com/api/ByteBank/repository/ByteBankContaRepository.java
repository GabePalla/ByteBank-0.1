package com.api.ByteBank.repository;

import com.api.ByteBank.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ByteBankContaRepository extends JpaRepository <Conta,String> {
    Optional<Conta> findByNumeroDaConta(String numeroDaConta);
    Optional<Conta> deleteByidCliente(UUID IdCliente);
    Optional<Conta> deleteByNumeroDaConta(String numeroDaConta);
}
