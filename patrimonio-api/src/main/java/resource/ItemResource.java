package resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Item;
import repository.ItemRepository;
//Classe para receber/manipular/atender requisições http


//spring mvc vai invocar o metodo referente ao que chegou 
//classe controlador atraves do restcontroller;
@RestController
@CrossOrigin("${origem-permitida}")
public class ItemResource {
	
	//injecao de instancia de classe; 
	
	@Autowired
	private ItemRepository itemRepository;
	//metodo que vai atender listagem dos itens do banco de dados
	
	//http get
	@GetMapping("/itens") //tipo de requisição Get
	public List<Item> listar() {
		return itemRepository.findAll(); //findAll devolve todos os dados da base
	}
	
	//Http post
	@PostMapping("/itens")
	public Item adicionar(@RequestBody @Validated Item item) {
		return itemRepository.save(item);
	}
	
}
