package aula20190726b.prova.value_objects;

public class NomeInv�lidoException extends RuntimeException {
	
	public NomeInv�lidoException() {
		super("O nome n�o pode ser nulo e deve ter mais que 3 caracteres!");
	}

}
