package com.api.ByteBank.repository;

import com.api.ByteBank.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ByteBankClienteRepository extends JpaRepository<Cliente,String> {

}
