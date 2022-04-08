
public class Pelicula {
	private String titulo;
	private String protagonista;
	private Integer año;
	public Pelicula(String titulo, String protagonista, Integer año) {
		this.titulo = titulo;
		this.protagonista = protagonista;
		this.año = año;
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


	public Integer getAño() {
		return año;
	}


	public void setAño(Integer año) {
		this.año = año;
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
