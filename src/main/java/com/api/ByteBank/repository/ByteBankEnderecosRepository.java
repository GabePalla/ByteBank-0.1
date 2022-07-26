package com.api.ByteBank.repository;

import com.api.ByteBank.model.EnderecoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ByteBankEnderecosRepository extends JpaRepository<EnderecoCliente,String> {
}
