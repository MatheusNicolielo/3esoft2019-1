package aula20190726b.prova.produto;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import aula20190726b.prova.cor.Cor;
import aula20190726b.prova.value_objects.Nome;

public class Produto {
	private Nome nome;
	private Set<Cor> coresDispon�veis = new HashSet<>();
	private Cor corPadr�o;
	
	public Produto(Nome nome, Cor[] cores, Cor corPadr�o) {
		this.nome = nome;
		for (Cor cor : cores) {
			this.coresDispon�veis.add(cor);
		}
		definirCorPadr�o(corPadr�o);
	}
	
	public Nome getNome() {
		return nome;
	}
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	public void definirCorPadr�o(Cor corPadr�o) {
		if (corPadr�o == null || !this.coresDispon�veis.contains(corPadr�o)) {
			throw new CorPadr�oInv�lidaException();
		}
		this.corPadr�o = corPadr�o;
	}

}
