package biblioteca;

public abstract class Material {
	private int codigo;
	private String autor;
	private String titulo;
	private int anio;
	private String estado;
	
	  public Material(int codigo, String autor, String titulo, int anio, String estado) {
	        this.codigo = codigo;
	        this.autor = autor;
	        this.titulo = titulo;
	        this.anio = anio;
	        this.estado = estado;
	    }

	    public int getCodigo() { return codigo; }
	    public void setCodigo(int codigo) { this.codigo = codigo; }
	    public String getAutor() { return autor; }
	    public void setAutor(String autor) { this.autor = autor; }
	    public String getTitulo() { return titulo; }
	    public void setTitulo(String titulo) { this.titulo = titulo; }
	    public int getAnio() { return anio; }
	    public void setAnio(int anio) { this.anio = anio; }
	    public String getEstado() { return estado; }
	    public void setEstado(String estado) { this.estado = estado; }

		@Override
		public String toString() {
			return ", \nCodigo = " + codigo + ", \nAutor = " + autor + ", \nTitulo = " + titulo + ", \nAño = " + anio
					+ ", \nEstado = " + "estado " + super.toString();
		}

	   
	    }
	



