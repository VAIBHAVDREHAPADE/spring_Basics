package com.vhinkdynamic.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vhinkdynamic.spring.learnspringframework.game.GameRunner;

//import com.vhinkdynamic.spring.learnspringframework.game.SuperContraGame;
//import com.vhinkdynamic.spring.learnspringframework.game.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		
//** Tight Coupling
		       //Note : Tight Coupling Example whenever I need to switch one game to other I need to change the Run code Argument
		
			//MarioGame game = new MarioGame();
			//SuperContraGame game = new SuperContraGame();
		
//** Loose Coupling - Interfaces ( Iteration 1)
						// Change in Runner constructor Argument as Interface 
		//GameRunner runner = new GameRunner(game);		
		
		
//** Loose Coupling - Interfaces ( Iteration 2 Spring)
		
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
