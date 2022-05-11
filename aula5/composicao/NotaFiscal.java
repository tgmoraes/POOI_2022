package aula5.composicao;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class NotaFiscal {
	private LocalDateTime dataHoraVenda;
	//associacao entre as classes (composição) NotaFiscal e ItemNF => um para muitos (1..*)
	private ArrayList<ItemNF> itens;

	//construtor
	public NotaFiscal() {
		this.itens = new ArrayList<ItemNF>();
		this.setDataHoraVenda(LocalDateTime.now());
	}
	public NotaFiscal(LocalDateTime dtVenda) {
		this.itens = new ArrayList<ItemNF>();
		this.setDataHoraVenda(dtVenda);
	}
	
	//getters e setters
	public LocalDateTime getDataHoraVenda() {
		return dataHoraVenda;
	}
	
	public void setDataHoraVenda(LocalDateTime dataHoraVenda) {
		this.dataHoraVenda = dataHoraVenda;
	}
	
	//métodos que manipulam a lista de itens
	//adiciona item
	public void addItem(String desc, int qtde, double preco) {
		ItemNF item = new ItemNF(desc, qtde, preco);
		this.itens.add(item);
	}
	//total de itens na nota
	public int getTotalItens() {
		return this.itens.size();
	}
	//valor total da nota
	public double getValorTotal() {
		double ret =0;
		for(ItemNF item:this.itens) {
			ret+=item.getValorTotal();
		}
		return ret;
	}
}
