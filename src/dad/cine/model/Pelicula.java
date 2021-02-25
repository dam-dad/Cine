package dad.cine.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class Pelicula {
	private StringProperty titulo = new SimpleStringProperty(this, "titulo");
	private IntegerProperty anyo = new SimpleIntegerProperty(this, "anyo");
	private StringProperty director = new SimpleStringProperty(this, "director");
	private ObjectProperty<Image> caratula = new SimpleObjectProperty<>(this, "caratula");

	public final StringProperty tituloProperty() {
		return this.titulo;
	}

	public final String getTitulo() {
		return this.tituloProperty().get();
	}

	public final void setTitulo(final String titulo) {
		this.tituloProperty().set(titulo);
	}

	public final IntegerProperty anyoProperty() {
		return this.anyo;
	}

	public final int getAnyo() {
		return this.anyoProperty().get();
	}

	public final void setAnyo(final int anyo) {
		this.anyoProperty().set(anyo);
	}

	public final StringProperty directorProperty() {
		return this.director;
	}

	public final String getDirector() {
		return this.directorProperty().get();
	}

	public final void setDirector(final String director) {
		this.directorProperty().set(director);
	}

	public final ObjectProperty<Image> caratulaProperty() {
		return this.caratula;
	}

	public final Image getCaratula() {
		return this.caratulaProperty().get();
	}

	public final void setCaratula(final Image caratula) {
		this.caratulaProperty().set(caratula);
	}

}
