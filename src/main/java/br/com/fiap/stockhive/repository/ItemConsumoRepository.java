package br.com.fiap.stockhive.repository;

import br.com.fiap.stockhive.entity.ItemConsumo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemConsumoRepository extends MongoRepository<ItemConsumo, Integer> {
    List<ItemConsumo> findByItemConsumoId (Integer id);
}

