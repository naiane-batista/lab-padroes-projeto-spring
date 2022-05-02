package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Endereco;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 *
 *///Cliente http criado via OpenFeign,para o consumo da API do ViaCep
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {


    //busca o json que será convertido no objeto q ja mapeamos c base nele (classe endereco)
// , e me traz o endereco c base no cep q eu passar no path do get /{cep}

    //@RequestMapping(method = RequestMethod.GET,value = "/{cep}/json/") ou
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
