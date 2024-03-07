package cascadeonetoonem7.cont;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cascadeonetoonem7.dto.AadharCard;
import cascadeonetoonem7.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(101);
	aadharCard.setName("poojita");
	aadharCard.setAge(20);

	Person  person=new Person();
	person.setId(1);
	person.setName("Poojitha");
	person.setAddress("Bangalore");
	person.setAadharCard(aadharCard);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.merge(person);
	entityTransaction.commit();
	
	
}
}
