package dad.cine;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.cine.components.CaratulaPane;
import dad.cine.model.Pelicula;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class CineController implements Initializable {
	
	@FXML
	private BorderPane view;
	
	@FXML
	private CaratulaPane carteleraPane;
	
	public CineController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CineView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Pelicula p1 = new Pelicula();
		p1.setTitulo("Mazinger Z");
		p1.setCaratula(new Image("http://fr.web.img6.acsta.net/c_215_290/pictures/17/10/10/10/07/4889519.jpg"));

		Pelicula p2 = new Pelicula();
		p2.setTitulo("Pulp Fiction");
		p2.setCaratula(new Image("https://pics.filmaffinity.com/pulp_fiction-210382116-large.jpg"));
		
		carteleraPane.getPeliculas().addAll(p1, p2, p1, p1, p2, p2, p1);
	}
	
	public BorderPane getView() {
		return view;
	}

}
