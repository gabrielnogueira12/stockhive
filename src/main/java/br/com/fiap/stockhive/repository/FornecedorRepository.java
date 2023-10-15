package br.com.fiap.stockhive.repository;

import br.com.fiap.stockhive.entity.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedorRepository extends MongoRepository<Fornecedor, Integer> {
    List<Fornecedor> findByFornecedorId (Integer id);
}
