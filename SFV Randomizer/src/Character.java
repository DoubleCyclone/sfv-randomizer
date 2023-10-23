import java.util.Random;

public class Character {
	
	private String name = "NONAME";
	private Costume[] costumes = new Costume[] {};
	private String[] vSkill = new String[] {};
	private String[] vTrigger = new String[] {};
	
	private Costume chosenCostume;
	private String chosenVSkill;
	private String chosenVTrigger;
	
	private static Random random = new Random();

	public Character(String name, Costume[] costumes, String[] vSkill, String[] vTrigger) {
		this.name = name;
		this.costumes = costumes;
		this.vSkill = vSkill;
		this.vTrigger = vTrigger;
		
		this.chosenCostume = costumes[random.nextInt(costumes.length)];
		this.chosenVSkill = vSkill[random.nextInt(vSkill.length)];
		this.chosenVTrigger = vTrigger[random.nextInt(vTrigger.length)];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Costume[] getCostumes() {
		return costumes;
	}

	public void setCostumes(Costume[] costumes) {
		this.costumes = costumes;
	}

	public String[] getvSkill() {
		return vSkill;
	}

	public void setvSkill(String[] vSkill) {
		this.vSkill = vSkill;
	}

	public String[] getvTrigger() {
		return vTrigger;
	}

	public void setvTrigger(String[] vTrigger) {
		this.vTrigger = vTrigger;
	}

	public Costume getChosenCostume() {
		return chosenCostume;
	}

	public void setChosenCostume(Costume chosenCostume) {
		this.chosenCostume = chosenCostume;
	}

	public String getChosenVSkill() {
		return chosenVSkill;
	}

	public void setChosenVSkill(String chosenVSkill) {
		this.chosenVSkill = chosenVSkill;
	}

	public String getChosenVTrigger() {
		return chosenVTrigger;
	}

	public void setChosenVTrigger(String chosenVTrigger) {
		this.chosenVTrigger = chosenVTrigger;
	}

	
	public String randomize() {
		
		return name + "\n" + chosenCostume.getCostumeAndColor() + "\n" + chosenVSkill + "\n" + chosenVTrigger;
	}
	
}
