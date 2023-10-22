package one_digitalinnovation_gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one_digitalinnovation_gof.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}