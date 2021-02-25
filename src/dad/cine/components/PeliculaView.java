package dad.cine.components;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.cine.model.Pelicula;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class PeliculaView extends BorderPane implements Initializable {

	private ObjectProperty<Pelicula> pelicula = new SimpleObjectProperty<>(this, "pelicula");

	@FXML
	private ImageView caratulaView;

	@FXML
	private Label tituloLabel;

	public PeliculaView() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PeliculaView.fxml"));
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.pelicula.addListener((o, ov, nv) -> {
			if (nv != null) {
				caratulaView.imageProperty().bind(nv.caratulaProperty());
				tituloLabel.textProperty().bind(nv.tituloProperty());
			}
		});
	}

	public final ObjectProperty<Pelicula> peliculaProperty() {
		return this.pelicula;
	}

	public final Pelicula getPelicula() {
		return this.peliculaProperty().get();
	}

	public final void setPelicula(final Pelicula pelicula) {
		this.peliculaProperty().set(pelicula);
	}

}
