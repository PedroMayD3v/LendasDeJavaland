package application;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import entities.Character;
import entities.Enemy;
import entities.FirstDragon;
import entities.Map;
import entities.Quest;
import entities.Wizard;
import entities.World;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UI.welcomeMessage();
		UI.choiceMessage();
		String option = null;
		Character character = null;
		List<World> worlds = new ArrayList<>();

		switch (sc.next()) {
		case "1":
			System.out.print("Entre com seu nome de Arqueiro: ");
			String name = sc.next();
			break;
		case "2":
			System.out.print("Entre com seu nome de Mago: ");
			name = sc.next();
			character = new Wizard();
			character.setName(name);
			character.setHealth(200.0);
			character.setStrenght(100.0);
			System.out.println();
			break;
		case "3":
			System.out.print("Entre com seu nome de Orc's: ");
			name = sc.next();
			break;
		default:
			System.out.println("Opção não é válida!");
		}

		if (character != null) {
			World cave = new World("A Caverna de JavaLand! ", "Atravesse a Caverna e Complete a Quest", character);
			cave.addCharacter(character); // Adicione o personagem criado ao mundo
			worlds.add(cave);
			
			System.out.println();
			System.out.println(cave.getName());
			System.out.println(cave.getDescription());
			System.out.println("Seu HP = " + character.getHealth());
			System.out.println();
			UI.dragonOfFiristQuest();
			UI.firstQuestion();
			System.out.print(">> ");
			option = sc.next();
			
			if(option.equalsIgnoreCase("Y")) {
				
				Enemy firstDragon = new FirstDragon("Willowf", 260.0, 150.0);
				firstDragon.setHp(260.0);
				firstDragon.setName("Willowf");
				firstDragon.setStrenght(150.0);
				
				Quest quest01 = new Quest("O Dragão Adormecido!!!", 1, "Derrote o Dragão e Ganhe Mana!");
				System.out.println("**********************");
				System.out.println(firstDragon.getName());
				System.out.println("Dragon HP = " + firstDragon.getHp());
				System.out.println("**********************");
				Map map = new Map();
				map.printFirstMap();
				
				UI.firstTalkOfDragon();
				System.out.println("Nome Da Quest: " + quest01.getName());
				System.out.println("Descrição: " + quest01.getDescription());
				System.out.print("Entre com o numero correto: ");
				Integer puzzle01 = sc.nextInt();
				quest01.questLevelOne(puzzle01, character, firstDragon);
			
				
			
			} else if(option.equalsIgnoreCase("N")) {
				
			}
			
		} 
		
		
	}
	
	public static void playBackgroundMusic() {
        try {
            File audioFile = new File("C:\\Users\\pedro\\Downloads\\msc.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception ex) {
            System.out.println("Erro ao carregar e reproduzir a trilha sonora: " + ex.getMessage());
        }
	
}
}
