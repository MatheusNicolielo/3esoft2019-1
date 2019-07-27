package aula20190726b.prova;

import org.junit.Test;

import aula20190726b.prova.cor.Cor;
import aula20190726b.prova.produto.CorPadr�oInv�lidaException;
import aula20190726b.prova.produto.Produto;
import aula20190726b.prova.value_objects.Nome;
import aula20190726b.prova.value_objects.NomeInv�lidoException;

public class TestesComProdutosNomesCores {

	@Test(expected=NomeInv�lidoException.class)
	public void testarNomeVazio() {
		new Nome("");
	}
	@Test(expected=NomeInv�lidoException.class)
	public void testarNomeCurto() {
		new Nome("Z�");
	}
	@Test
	public void testarNomesCorretos() {
		new Nome("Jos�");
		new Nome("Maria Almeida de Albuquerque");
	}

	@Test
	public void testarProdutoCorreto() {
		Cor azul = new Cor(new Nome("Azul"));
		Cor rosa = new Cor(new Nome("Rosa"));
		Cor lil�s = new Cor(new Nome("Lil�s"));
		
		Produto pincelBic = new Produto(
				new Nome("Pincel Bic Marcador Plus"), 
				new Cor[] {azul, rosa, lil�s}, 
				lil�s);
	}
	
	@Test(expected=CorPadr�oInv�lidaException.class)
	public void testarProdutoComCorPadr�oInv�lida() {
		Cor azul = new Cor(new Nome("Azul"));
		Cor rosa = new Cor(new Nome("Rosa"));
		Cor lil�s = new Cor(new Nome("Lil�s"));
		
		Produto pincelBic = new Produto(
				new Nome("Pincel Bic Marcador Plus"), 
				new Cor[] {azul, rosa}, 
				lil�s);
	}
	

}
