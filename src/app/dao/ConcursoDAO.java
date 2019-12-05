package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.config.DBConfig;
import app.model.Concurso;
import app.model.Dezena;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ConcursoDAO {

	private Connection con;
	
	private PreparedStatement ps;
	private ResultSet rs;
	
/*	public List<List<Integer>> getAllConcursos(){
		List<List<Integer>> concursos = new ArrayList<List<Integer>>();
		
		con = DBConfig.getConnection();
		
		String sql = " SELECT concurso, bola1, bola2, bola3, bola4, bola5, bola6, bola7, bola8, bola9, bola10, bola11, bola12, bola13, bola14, bola15 FROM concursos ";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				List<Integer> dezenas = new ArrayList<Integer>();
				dezenas.add(rs.getInt("bola1")); 
				dezenas.add(rs.getInt("bola2")); 
				dezenas.add(rs.getInt("bola3")); 
				dezenas.add(rs.getInt("bola4")); 
				dezenas.add(rs.getInt("bola5"));
				dezenas.add(rs.getInt("bola6"));
				dezenas.add(rs.getInt("bola7"));
				dezenas.add(rs.getInt("bola8"));
				dezenas.add(rs.getInt("bola9"));
				dezenas.add(rs.getInt("bola10"));
				dezenas.add(rs.getInt("bola11"));
				dezenas.add(rs.getInt("bola12"));
				dezenas.add(rs.getInt("bola13"));
				dezenas.add(rs.getInt("bola14"));
				dezenas.add(rs.getInt("bola15"));
				
				//concursos.add((int) rs.getLong("concurso"), dezenas);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return concursos;
	}*/
	
	public ObservableList<Concurso> getAllConcursos(){
		ObservableList<Concurso> concursos = FXCollections.observableArrayList();
		
		con = DBConfig.getConnection();
		
		String sql = " SELECT concurso, bola1, bola2, bola3, bola4, bola5, bola6, bola7, bola8, bola9, bola10, bola11, bola12, bola13, bola14, bola15 FROM concursos ";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Concurso concurso = new Concurso();
				concurso.setConcurso(rs.getLong("concurso"));
				ObservableList<Integer> dezenas = FXCollections.observableArrayList();
				dezenas.add(rs.getInt("bola1")); 
				dezenas.add(rs.getInt("bola2")); 
				dezenas.add(rs.getInt("bola3")); 
				dezenas.add(rs.getInt("bola4")); 
				dezenas.add(rs.getInt("bola5"));
				dezenas.add(rs.getInt("bola6"));
				dezenas.add(rs.getInt("bola7"));
				dezenas.add(rs.getInt("bola8"));
				dezenas.add(rs.getInt("bola9"));
				dezenas.add(rs.getInt("bola10"));
				dezenas.add(rs.getInt("bola11"));
				dezenas.add(rs.getInt("bola12"));
				dezenas.add(rs.getInt("bola13"));
				dezenas.add(rs.getInt("bola14"));
				dezenas.add(rs.getInt("bola15"));
				concurso.setDezenas(dezenas);
				
				concursos.add(concurso);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConfig.closeConnection();
		return concursos;
	}
	
	public ObservableList<Concurso> getRangeConcursos(Integer range){
		ObservableList<Concurso> concursos = FXCollections.observableArrayList();
		
		con = DBConfig.getConnection();
		
		String sql = " SELECT concurso, bola1, bola2, bola3, bola4, bola5, bola6, bola7, bola8, bola9, bola10, bola11, bola12, bola13, bola14, bola15 FROM concursos ORDER BY concurso desc LIMIT " + range + " ";
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Concurso concurso = new Concurso();
				concurso.setConcurso(rs.getLong("concurso"));
				ObservableList<Integer> dezenas = FXCollections.observableArrayList();
				dezenas.add(rs.getInt("bola1")); 
				dezenas.add(rs.getInt("bola2")); 
				dezenas.add(rs.getInt("bola3")); 
				dezenas.add(rs.getInt("bola4")); 
				dezenas.add(rs.getInt("bola5"));
				dezenas.add(rs.getInt("bola6"));
				dezenas.add(rs.getInt("bola7"));
				dezenas.add(rs.getInt("bola8"));
				dezenas.add(rs.getInt("bola9"));
				dezenas.add(rs.getInt("bola10"));
				dezenas.add(rs.getInt("bola11"));
				dezenas.add(rs.getInt("bola12"));
				dezenas.add(rs.getInt("bola13"));
				dezenas.add(rs.getInt("bola14"));
				dezenas.add(rs.getInt("bola15"));
				concurso.setDezenas(dezenas);
				
				concursos.add(concurso);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConfig.closeConnection();
		return concursos;
	}

	
	
	
}
