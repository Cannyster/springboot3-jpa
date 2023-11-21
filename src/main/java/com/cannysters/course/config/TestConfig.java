package com.cannysters.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cannysters.course.entities.User;
import com.cannysters.course.repositories.userRepository;

@Configuration // Anotação indicando que essa classe e uma classe de configuração
@Profile("test") //Anotação indicando que essa configuração vai ser aplicada apenas quando estiver no perfil de teste
public class TestConfig implements CommandLineRunner{

	@Autowired // Anotação que o proprio spring vai resolver a dependencia e associar uma instancia de user repository automaticamente
	private userRepository userRepository;

	@Override
	public void run(String... args) throws Exception {//tudo que for colocado dentro desse metodo vai ser executado quando o projeto for inicado 
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));//Vai salvar todos os itens constantes na lista no banco de dados
	}
	
	
	
}
