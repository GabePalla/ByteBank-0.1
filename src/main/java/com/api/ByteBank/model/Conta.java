package com.api.ByteBank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "TB_CONTAS")
public  class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCliente;

    @Column
    private String agencia;

    @Column
    private String numeroDaConta;

    @Column
    private String tipoDaConta;

    @Column
    private double saldo;

    @Column
    private String senha;


    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void teste() {

    }


}
