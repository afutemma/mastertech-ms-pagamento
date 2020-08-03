package com.mastertech.pagamento.repository;

import com.mastertech.pagamento.model.Pagamento;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

    List<Pagamento> findAllByIdCartao(int idCartao);

    @Modifying
    @Transactional
    @Query(value = "delete from T_PAGAMENTO where id_cartao = :idCartao", nativeQuery = true)
    int deleteCartaoId(@Param("idCartao") int idCartao);
}
