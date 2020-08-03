package com.mastertech.pagamento.service;

import com.mastertech.pagamento.client.CartaoClient;
import com.mastertech.pagamento.dto.PagamentoDTO;
import com.mastertech.pagamento.exceptions.CartaoNaoEncontradoException;
import com.mastertech.pagamento.model.Cartao;
import com.mastertech.pagamento.model.Pagamento;
import com.mastertech.pagamento.repository.PagamentoRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    PagamentoRepository repository;
    @Autowired
    CartaoClient cartaoClient;


    public PagamentoDTO save(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(pagamentoDTO.getValor());

        Cartao cartao;

        cartao = cartaoClient.getCartaoPorId(pagamentoDTO.getCartaoId());

        pagamento.setIdCartao(pagamentoDTO.getCartaoId());
        pagamento.setDescricao(pagamentoDTO.getDescricao());

        repository.save(pagamento);

        pagamentoDTO.setId(pagamento.getId());

        return pagamentoDTO;
    }

    public List<Pagamento> listar(int idCartao) {

        return repository.findAllByIdCartao(idCartao);
    }

    public List<Pagamento> listarTudo(){
        return repository.findAll();
    }
}
