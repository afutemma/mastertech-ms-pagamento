package com.mastertech.pagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
public class PagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentoApplication.class, args);
	}

}
