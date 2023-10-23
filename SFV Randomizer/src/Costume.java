import java.util.Random;

public class Costume {

	private String name;
	private int colorCount;

	private Integer chosenColor;

	public static int StoryColorCount = 17;
	public static int BattleColorCount = 15;
	public static int OtherColorCount = 10;
	public static int TSuitColorCount = 2;
	public static int S0ColorCount = 26;
	public static int S1ColorCount = 25;
	public static int S2ColorCount = 24;
	public static int S3ColorCount = 23;
	public static int S4ColorCount = 21; // Kage has 1 more
	public static int S5ColorCount = 18;

	private static Random random = new Random();

	public Costume(String name, int colorCount) {
		this.name = name;
		this.colorCount = colorCount;

		this.chosenColor = random.nextInt(colorCount) + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getColorCount() {
		return colorCount;
	}

	public void setColorCount(int colorCount) {
		this.colorCount = colorCount;
	}

	public Integer getChosenColor() {
		return chosenColor;
	}

	public void setChosenColor(int chosenColor) {
		this.chosenColor = chosenColor;
	}

	public String getCostumeAndColor() {
		return name + "\n" + chosenColor;
	}

}
