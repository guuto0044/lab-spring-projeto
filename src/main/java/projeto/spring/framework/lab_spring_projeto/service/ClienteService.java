package projeto.spring.framework.lab_spring_projeto.service;

import projeto.spring.framework.lab_spring_projeto.model.Cliente;

public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();
    
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    
    void atualizar(Long id, Cliente cliente);
    
    void deletar(Long id);
}