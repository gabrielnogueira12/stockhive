package br.com.fiap.stockhive.repository;

import br.com.fiap.stockhive.entity.ItemConsumoGenerico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemConsumoGenericoRepository extends MongoRepository<ItemConsumoGenerico, Integer> {
    List<ItemConsumoGenerico> findByItemConsumoGenericoId(String cpf);
}
