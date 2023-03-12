package ah3att3;

import java.util.LinkedList;
public class productos {
    public static LinkedList <productos> productos = new LinkedList<>();
   private int codigo2;
   private String nombre2;
   private String descripcion;
   private int cantidad;
   private String precio;

    public productos(int codigo, String nombre, String descripcion, int cantidad, String precio) {
        this.codigo2 = codigo;
        this.nombre2 = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo2;
    }

    public void setCodigo(int codigo) {
        this.codigo2= codigo;
    }

    public String getNombre() {
        return nombre2;
    }

    public void setNombre(String nombre) {
        this.nombre2 = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
   
}
