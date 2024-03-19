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
public class ClienteBOTest {
	
	@Autowired
	private ClienteBO bo;

	@Test
	@Order(1)
	public void insere() {
		Cliente cliente = new Cliente();
		cliente.setNome("Christ Sant");
		cliente.setCpf("21369304872");
		cliente.setDataDeNascimento(LocalDate.of(1999, 9, 5));
		cliente.setSexo(Sexo.MASCULINO);
		cliente.setTelefone("0728726428");
		cliente.setCelular("49276108638");
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
		cliente.setCpf("71369304873");
		bo.atualiza(cliente);
	}
	
}
