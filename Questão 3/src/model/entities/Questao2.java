package model.entities;

public class PessoaFisica {

	private Integer idPeFis;
	private Integer cpfPeFis;
	private Integer rgPeFis;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(Integer idPeFis, Integer cpfPeFis, Integer rgPeFis) {
		super();
		this.idPeFis = idPeFis;
		this.cpfPeFis = cpfPeFis;
		this.rgPeFis = rgPeFis;
	}

	public Integer getIdPeFis() {
		return idPeFis;
	}

	public void setIdPeFis(Integer idPeFis) {
		this.idPeFis = idPeFis;
	}

	public Integer getCpfPeFis() {
		return cpfPeFis;
	}

	public void setCpfPeFis(Integer cpfPeFis) {
		this.cpfPeFis = cpfPeFis;
	}

	public Integer getRgPeFis() {
		return rgPeFis;
	}

	public void setRgPeFis(Integer rgPeFis) {
		this.rgPeFis = rgPeFis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfPeFis == null) ? 0 : cpfPeFis.hashCode());
		result = prime * result + ((idPeFis == null) ? 0 : idPeFis.hashCode());
		result = prime * result + ((rgPeFis == null) ? 0 : rgPeFis.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (cpfPeFis == null) {
			if (other.cpfPeFis != null)
				return false;
		} else if (!cpfPeFis.equals(other.cpfPeFis))
			return false;
		if (idPeFis == null) {
			if (other.idPeFis != null)
				return false;
		} else if (!idPeFis.equals(other.idPeFis))
			return false;
		if (rgPeFis == null) {
			if (other.rgPeFis != null)
				return false;
		} else if (!rgPeFis.equals(other.rgPeFis))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PessoaFisica [idPeFis=" + idPeFis + ", cpfPeFis=" + cpfPeFis + ", rgPeFis=" + rgPeFis + "]";
	}
	
	
}