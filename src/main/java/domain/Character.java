package domain;

import java.util.List;

import lombok.Data;

@Data
public class Character {

	private String name;
	private String jobMain;
	private String jobSub;
	private String jobCombination;

	private List<String> CharComp;
}
