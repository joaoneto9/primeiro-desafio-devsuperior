package com.devsuperior.curso.primeiro.desafio;

import com.devsuperior.curso.primeiro.desafio.entity.Pedido;
import com.devsuperior.curso.primeiro.desafio.service.PedidoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final PedidoService pedidoService;


	public Application(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Pedido pedido1 = new Pedido(1034, 150.00, 20.00);
		Pedido pedido2 = new Pedido(2282, 800.00, 10.00);
		Pedido pedido3 = new Pedido(1309, 95.90, 0.0);

		List<Pedido> lista = new ArrayList();
		lista.add(pedido1);
		lista.add(pedido2);
		lista.add(pedido3);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("TESTE " + i + ":\n");
			System.out.println("Pedido Codigo " + lista.get(i).getId());
			System.out.println("Valor Total: " + pedidoService.getValorTotal(lista.get(i)));
		}

	}
}
