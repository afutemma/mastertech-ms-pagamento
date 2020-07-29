package com.mastertech.pagamento.controller;

import com.mastertech.pagamento.dto.PagamentoDTO;
import com.mastertech.pagamento.model.Pagamento;
import com.mastertech.pagamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PagamentoController {


    @Autowired
    PagamentoService service;

    @PostMapping("/pagamento")
    public ResponseEntity postCartao(@RequestBody PagamentoDTO pagamento) {
        return ResponseEntity.ok(service.save(pagamento));
    }


    @GetMapping("/pagamentos/{numerocartao}")
    public List<Pagamento> consultarPagamentos(@PathVariable int numerocartao){
        List<Pagamento> pgts = service.listar(numerocartao);
        return pgts;
    }

}
