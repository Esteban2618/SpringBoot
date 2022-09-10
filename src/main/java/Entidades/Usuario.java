package Entidades;

public class Usuario {

    private String nombreEmpleado, email, empresaUsuario, rolUsuario;
    private Long id;

    public Usuario(String nombreEmpleado, String email, String empresaUsuario, String rolUsuario, Long id) {
        this.nombreEmpleado = nombreEmpleado;
        this.email = email;
        this.empresaUsuario = empresaUsuario;
        this.rolUsuario = rolUsuario;
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}