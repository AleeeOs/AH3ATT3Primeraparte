
package ah3att3;

import java.util.LinkedList;

public class Sucursales {
   public static LinkedList <Sucursales> sucursales = new LinkedList<>();
   private int codigo;
   private String nombre;
   private int direccion;
   private char correo;
   private int telefono;

    public Sucursales(int codigo, String nombre, int direccion, char correo, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public static LinkedList<Sucursales> getSucursales() {
        return sucursales;
    }

    public static void setSucursales(LinkedList<Sucursales> sucursales) {
        Sucursales.sucursales = sucursales;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public char getCorreo() {
        return correo;
    }

    public void setCorreo(char correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}