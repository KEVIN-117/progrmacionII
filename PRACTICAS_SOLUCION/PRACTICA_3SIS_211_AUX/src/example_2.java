import java.util.Scanner;

public class example_2 
{
    public static void main(String[] args) 
    {
      //Valores que tiene el arreglo desordenado.
      int arreglo[] = {6, 4, 2, 5, 8, 1, 3 };
      int arregloOrdenado[] = burbuja(arreglo);
 
      //imprimimos el arreglo ordenado.
      for(int i = 0; i < arregloOrdenado.length;i++)
        System.out.print(arregloOrdenado[i]+"  ");
    }
    public static int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 0; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i-1;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}