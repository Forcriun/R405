import java.util.ArrayList;

/**
 * Ejercicio R405 - Encontrando la palabra repetida
 */
class EjercicioR405
{
    /**
     * Método que recibe como parametro una coleccion de objetos String y devuelveç
     * la palabra que esta repetida en dicha colección o o null en caso de que no
     * haya ninguna repetida.
     */
    public String encontrarPalabraRepetida(ArrayList<String> palabras) 
    {
        // Escribe tu código a continuación...
        String repetida = null;

        for(String palabra : palabras){
            int x = 0;  //contador del bucle while
            int coincidencias = 0;
            while(x < palabras.size()){
                if(palabras.get(x).contains(palabra)){
                    coincidencias++;
                }
                else if(palabras.get(x).contains(palabra) && coincidencias > 0){
                    coincidencias++;
                }
                x++;
            }
            if(coincidencias > 1){
                repetida = palabra;
            }
        }

        return repetida;
    }
    // A continuación puedes escribir otros métodos si lo necesitas...
}

