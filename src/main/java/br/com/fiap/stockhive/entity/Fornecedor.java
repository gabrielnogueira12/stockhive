package br.com.fiap.stockhive.entity;

import br.com.fiap.stockhive.entity.enums.Segmento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "fornecedor")
public class Fornecedor {
	private Integer fornecedorId;

	private String nome;

	private String telefone;

	private String email;

	private Segmento segmento;

	private List<ItemConsumo> itensConsumo;

}
