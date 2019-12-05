package app.model;

import java.util.ArrayList;
import java.util.List;

import app.dao.ConcursoDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AnaliseDeDados {
	
	private ConcursoDAO cd;
	
	public ObservableList<Integer> contagemGeral() {
		cd = new ConcursoDAO();
		ObservableList<Concurso> concursos = cd.getAllConcursos();
		int [] dezenas = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		
		for(Concurso c : concursos) {
			for(int i = 0; i < c.getDezenas().size(); i++) {
				switch (c.getDezenas().get(i)) {
				case 1:
					dezenas[0]++;
					break;
				case 2:
					dezenas[1]++;
					break;
				case 3:
					dezenas[2]++;
					break;
				case 4:
					dezenas[3]++;
					break;				
				case 5:
					dezenas[4]++;
					break;
				case 6:
					dezenas[5]++;
					break;
				case 7:
					dezenas[6]++;
					break;
				case 8:
					dezenas[7]++;
					break;
				case 9:
					dezenas[8]++;
					break;
				case 10:
					dezenas[9]++;
					break;
				case 11:
					dezenas[10]++;
					break;				
				case 12:
					dezenas[11]++;
					break;
				case 13:
					dezenas[12]++;
					break;
				case 14:
					dezenas[13]++;
					break;
				case 15:
					dezenas[14]++;
					break;
				case 16:
					dezenas[15]++;
					break;
				case 17:
					dezenas[16]++;
					break;
				case 18:
					dezenas[17]++;
					break;
				case 19:
					dezenas[18]++;
					break;
				case 20:
					dezenas[19]++;
					break;
				case 21:
					dezenas[20]++;
					break;
				case 22:
					dezenas[21]++;
					break;
				case 23:
					dezenas[22]++;
					break;
				case 24:
					dezenas[23]++;
					break;
				case 25:
					dezenas[24]++;
					break;

				default:
					break;
				}
			}
		}
		
		ObservableList<Integer> de = FXCollections.observableArrayList();
		
		for(int i: dezenas) {
			de.add(i);
		}
	
		System.out.println(de);
		
		return de;
	}
	
	public ObservableList<Integer> contagemRange(int range) {
		cd = new ConcursoDAO();
		ObservableList<Concurso> concursos = cd.getRangeConcursos(range);
		int [] dezenas = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		
		for(Concurso c : concursos) {
			for(int i = 0; i < c.getDezenas().size(); i++) {
				switch (c.getDezenas().get(i)) {
				case 1:
					dezenas[0]++;
					break;
				case 2:
					dezenas[1]++;
					break;
				case 3:
					dezenas[2]++;
					break;
				case 4:
					dezenas[3]++;
					break;				
				case 5:
					dezenas[4]++;
					break;
				case 6:
					dezenas[5]++;
					break;
				case 7:
					dezenas[6]++;
					break;
				case 8:
					dezenas[7]++;
					break;
				case 9:
					dezenas[8]++;
					break;
				case 10:
					dezenas[9]++;
					break;
				case 11:
					dezenas[10]++;
					break;				
				case 12:
					dezenas[11]++;
					break;
				case 13:
					dezenas[12]++;
					break;
				case 14:
					dezenas[13]++;
					break;
				case 15:
					dezenas[14]++;
					break;
				case 16:
					dezenas[15]++;
					break;
				case 17:
					dezenas[16]++;
					break;
				case 18:
					dezenas[17]++;
					break;
				case 19:
					dezenas[18]++;
					break;
				case 20:
					dezenas[19]++;
					break;
				case 21:
					dezenas[20]++;
					break;
				case 22:
					dezenas[21]++;
					break;
				case 23:
					dezenas[22]++;
					break;
				case 24:
					dezenas[23]++;
					break;
				case 25:
					dezenas[24]++;
					break;

				default:
					break;
				}
			}
		}
		
		ObservableList<Integer> de = FXCollections.observableArrayList();
		
		for(int i: dezenas) {
			de.add(i);
		}
	
		System.out.println(de);
		
		return de;
	}
	
	public Integer mediaImparRange(int range) {
		Integer mediaImpar = 0;
		ObservableList<Concurso> concursos = cd.getRangeConcursos(range);
		int total = 0;
		for(Concurso c: concursos) {
			int impar = 0;
			for(int i = 0; i < c.getDezenas().size(); i++) {
				if(c.getDezenas().get(i) % 2 != 0) {
					impar++;
				}
			}
			total += impar;
		}
		return total/range;
	}
	
	

}
