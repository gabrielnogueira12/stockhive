package br.com.fiap.stockhive.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "itemGenerico")
public class ItemConsumoGenerico {
	
	private Integer itemConsumoGenericoId;
	
	private String nome;
	
	private Double precoMedio;
	
	private Integer quantidadeTotal;

	private List<ItemConsumo> itensConsumo;

}
