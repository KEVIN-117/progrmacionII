
public class libro {
	String titulo;
	String autor;
	String genero;
	Integer año;
	public libro(String titulo, String autor, String genero, Integer año) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.año = año;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		libro A = new libro("LA ILIADA", "HOMERO", "DRAMA", 1800);
		libro B = new libro("ROMEO Y JULIETA", "SHAKESPEARE", "DRAMA", 1900);
		libro C = new libro("LA ODISEA", "HOMERO", "ACCION", 1850);
		System.out.println(A.getTitulo() + "\n");
		System.out.println(B.getTitulo() + "\n");
		C.setAño(1860);
		System.out.println(C.getAño());

	}

}
