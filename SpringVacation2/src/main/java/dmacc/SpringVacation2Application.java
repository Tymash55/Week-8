package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import dmacc.beans.Vacation;
import dmacc.controller.*;
import dmacc.repository.VacationRepository;

@SpringBootApplication
public class SpringVacation2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringVacation2Application.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Vacation v = appContext.getBean("vacation", Vacation.class);
		
		System.out.println(v.toString());
	}
	
	@Autowired
	VacationRepository repo;
	
	@Override
	public void run(String...args) throws Exception{
		
		// TODO Auto-generated method stub
				ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
				
				//Using an existing bean
				Vacation v = appContext.getBean("vacation", Vacation.class);
				v.setDesc("Summer Vacation");
				repo.save(v);
				
				//Create a bean to use - not managed by Spring
				Vacation d = new Vacation("Family Vacation", "US","Austin", 6);
				
				
				repo.save(d);
				
				List<Vacation> allMyVacations = repo.findAll();
				for(Vacation people: allMyVacations) {
					System.out.println(people.toString());
				}
				
				//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
				((AbstractApplicationContext) appContext).close();
	}

}
