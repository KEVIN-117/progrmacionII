
public class Pelicula {
	private String titulo;
	private String protagonista;
	private Integer a�o;
	public Pelicula(String titulo, String protagonista, Integer a�o) {
		this.titulo = titulo;
		this.protagonista = protagonista;
		this.a�o = a�o;
	}
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getProtagonista() {
		return protagonista;
	}


	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}


	public Integer getA�o() {
		return a�o;
	}


	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula a = new Pelicula("RAMVO", "STALLONE", 1985);
		Pelicula b = new Pelicula("TITANIC", "CRUISE", 1996);
		
		a.setTitulo("RAMBO");
		b.setProtagonista("DICAPRIO");
		
		System.out.println(a.getTitulo() + " " + a.getProtagonista());
	}

}
