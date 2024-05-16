package guid;

public class Usuario {
    private String nombre;
    private String numeroCuenta;
    private String fechaNacimiento;
    private String direccion;
    private String rutaFoto;

    public Usuario(String nombre, String numeroCuenta, String fechaNacimiento, String direccion, String rutaFoto) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.rutaFoto = rutaFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }
}

