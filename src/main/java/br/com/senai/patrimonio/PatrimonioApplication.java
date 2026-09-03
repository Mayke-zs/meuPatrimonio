package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Curso;
import br.com.senai.patrimonio.avaliacao.Evento;
import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.avaliacao.enums.StatusEvento;
import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.model.Funcionario;
import br.com.senai.patrimonio.model.Sala;
import br.com.senai.patrimonio.model.enums.Cargo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Rod Josephina Lodette Vassoler");
		System.out.println();
		System.out.println(endereco.getRua());
		System.out.println(endereco.getBairro());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumento = new Endereco("Rod Josephina Lodette Vassoler", "1999", "Ctg", "Santa Cruz", "Forquilhinha", "Santa Catarina");
		System.out.println(enderecoComArgumento.getBairro());

		Sala sala = new Sala();

		Funcionario funcionario = new Funcionario(
				35L, "Maykinho", "123456789",
				Cargo.GERENTE, empresa, sala
		);

		System.out.println(funcionario.getCpf());

		Participante participante = new Participante(
				"Mayke2",
				"maykebolinha@gmail.com",
				"999999999",
				"1",
				Nivel.INTERMEDIARIO
		);
		System.out.println(participante.getNome());

		Evento evento = new Evento(
				1,
				"Meu evento",
				"Senai",
				StatusEvento.EVENTOEMANDAMENTO,
				participante
		);
		System.out.println(evento.getNome());

		Curso curso = new Curso(

		);
	}
}
