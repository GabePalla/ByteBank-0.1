package com.api.ByteBank.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "TB_ENDERECOS_CLIENTES")
public class  EnderecoCliente {
    @Id
    private UUID idendereco;

    private String cidade;

    private String cep;

    private String rua;

    private String bairro;

    private String numeroDaCasa;
    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

    public UUID getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(UUID idendereco) {
        this.idendereco = idendereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(String numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
}
