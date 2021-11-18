package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Animal;
import com.example.demo.entities.Race;
import com.example.demo.repository.AnimalRepo;
import com.example.demo.service.AnimalService;

@SpringBootTest
class AnimalManagementApplicationTests {

	
	/*@Autowired
	private AnimalRepo animalRepo ;
	@Autowired
	private AnimalService animalService;
	
	@Test
	void testAnimalFindByName()
	{
		List<Animal> animals = animalRepo.findByName("chat");
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}
	@Test
	void testAnimalFindByNameContains()
	{
		List<Animal> animals = animalRepo.findByNameContains("chat");
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}
	@Test
	void testAnimalFindByNameAndAge()
	{
		List<Animal> animals = animalRepo.findByAnimalNameAndAge("chat",8L);
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}
	
	@Test
	void findByRace()
	{
		Race r = new Race();
		r.setId(1L);
		List<Animal> animals = animalRepo.findByRace(r);
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}
	
	@Test
	void findByRaceId()
	{
		
		List<Animal> animals = animalRepo.findByRaceId(1L);
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}
	
	@Test
	void findByOrderByNameAsc()
	{
		
		List<Animal> animals = animalRepo.findByOrderByNameAsc();
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}
	
	@Test
	void trierAnimalsAge()
	{
		
		List<Animal> animals = animalRepo.trierAniamlsAge();
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}*/
	@Autowired
	private AnimalService animalService;
	
	@Test 
	void test()
	{
		List<Animal> animals = animalService.getAllAniamls();
		for (Animal animal : animals) {
			System.out.println(animal);
		}
		
	}

}
