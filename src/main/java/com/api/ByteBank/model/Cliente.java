package com.api.ByteBank.model;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idcliente;
    private String nome;
    private String sobrenome;
    private String cpf;
    @OneToOne
    @JoinColumn(name = "fk_endereco_idcliente")
    private EnderecoCliente endereco;

    @OneToMany(mappedBy = "cliente")
    private List<Conta> conta;


    public UUID getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(UUID idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoCliente getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCliente endereco) {
        this.endereco = endereco;
    }
}
