
public class libro {
	String titulo;
	String autor;
	String genero;
	Integer a�o;
	public libro(String titulo, String autor, String genero, Integer a�o) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.a�o = a�o;
		
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

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		libro A = new libro("LA ILIADA", "HOMERO", "DRAMA", 1800);
		libro B = new libro("ROMEO Y JULIETA", "SHAKESPEARE", "DRAMA", 1900);
		libro C = new libro("LA ODISEA", "HOMERO", "ACCION", 1850);
		System.out.println(A.getTitulo() + "\n");
		System.out.println(B.getTitulo() + "\n");
		C.setA�o(1860);
		System.out.println(C.getA�o());

	}

}
