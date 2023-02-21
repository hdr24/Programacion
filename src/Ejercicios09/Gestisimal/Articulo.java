package Ejercicios09.Gestisimal;

public class Articulo {

    private int cod = -1, precCompra, precVenta, stock;
    private String desc;

    public Articulo() {}
    public Articulo(int codigo, int precioCompra, int precioVenta, int cantidad, String descripcion) {
    this.cod = codigo;
    this.precCompra = precioCompra;
    this.precVenta = precioVenta;
    this.stock = cantidad;
    this.desc = descripcion;
    }

    public int getCod() {
        return cod;
    }

    public int getPrecCompra() {
        return precCompra;
    }

    public int getPrecVenta() {
        return precVenta;
    }

    public int getStock() {
        return stock;
    }

    public String getDesc() {
        return desc;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrecCompra(int precCompra) {
        this.precCompra = precCompra;
    }

    public void setPrecVenta(int precVenta) {
        this.precVenta = precVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public String toString() {
        return "Artículo: " + this.desc + "\n   Stock: " + this.stock + "\n   Precio Venta: " + this.precVenta + "\n   Precio compra " + this.precVenta + "\n   Codigo: " + this.cod + "\n";
    }
}
