package com.mastertech.pagamento.client;

import com.mastertech.pagamento.model.Cartao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cartao")
public interface CartaoClient {

    @GetMapping("/cartao/byId/{id}")
    Cartao getCartaoPorId(@PathVariable int id);

}
