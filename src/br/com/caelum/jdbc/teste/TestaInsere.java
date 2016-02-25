package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro, 3185 cj57");
		Calendar data = Calendar.getInstance();
		data.set(2016, Calendar.FEBRUARY, 25);
		contato.setDataNascimento(data);

		ContatoDao dao = new ContatoDao();

		dao.adiciona(contato);

		System.out.println("Gravado!");
	}
}
