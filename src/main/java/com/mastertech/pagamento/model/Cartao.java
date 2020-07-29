package com.mastertech.pagamento.model;

import javax.persistence.*;
import java.io.Serializable;

public class Cartao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCartao;
    private String numero;
    private int clienteId;
    private boolean ativo;

    public Cartao() {

    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
