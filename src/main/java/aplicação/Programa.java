package aplicação;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa" );
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();//
		//em.persist(p1);
		//em.persist(p2); estaciando informações no banco de dados
		//em.persist(p3);
		//em.getTransaction().commit();
		
		Pessoa p = em.find(Pessoa.class, 2); //buscando um objeto no banco de dados
		
		System.out.println(p);
		
		System.out.println("Pronto");
		em.close();
		emf.close();
		

	}

}
