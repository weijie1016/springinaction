package chapter1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chapter1.BraveKnight;
import chapter1.Knight;
import chapter1.Quest;
import chapter1.RescueDamselQuest;
import chapter1.SlayDragonQuest;

@Configuration
public class KnightConfig {
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	@Bean
	public Quest quest() {
//		return new SlayDragonQuest(System.out);
		return new RescueDamselQuest(System.out);
	}
}
