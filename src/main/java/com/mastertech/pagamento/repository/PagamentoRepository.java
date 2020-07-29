package com.mastertech.pagamento.repository;

import com.mastertech.pagamento.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

    List<Pagamento> findAllByIdCartao(int idCartao);
}
