package Entidades;

public class Usuario {

    private String nombreEmpleado, email, empresaUsuario, rolUsuario;

    public Usuario(String nombreEmpleado, String email, String empresaUsuario, String rolUsuario) {
        this.nombreEmpleado = nombreEmpleado;
        this.email = email;
        this.empresaUsuario = empresaUsuario;
        this.rolUsuario = rolUsuario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresaUsuario() {
        return empresaUsuario;
    }

    public void setEmpresaUsuario(String empresaUsuario) {
        this.empresaUsuario = empresaUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
}
