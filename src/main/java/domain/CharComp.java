package domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CharComp {

	private final String id;
	private final String name;
	private final JobMain jobMain;
	private final JobSub jobSub;
	private final JobCombination jobCombination;  //직업 조합

	public static enum JobMain {
		Warrior, Wizard, Archer, Thief  //main 직업
	}
	public static enum JobSub {
		a, b, c, d   //sub 직업
	}		
	public static enum JobCombination {
		A, B, C, D   //직업 조합 결과
		
	}
}
