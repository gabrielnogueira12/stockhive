package br.com.fiap.stockhive.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "itemConsumo")
public class ItemConsumo {

	private Integer itemConsumoId;
	
	private String nome;
	
	private Integer quantidade;
	
	private Double precoMedio;
	
	private String marca;

	private Fornecedor fornecedor;

	private ItemConsumoGenerico itemGenerico;

}
