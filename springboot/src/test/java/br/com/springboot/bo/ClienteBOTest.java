package br.com.springboot.bo;

import java.time.LocalDate;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.springboot.model.Cliente;
import br.com.springboot.model.Sexo;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)

final public class ClienteBOTest {

	@Autowired
	private ClienteBO bo;
	
	
	@Test
	@Order(1)
	public void insere() {
		Cliente cliente = new Cliente();
		cliente.setNome("Youtube da Silva");
		cliente.setCpf("987654321000");
		cliente.setDataNascimento(LocalDate.of(2001, 6, 10));
		cliente.setSexo(Sexo.MASCULINO);
		cliente.setEmail("email@tabosa.com");
		cliente.setTelefone("9899787698");
		cliente.setCelular("97987643985");
		cliente.setAtivo(true);
		bo.insere(cliente);
	}
	
	@Test
	@Order(2)
	public void pesquisaPeloId() {
		Cliente cliente = bo.pesquisaPeloId(1L);
		System.out.println(cliente);
	}
	
	@Test
	@Order(3)
	public void atualiza() {
		Cliente cliente = bo.pesquisaPeloId(1L);
		cliente.setCpf("127654221000");
		cliente.setTelefone("1199734697");
		cliente.setCelular(null);
		cliente.setDataNascimento(null);
		bo.atualiza(cliente);
		
	}
	

}
