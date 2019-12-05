package app.model;

import javafx.collections.ObservableList;

public class Concurso {
	
	private Long concurso;
	private ObservableList<Integer> dezenas;
	public Long getConcurso() {
		return concurso;
	}
	public void setConcurso(Long concurso) {
		this.concurso = concurso;
	}
	public ObservableList<Integer> getDezenas() {
		return dezenas;
	}
	public void setDezenas(ObservableList<Integer> dezenas) {
		this.dezenas = dezenas;
	}
	
	
	
	

}
