package com.mastertech.pagamento.dto;

public class PagamentoDTO {


    private int id;
    private int cartaoId;
    private String descricao;
    private double valor;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCartaoId() {
        return cartaoId;
    }

    public void setCartaoId(int cartaoId) {
        this.cartaoId = cartaoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
