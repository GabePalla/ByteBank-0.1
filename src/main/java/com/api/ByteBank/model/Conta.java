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
    private UUID idconta;

    private String agencia;

    private String numeroDaConta;

    private String tipoDaConta;

    private double saldo;

    private String senha;
    @ManyToOne
    @JoinColumn(name = "fk_idconta")
    private Cliente cliente;

    public UUID getIdconta() {
        return idconta;
    }
    public void setIdconta(UUID idconta) {
        this.idconta = idconta;
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
