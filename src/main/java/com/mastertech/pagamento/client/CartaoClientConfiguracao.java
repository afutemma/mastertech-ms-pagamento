package com.mastertech.pagamento.client;

import feign.Feign;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class CartaoClientConfiguracao {

        @Bean
        public ErrorDecoder getErrorDecoder(){
            return new CartaoClientDecoder();
        }


    @Bean
    public Feign.Builder builder() {
        FeignDecorators feignDecorators = FeignDecorators.builder()
                .withFallback(new CartaoClientFallback(), RetryableException.class)
                .build();

        return Resilience4jFeign.builder(feignDecorators);
    }

}
