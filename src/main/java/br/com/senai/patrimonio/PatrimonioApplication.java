package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
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
	}

}
