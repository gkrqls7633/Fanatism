package panatism;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.CharComp;
import domain.CharComp.JobMain;
import domain.Character;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/fanatism")
public class HomeController {
	
	@GetMapping("/main")  //main hompage
	public String home() {
		return "home";
	}
	@GetMapping("/character")
	public String showCharacterHome(Model model) {
		List<CharComp> CharComp = Arrays.asList(
				new CharComp("A", "전사", JobMain.Warrior, null, null),
				new CharComp("B", "마법사", JobMain.Wizard, null, null),
				new CharComp("C", "궁수", JobMain.Archer, null, null),
				new CharComp("D", "도적", JobMain.Thief, null, null)
		);
		
		Job[] jobs = CharComp.JobMain.values();
		for (Job job : jobs) {
			model.addAttribute(job.toString().toLowerCase(),
					filterByJobMain(CharComp, job));
		}
		
		model.addAttribute("character", new Character());
		
		return "design";
	}
	private List<CharComp> filterByJobMain(
			List<CharComp> charComp, Job job) {
		return charComp.stream().filter(x -> x.getJobMain().equals(job))
				.collect(Collectors.toList());

	}
	
}
