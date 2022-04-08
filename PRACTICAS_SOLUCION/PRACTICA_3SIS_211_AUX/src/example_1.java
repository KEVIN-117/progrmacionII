import java.util.ArrayList;


public class example_1 {

	public static void main(String[] args) {
	    Integer[] lista = {7, 4, 3, 2, 3, 3, 2, 5};
	    Integer[] resultado = numeroRepetido(lista);
	    for(Integer i = 0; i < resultado.length; i++) {
	    	System.out.print(resultado[i]+ ", ");
	    }
	}//7 4 3 2 3 3 2 5 
	public static Integer[] numeroRepetido(Integer[] lista) {
		ArrayList<Integer> resultado = new ArrayList<>();
		for(Integer i = 0; i < lista.length; i++) {
			Integer contador=0;
			for(Integer j = 0; j < lista.length; j++) {
				if(lista[i] == lista[j]) {
					if(i != j) {
						lista[j] = -1;
					}
					contador ++;
				}
			}
			if(lista[i] != -1) {
				resultado.add(contador);
			}
			
		}
		return resultado.toArray(new Integer[0]);
	}
}
