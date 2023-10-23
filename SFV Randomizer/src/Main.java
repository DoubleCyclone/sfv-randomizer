import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	private static Random random = new Random();

	public static void main(String[] args) {

		new Window().setVisible(true);

	}

	public static Character pickCharacter() {

		int characterCount = 46;

		int randomCharacter = random.nextInt(characterCount) + 1;

		Character chosenCharacter = null;

	// @formatter:off
			switch (randomCharacter) {
			case 1: {
				chosenCharacter = new Character("Gill", new Costume[] { 
						new Costume("Default", Costume.S4ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Pyron", Costume.OtherColorCount), 
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("CPT 2020", Costume.OtherColorCount) }, 
						new String[] { "Meteor Strike", "Blocking" },
						new String[] { "Primal Fire", "Ice of Doom" }); 
				break;
			}
			case 2: {
				chosenCharacter = new Character("Kage", new Costume[] { 
						new Costume("Default", Costume.S4ColorCount+1), // 1 more than usual
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("CPT 2019", Costume.OtherColorCount), 
						new Costume("Asura", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Senha Kassatsu", "Sekieiken" },
						new String[] { "Taigyaku Mudo", "Rikudo Osatsu" });
				break;
			}
			case 3:{
				chosenCharacter = new Character("Falke", new Costume[] { 
						new Costume("Default", Costume.S3ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount), 
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Halloween", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Katt", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Psycho Trombe", "Psycho Mine" },
						new String[] { "Staerken", "Psycho Angriff" });
				break;
			}
			case 4:{
				chosenCharacter = new Character("Menat", new Costume[] { 
						new Costume("Default", Costume.S2ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("School Uniform", Costume.OtherColorCount), 
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Khaibit", Costume.OtherColorCount),
						new Costume("Felicia", Costume.OtherColorCount),
						new Costume("Devilotte", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Sporty", Costume.OtherColorCount)}, 
						new String[] { "Soul Reflect", "Soul Spiral" },
						new String[] { "Wisdom of Thoth", "Prophecy of Thoth" });
				break;
			}
			case 5:{
				chosenCharacter = new Character("Akuma", new Costume[] { 
						new Costume("Default", Costume.S2ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount), 
						new Costume("CPT 2018", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("NASR", Costume.TSuitColorCount),
						new Costume("UYU", Costume.TSuitColorCount),
						new Costume("Garuda", Costume.OtherColorCount),
						new Costume("Cyber-Akuma", Costume.OtherColorCount)}, 
						new String[] { "Rakan", "Kiai" },
						new String[] { "Dohatsu Shoten", "Shiretsu Hasshi" });
				break;
			}
			case 6:{
				chosenCharacter = new Character("Alex", new Costume[] { 
						new Costume("Default", Costume.S1ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Leo", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Overhaul", "Overchain" },
						new String[] { "Rage Shift", "Rage Boost" });
				break;
			}
			case 7:{
				chosenCharacter = new Character("Rashid", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Sporty", Costume.OtherColorCount), 
						new Costume("Airman", Costume.OtherColorCount),
						new Costume("Viewtiful Joe", Costume.OtherColorCount),
						new Costume("CPT 2019", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("NASR", Costume.TSuitColorCount),
						new Costume("UYU", Costume.TSuitColorCount)}, 
						new String[] { "Front Flip", "Wing Stroke" },
						new String[] { "Ysaar", "Easifa" });
				break;
			}
			case 8:{
				chosenCharacter = new Character("R.Mika", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Holiday", Costume.OtherColorCount), 
						new Costume("School Uniform", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Professional 2", Costume.OtherColorCount),
						new Costume("Zinogre X Armor", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Mic Performance", "Pumped Up!" },
						new String[] { "C'mon Nadeshiko!", "Steel Chair" });
				break;
			}
			case 9:{
				chosenCharacter = new Character("Chun-Li", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("School Uniform", Costume.OtherColorCount), 
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Vacation", Costume.OtherColorCount),
						new Costume("Pajamas", Costume.OtherColorCount),
						new Costume("Undercover Cop", Costume.OtherColorCount),
						new Costume("Special Forces", Costume.OtherColorCount),
						new Costume("Training", Costume.OtherColorCount),
						new Costume("Covert Operations", Costume.OtherColorCount),
						new Costume("Wedding", Costume.OtherColorCount),
						new Costume("CPT", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Morrigan", Costume.OtherColorCount),
						new Costume("June", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Rankyaku", "Hazanshu" },
						new String[] { "Renkiko", "Kikosho" });
				break;
			}
			case 10:{
				chosenCharacter = new Character("Ryu", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("School Uniform", Costume.OtherColorCount),
						new Costume("CPT 2017", Costume.OtherColorCount),
						new Costume("Mega Man", Costume.OtherColorCount),
						new Costume("Arthur", Costume.OtherColorCount),
						new Costume("Jin Saotome", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Kairi", Costume.OtherColorCount)}, 
						new String[] { "Mind's Eye", "Thrust Strike" },
						new String[] { "Denjin Renki", "Kakko Fubatsu" });
				break;
			}
			case 11:{
				chosenCharacter = new Character("Ken", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Holiday", Costume.OtherColorCount), 
						new Costume("CPT 2017", Costume.OtherColorCount),
						new Costume("Dante", Costume.OtherColorCount),
						new Costume("Rathalos Armor", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Falcon", Costume.OtherColorCount)}, 
						new String[] { "Quick Step", "Ryusenkyaku" },
						new String[] { "Heat Rush", "Shinryuken" });
				break;
			}
			case 12:{
				chosenCharacter = new Character("Cammy", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("School Uniform", Costume.OtherColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Dolls", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("CPT", Costume.OtherColorCount),
						new Costume("Cannon Spike", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Jill", Costume.OtherColorCount),
						new Costume("Fiona", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Blair Dame", Costume.OtherColorCount),
						new Costume("Killer Bee", Costume.OtherColorCount)}, 
						new String[] { "Axel Spin Knuckle", "Spinning Attack" },
						new String[] { "Delta Drive", "Delta Advance" });
				break;
			}
			case 13:{
				chosenCharacter = new Character("Vega", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Classic", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Professional 2", Costume.OtherColorCount)}, 
						new String[] { "Matador Turn", "Matador Flip" },
						new String[] { "Bloody Kiss", "Alegrias" });
				break;
			}
			case 14:{
				chosenCharacter = new Character("Necalli", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("CPT", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Culminated Power", "Crawling Beast" },
						new String[] { "Torrent of Power", "Eruption of Power" });
				break;
			}
			case 15:{
				chosenCharacter = new Character("Guile", new Costume[] { 
						new Costume("Default", Costume.S1ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("SF 30th Anniversary", Costume.OtherColorCount), 
						new Costume("CPT 2017", Costume.OtherColorCount),
						new Costume("Halloween", Costume.OtherColorCount),
						new Costume("Nameless Super Soldier", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Sonic Blade", "Dive Sonic" },
						new String[] { "Solid Puncher", "Knife Edge" });
				break;
			}
			case 16:{
				chosenCharacter = new Character("Kolin", new Costume[] { 
						new Costume("Default", Costume.S2ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount), 
						new Costume("Sporty", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Halloween", Costume.OtherColorCount),
						new Costume("Ada", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Inside Slash", "Glacier Through" },
						new String[] { "Diamond Dust", "Absolute Zero" });
				break;
			}
			case 17:{
				chosenCharacter = new Character("Zeku", new Costume[] { 
						new Costume("Default", Costume.S2ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount), 
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Kenji", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("NASR", Costume.TSuitColorCount)}, 
						new String[] { "Fukuro", "Kuchiyose-Shii" },
						new String[] { "Bushinryu Shingekiko", "Karura Tenzan" });
				break;
			}
			case 18:{
				chosenCharacter = new Character("Cody", new Costume[] { 
						new Costume("Default", Costume.S3ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount), 
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Final Fight", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Vergil", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Double Kick", "Crime Sway" },
						new String[] { "Side Arm", "Dirty Coach" });
				break;
			}
			case 19:{
				chosenCharacter = new Character("Poison", new Costume[] { 
						new Costume("Default", Costume.S4ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Halloween", Costume.OtherColorCount),
						new Costume("Lady", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Perfume Swing", "Cartwheel" },
						new String[] { "Poison Cocktail", "Toxic Glamor" });
				break;
			}
			case 20:{
				chosenCharacter = new Character("Seth", new Costume[] { 
						new Costume("Default", Costume.S4ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("UYU", Costume.TSuitColorCount),
						new Costume("CPT 2021", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount)}, 
						new String[] { "Tanden Engine", "Tanden Booster" },
						new String[] { "Tanden Ignition", "Tanden Manuever" });
				break;
			}
			case 21:{
				chosenCharacter = new Character("E.Honda", new Costume[] { 
						new Costume("Default", Costume.S4ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Halloween", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Neko Damashi", "Sumo Spirit" },
						new String[] { "Onigawara", "Tajikarao" });
				break;
			}
			case 22:{
				chosenCharacter = new Character("G", new Costume[] { 
						new Costume("Default", Costume.S3ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Holiday", Costume.OtherColorCount), 
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Skullomania", Costume.OtherColorCount),
						new Costume("CPT 2021", Costume.OtherColorCount)}, 
						new String[] { "G Barrier", "G Protection" },
						new String[] { "Maximum President", "Dangerous President" });
				break;
			}
			case 23:{
				chosenCharacter = new Character("Sakura", new Costume[] { 
						new Costume("Default", Costume.S3ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("CPT 2018", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Roll", Costume.OtherColorCount),
						new Costume("Party Dress", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Haru Kaze", "Haru Hayate" },
						new String[] { "Haru Arashi", "Sakura Senpu" });
				break;
			}
			case 24:{
				chosenCharacter = new Character("Ed", new Costume[] { 
						new Costume("Default", Costume.S2ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("SchoolUniform", Costume.OtherColorCount), 
						new Costume("Demitri", Costume.OtherColorCount),
						new Costume("Nero", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Sporty", Costume.OtherColorCount)}, 
						new String[] { "Psycho Snatcher", "Psycho Swing" },
						new String[] { "Psycho Cannon", "Enhanced Snatcher" });
				break;
			}
			case 25:{
				chosenCharacter = new Character("Juri", new Costume[] { 
						new Costume("Default", Costume.S1ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("School Uniform", Costume.OtherColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Lilith", Costume.OtherColorCount),
						new Costume("Mech", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("True Boss", Costume.OtherColorCount),
						new Costume("Spider", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount)}, 
						new String[] { "Kasatsushu", "Fuha Enzan" },
						new String[] { "Feng Shui Engine Alpha", "Feng Shui Engine Beta" });
				break;
			}
			case 26:{
				chosenCharacter = new Character("Ibuki", new Costume[] { 
						new Costume("Default", Costume.S1ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("School Uniform", Costume.OtherColorCount), 
						new Costume("Sporty", Costume.OtherColorCount),
						new Costume("SF 30th Anniversary", Costume.OtherColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Akane", Costume.OtherColorCount),
						new Costume("Kirin Armor", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Tenrai", "Makibishi" },
						new String[] { "Rokushaku Horokudama", "Fuma Shuriken" });
				break;
			}
			case 27:{
				chosenCharacter = new Character("Laura", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Holiday", Costume.OtherColorCount), 
						new Costume("Sporty", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Gloria", Costume.OtherColorCount),
						new Costume("Swimsuit 2", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("CPT 2020", Costume.OtherColorCount)}, 
						new String[] { "Volty Line", "Volty Sprink" },
						new String[] { "Spark Show", "Shock Stance" });
				break;
			}
			case 28:{
				chosenCharacter = new Character("Zangief", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Holiday", Costume.OtherColorCount), 
						new Costume("Sporty", Costume.OtherColorCount),
						new Costume("Mech", Costume.OtherColorCount),
						new Costume("The Gief", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Iron Muscle", "Super Russian Kick" },
						new String[] { "Cyclone Lariat", "Cossack Muscle" });
				break;
			}
			case 29:{
				chosenCharacter = new Character("Karin", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Holiday", Costume.OtherColorCount), 
						new Costume("SF 30th Anniversary", Costume.OtherColorCount),
						new Costume("Sporty", Costume.OtherColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Ingrid", Costume.OtherColorCount),
						new Costume("Professional", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Hokuto", Costume.OtherColorCount)}, 
						new String[] { "Myo-oken", "Fudo Sosho" },
						new String[] { "Guren no Kata", "Tenha no Kata" });
				break;
			}
			case 30:{
				chosenCharacter = new Character("Nash", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("School Uniform", Costume.OtherColorCount),
						new Costume("Cannon Spike", Costume.OtherColorCount),
						new Costume("Captain Commando", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Bullet Clear", "Silent Sharpness" },
						new String[] { "Sonic Move", "Stealth Dash" });
				break;
			}
			case 31:{
				chosenCharacter = new Character("M.Bison", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("SF 30th Anniversary", Costume.OtherColorCount), 
						new Costume("Halloween", Costume.OtherColorCount),
						new Costume("Classic", Costume.OtherColorCount),
						new Costume("Astaroth", Costume.OtherColorCount),
						new Costume("Psycho Miasma", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Psycho Reflect", "Hell's Warp" },
						new String[] { "Psycho Power", "Psycho Nightmare" });
				break;
			}
			case 32:{
				chosenCharacter = new Character("Birdie", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("CPT 2018", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Break Time", "Chewing Time" },
						new String[] { "Enjoy Time", "Birdie Time" });
				break;
			}
			case 33:{
				chosenCharacter = new Character("Dhalsim", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Classic", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Yoga Float", "Yoga Deep Breath" },
						new String[] { "Yoga Burner", "Yoga Sansara" });
				break;
			}
			case 34:{
				chosenCharacter = new Character("F.A.N.G", new Costume[] { 
						new Costume("Default", Costume.S0ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Mech", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Nishidoku", "Sodokubu" },
						new String[] { "Dokunomu", "Koryo Dokuda" });
				break;
			}
			case 35:{
				chosenCharacter = new Character("Balrog", new Costume[] { 
						new Costume("Default", Costume.S1ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount), 
						new Costume("Mike-like", Costume.OtherColorCount),
						new Costume("Gutsman", Costume.OtherColorCount),
						new Costume("No Escape", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "KKB", "FFB" },
						new String[] { "Crazy Rush", "B3" });
				break;
			}
			case 36:{
				chosenCharacter = new Character("Urien", new Costume[] { 
						new Costume("Default", Costume.S1ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Donovan", Costume.OtherColorCount),
						new Costume("Wesker", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Metallic Aura", "Indignant Thunder" },
						new String[] { "Aegis Reflector", "Tyrant Pressure" });
				break;
			}
			case 37:{
				chosenCharacter = new Character("Abigail", new Costume[] { 
						new Costume("Default", Costume.S2ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Halloween", Costume.OtherColorCount), 
						new Costume("Mech", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Hungabee", "C'mon Spare Tire" },
						new String[] { "Max Power", "Hybrid Charge" });
				break;
			}
			case 38:{
				chosenCharacter = new Character("Blanka", new Costume[] { 
						new Costume("Default", Costume.S3ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount), 
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Nergigante", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Coward Crouch", "Shout of Earth" },
						new String[] { "Jungle Dynamo", "Lightning Beast" });
				break;
			}
			case 39:{
				chosenCharacter = new Character("Sagat", new Costume[] { 
						new Costume("Default", Costume.S3ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Classic", Costume.OtherColorCount),
						new Costume("CPT 2019", Costume.OtherColorCount),
						new Costume("Shade", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Angry Charge", "Hanuman Charge" },
						new String[] { "Tiger Charge", "Tiger Assault" });
				break;
			}
			case 40:{
				chosenCharacter = new Character("Lucia", new Costume[] { 
						new Costume("Default", Costume.S4ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Holiday", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("CPT 2020", Costume.OtherColorCount),
						new Costume("Sporty", Costume.OtherColorCount)}, 
						new String[] { "Tap-Kick", "Arrest Heel" },
						new String[] { "Burning Fight", "Weapon Fury" });
				break;
			}case 41:{
				chosenCharacter = new Character("Dan", new Costume[] { 
						new Costume("Default", Costume.S5ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Saikyo-Style Burairuten No Kamae", "Saikyo-Style Otokoboe" },
						new String[] { "Haoh Gadoken", "Tenchi Saikyo No Kata" });
				break;
			}case 42:{
				chosenCharacter = new Character("Eleven", new Costume[] {new Costume("?????", 1)}, 
						new String[] { "?????"},
						new String[] { "?????"});
				break;
			}case 43:{
				chosenCharacter = new Character("Rose", new Costume[] { 
						new Costume("Default", Costume.S5ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount),
						new Costume("Ruby Heart", Costume.OtherColorCount)}, 
						new String[] { "Soul Fortune", "Soul Satellite" },
						new String[] { "Soul Dimension", "Soul Illusion" });
				break;
			}case 44:{
				chosenCharacter = new Character("Oro", new Costume[] { 
						new Costume("Default", Costume.S5ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Onibi", "Minomushi" },
						new String[] { "Manrikitan", "Tengu Stone" });
				break;
			}case 45:{
				chosenCharacter = new Character("Akira", new Costume[] { 
						new Costume("Default", Costume.S5ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),
						new Costume("Nostalgia", Costume.OtherColorCount),
						new Costume("Swimsuit", Costume.OtherColorCount),
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Kiko Rensei", "Tsutenda" },
						new String[] { "Otoko no Senaka", "Haten no Kamae" });
				break;
			}case 46:{
				chosenCharacter = new Character("Luke", new Costume[] { 
						new Costume("Default", Costume.S5ColorCount),
						new Costume("Story", Costume.StoryColorCount),
						new Costume("Battle Outfit 1", Costume.BattleColorCount),						
						new Costume("Track Suit", Costume.TSuitColorCount)}, 
						new String[] { "Hard Shot", "Supressor" },
						new String[] { "Fully Armed", "Vanguard" });
				break;
			}
			}
			// @formatter:on	
		return chosenCharacter;
	}

	public static class Window extends JFrame implements ActionListener {

		Character character = pickCharacter();

		JPanel pnlInfo = new JPanel();
		JPanel pnlVTrigger = new JPanel();
		JPanel pnlVSkill = new JPanel();

		JLabel lblCharacter = new JLabel("Character");
		JLabel lblCostume = new JLabel("Costume");
		JLabel lblColor = new JLabel("Color");
		JLabel lblVSkill = new JLabel("VSkill");
		JLabel lblVTrigger = new JLabel("VTrigger");

		JLabel lblImgVSkill = new JLabel(new ImageIcon(character.getChosenVSkill().equals(character.getvSkill()[0])
				? this.getClass().getResource("images/icons/vskill1.png")
				: this.getClass().getResource("images/icons/vskill2.png")));
		JLabel lblImgVTrigger = new JLabel(
				new ImageIcon(character.getChosenVTrigger().equals(character.getvTrigger()[0])
						? this.getClass().getResource("images/icons/vtrigger1.png")
						: this.getClass().getResource("images/icons/vtrigger2.png")));
		// JLabel lblImgCharacter = new JLabel(new
		// ImageIcon(this.getClass().getResource(name)))

		JTextField txtCharacter = new JTextField(character.getName());
		JTextField txtCostume = new JTextField(character.getChosenCostume().getName());
		JTextField txtColor = new JTextField(character.getChosenCostume().getChosenColor().toString());
		JTextField txtVSkill = new JTextField(character.getChosenVSkill());
		JTextField txtVTrigger = new JTextField(character.getChosenVTrigger());

		JButton btnReroll = new JButton("Reroll");

		public Window() {
			super("SFV Randomizer V4");

			txtCharacter.setEditable(false);
			txtCostume.setEditable(false);
			txtColor.setEditable(false);
			txtVSkill.setEditable(false);
			txtVTrigger.setEditable(false);

			pnlInfo.setLayout(new GridLayout(5, 2));
			pnlInfo.add(lblCharacter);
			lblCharacter.setHorizontalAlignment(JLabel.CENTER);
			lblCharacter.setVerticalAlignment(JLabel.CENTER);
			pnlInfo.add(txtCharacter);
			txtCharacter.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(lblCostume);
			lblCostume.setHorizontalAlignment(JLabel.CENTER);
			lblCostume.setVerticalAlignment(JLabel.CENTER);
			pnlInfo.add(txtCostume);
			txtCostume.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(lblColor);
			lblColor.setHorizontalAlignment(JLabel.CENTER);
			lblColor.setVerticalAlignment(JLabel.CENTER);
			pnlInfo.add(txtColor);
			txtColor.setHorizontalAlignment(JLabel.CENTER);
			pnlInfo.add(lblVSkill);
			lblVSkill.setHorizontalAlignment(JLabel.CENTER);
			lblVSkill.setVerticalAlignment(JLabel.CENTER);

			pnlVSkill.setLayout(new BorderLayout());
			pnlVSkill.add(txtVSkill, BorderLayout.CENTER);
			txtVSkill.setHorizontalAlignment(JLabel.CENTER);
			pnlVSkill.add(lblImgVSkill, BorderLayout.EAST);
			pnlInfo.add(pnlVSkill);

			pnlInfo.add(lblVTrigger);
			lblVTrigger.setHorizontalAlignment(JLabel.CENTER);
			lblVTrigger.setVerticalAlignment(JLabel.CENTER);

			pnlVTrigger.setLayout(new BorderLayout());
			pnlVTrigger.add(txtVTrigger, BorderLayout.CENTER);
			txtVTrigger.setHorizontalAlignment(JLabel.CENTER);
			pnlVTrigger.add(lblImgVTrigger, BorderLayout.EAST);
			pnlInfo.add(pnlVTrigger);

			btnReroll.addActionListener(this);

			setLayout(new BorderLayout());
			add(pnlInfo, BorderLayout.CENTER);
			add(btnReroll, BorderLayout.SOUTH);

			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(420, 300);
			setLocationRelativeTo(null);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnReroll) {
				character = pickCharacter();

				txtCharacter.setText(character.getName());
				txtCostume.setText(character.getChosenCostume().getName());
				txtColor.setText(character.getChosenCostume().getChosenColor().toString());
				txtVSkill.setText(character.getChosenVSkill());
				txtVTrigger.setText(character.getChosenVTrigger());
				lblImgVSkill.setIcon(new ImageIcon(character.getChosenVSkill().equals(character.getvSkill()[0])
						? this.getClass().getResource("images/icons/vskill1.png")
						: this.getClass().getResource("images/icons/vskill2.png")));
				lblImgVTrigger.setIcon(new ImageIcon(character.getChosenVTrigger().equals(character.getvTrigger()[0])
						? this.getClass().getResource("images/icons/vtrigger1.png")
						: this.getClass().getResource("images/icons/vtrigger2.png")));

			}

		}

	}

}
