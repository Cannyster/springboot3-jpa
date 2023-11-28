package com.cannysters.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cannysters.course.entities.Category;
import com.cannysters.course.entities.Order;
import com.cannysters.course.entities.User;
import com.cannysters.course.entities.enums.OrderStatus;
import com.cannysters.course.repositories.CategoryRepository;
import com.cannysters.course.repositories.OrderRepository;
import com.cannysters.course.repositories.UserRepository;

@Configuration // Anotação indicando que essa classe e uma classe de configuração
@Profile("test") //Anotação indicando que essa configuração vai ser aplicada apenas quando estiver no perfil de teste
public class TestConfig implements CommandLineRunner{

	@Autowired // Anotação que o proprio spring vai resolver a dependencia e associar uma instancia de user repository automaticamente
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public void run(String... args) throws Exception {//tudo que for colocado dentro desse metodo vai ser executado quando o projeto for inicado 
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.CANCELED, u1);
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));//Vai salvar todos os itens constantes na lista no banco de dados
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
}
