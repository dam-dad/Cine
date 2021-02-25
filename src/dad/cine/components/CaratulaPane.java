package dad.cine.components;

import java.net.URL;
import java.util.ResourceBundle;

import dad.cine.model.Pelicula;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.layout.TilePane;

public class CaratulaPane extends TilePane implements Initializable {

	private ListProperty<Pelicula> peliculas = new SimpleListProperty<>(this, "peliculas",
			FXCollections.observableArrayList());
	
	public CaratulaPane() {
		initialize(null, null);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		peliculas.addListener(new ListChangeListener<Pelicula>() {
			public void onChanged(Change<? extends Pelicula> c) {
				while (c.next()) {
					for (Pelicula p : c.getAddedSubList()) {
						System.out.println("añadiendo pelicula"); 
						PeliculaView pv = new PeliculaView();
						pv.setPelicula(p);					
						CaratulaPane.this.getChildren().add(pv);
					}
				}
			}
		});
	}

	public final ListProperty<Pelicula> peliculasProperty() {
		return this.peliculas;
	}

	public final ObservableList<Pelicula> getPeliculas() {
		return this.peliculasProperty().get();
	}

	public final void setPeliculas(final ObservableList<Pelicula> peliculas) {
		this.peliculasProperty().set(peliculas);
	}

}
