package com.mastertech.pagamento.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class CartaoClientConfiguracao {

        @Bean
        public ErrorDecoder getErrorDecoder(){
            return new CartaoClientDecoder();
        }
}
