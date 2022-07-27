package com.api.ByteBank.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class ByteBankDto {

    @NotBlank
    @Size(max = 4, min = 4)
    private String agencia;
    @NotBlank
    @Size(max = 7, min = 7)
    private String numeroDaConta;
    @NotBlank
    @Size(max = 30)
    private String tipoDaConta;

    private double saldo;
    @NotBlank
    @Size(max = 12, min = 6)
    private String senha;

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
}
