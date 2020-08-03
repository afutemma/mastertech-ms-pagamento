package com.mastertech.pagamento.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_GATEWAY, reason = "O sistema de cartão se encontra offline")
public class CartaoOfflineException extends RuntimeException {
}
