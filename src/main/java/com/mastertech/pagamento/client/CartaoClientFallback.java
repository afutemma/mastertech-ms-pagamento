package com.mastertech.pagamento.client;


import com.mastertech.pagamento.exceptions.CartaoOfflineException;
import com.mastertech.pagamento.model.Cartao;

public class CartaoClientFallback implements CartaoClient {
    @Override
    public Cartao getCartaoPorId(int id) {
        throw new CartaoOfflineException();
    }
}
