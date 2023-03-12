
package att3;

import java.util.LinkedList;

public class clientes {
 public static LinkedList <clientes> clientes = new LinkedList<>();
   private int codigo3;
   private String nombre3;
   private int NIT;
   private char correo;
   private String genero;

    public clientes(int codigo3, String nombre3, int NIT, char correo, String genero) {
        this.codigo3 = codigo3;
        this.nombre3 = nombre3;
        this.NIT = NIT;
        this.correo = correo;
        this.genero = genero;
    }

    public int getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(int codigo3) {
        this.codigo3 = codigo3;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public char getCorreo() {
        return correo;
    }

    public void setCorreo(char correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}