package projeto.spring.framework.lab_spring_projeto.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import projeto.spring.framework.lab_spring_projeto.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping("/{cep}/json/")
    Endereco consultaCep(@PathVariable("cep") String cep);
}
