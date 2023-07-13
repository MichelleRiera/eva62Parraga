package modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Motocicletas")
public class Motocicleta implements Serializable{
	
	private static final long serialVersionUID= 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "motocicleta_codigo")
    private int motocicleta_id;
	
	private String placa,marca, color, tipo;
	
	private int anio;
	
	

	
	

	public Motocicleta(int motocicleta_id, String placa, String marca, String color, String tipo, int anio) {
		super();
		this.motocicleta_id = motocicleta_id;
		this.placa = placa;
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
		this.anio = anio;
	}


	public Motocicleta() {
		
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getMotocicleta_id() {
		return motocicleta_id;
	}

	public void setMotocicleta_id(int motocicleta_id) {
		this.motocicleta_id = motocicleta_id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Motocicleta [motocicleta_id=" + motocicleta_id + ", placa=" + placa + ", marca=" + marca + ", color="
				+ color + ", tipo=" + tipo + ", anio=" + anio + "]";
	}

	
	
	

}
