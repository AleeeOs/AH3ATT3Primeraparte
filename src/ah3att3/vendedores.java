package ah3att3;

import java.util.LinkedList;

public class vendedores {
  public static LinkedList <vendedores> datos = new LinkedList<>();
   private int codigo;
   private String nombre;
   private int caja;
   private int ventas;
   private String genero;
   private String pass;
   

    public vendedores(int codigo, String nombre, int caja, int ventas, String genero, String pass) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.caja = caja;
        this.ventas = ventas;
        this.genero = genero;
        this.pass = pass;
    }

   


    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCaja() {
        return caja;
    }

    public int getVentas() {
        return ventas;
    }

    public String getGenero() {
        return genero;
    }

    public String getPass() {
        return pass;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getCodigo2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getNombre2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getdescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getcantidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getprecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getCodigo3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getNombre3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


            
}
