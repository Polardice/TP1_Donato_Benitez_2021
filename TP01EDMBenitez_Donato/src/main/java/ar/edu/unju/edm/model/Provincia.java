package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private int codProvincia;
	private String nombreDeProvincia;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public int getCodProvincia() {
		return codProvincia;
	}

	public void setCodProvincia(int codProvincia) {
		this.codProvincia = codProvincia;
	}

	public String getNombreDeProvincia() {
		return nombreDeProvincia;
	}

	public void setNombreDeProvincia(String nombreDeProvincia) {
		this.nombreDeProvincia = nombreDeProvincia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codProvincia;
		result = prime * result + ((nombreDeProvincia == null) ? 0 : nombreDeProvincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		if (codProvincia != other.codProvincia)
			return false;
		if (nombreDeProvincia == null) {
			if (other.nombreDeProvincia != null)
				return false;
		} else if (!nombreDeProvincia.equals(other.nombreDeProvincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Provincia [codProvincia=" + codProvincia + ", nombreDeProvincia=" + nombreDeProvincia + "]";
	}
	
	
}
