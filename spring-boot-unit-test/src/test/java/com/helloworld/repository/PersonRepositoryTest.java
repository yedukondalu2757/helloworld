package com.helloworld.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.helloworld.model.Person;
import com.helloworld.repository.PersonRepository;

//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataMongoTest
//@AutoConfigureDataMongo
class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;

//	@Autowired
//	private TestEntityManager entityManager;

	@Test
	public void test_savePerson() {
		Person person = new Person(120, "Krishna", 90);
		Person savePerson = personRepository.save(person);
		assertEquals(person, savePerson);
	}

	@Test
	public void test_getPerson() {
		Person person = personRepository.findById(120).get();
		assertEquals("Krishna", person.getName());
	}

	@Test
	public void test_getPersons() {
//		List<Person> personList = Arrays.asList(new Person(110, "Krishna", 88), new Person(101, "Krishna", 88));
		int size = personRepository.findAll().size();
		assertEquals(5, size);
	}

	@Test
	public void test_updatePerson() {
		Person personById = personRepository.findById(120).get();
		personById.setName("Prashant");
		personById.setAge(35);
		Person updatePerson = personRepository.save(personById);
		assertEquals(personById, updatePerson);
	}

	@Test
	public void test_deletePerson() {
		personRepository.deleteById(111);
	}

}
