package app;

import java.net.URL;
import java.util.ResourceBundle;

import app.model.AnaliseDeDados;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaController implements Initializable {
	
	private AnaliseDeDados dados;

    @FXML
    private BarChart<?, ?> brAnaliseRange25Numeros;

    @FXML
    private CategoryAxis xAnalisedeRange;

    @FXML
    private NumberAxis yAnaliseRange;

    @FXML
    private TextField txfRange;

    @FXML
    private Button btnAnalisar;

    @FXML
    private BarChart<?, ?> brMediaImparPar;

    @FXML
    private CategoryAxis xMediaImparPar;

    @FXML
    private NumberAxis yMediaImparPar;

    @FXML
    void analisarRange() {
    	dados = new AnaliseDeDados();
    	ObservableList<Integer> contagem = dados.contagemRange(Integer.valueOf(txfRange.getText()));
    	
    	XYChart.Series set = new XYChart.Series();
    	XYChart.Series setImpar = new XYChart.Series();
    	
    	//contagem de porcentagem de ocorrencia de numeros
    	for(int i = 0; i < contagem.size(); i++) {
    		set.getData().add(new XYChart.Data((i+1)+"", contagem.get(i)));
    	}
    	
    	//preenchendo o grafico de impares
    	int impar = dados.mediaImparRange(Integer.valueOf(txfRange.getText()));
    	setImpar.getData().add(new XYChart.Data("Impar", impar));
    	setImpar.getData().add(new XYChart.Data("Par", (15 - impar)));

    	brAnaliseRange25Numeros.getData().clear();
    	brAnaliseRange25Numeros.getData().add(set);
    	
    	brMediaImparPar.getData().clear();
    	brMediaImparPar.getData().add(setImpar);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		txfRange.setText("33");
		
	}

}
