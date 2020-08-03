package com.mastertech.pagamento.client;

import com.mastertech.pagamento.exceptions.CartaoNaoEncontradoException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CartaoClientDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response){
        if(response.status() == 400){
            throw new CartaoNaoEncontradoException();
        }else {
            return errorDecoder.decode(s, response);
        }
    }


}
