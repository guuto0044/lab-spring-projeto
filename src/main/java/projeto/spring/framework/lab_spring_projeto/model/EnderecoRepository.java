package projeto.spring.framework.lab_spring_projeto.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository <Endereco, String> {
    
}
