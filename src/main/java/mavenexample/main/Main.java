package mavenexample.main;

import javax.persistence.EntityManager;

import mavenexample.Banco;
import mavenexample.db.Conn;

public class Main {
	
	public static void main(String[] args) {
		//Todo Auto-generated method stub
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		/*
		Banco bancoSaga = new Banco();
		bancoSaga.setBancoNombre("Saga");
		
		em.getTransaction().begin();
		em.persist(bancoSaga);
		em.getTransaction().commit();
		
		System.out.println("Se creo un nuevo banco");
	
	
	*/
	
		Banco bcpBanco = new Banco();
		bcpBanco.setBancoNombre("BCP");
		
		em.getTransaction().begin();
		em.persist(bcpBanco);
		em.getTransaction().commit();
		
		Banco bcpResultado = em.find(Banco.class, 2);
	
		System.out.println("Se creo el bcp");
		em.close();
	}
}
