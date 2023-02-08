/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.daoUsuario;
/**
 *
 * @author visitante
 */
public class clsUsuario {
    private int IdUsuario;
    private String NombreUsuario;
    private String ContrasenaUsuario;

    public clsUsuario() {
    }
    
    public clsUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }    
    
    public clsUsuario(String NombreUsuario, String ContrasenaUsuario) {
        this.NombreUsuario = NombreUsuario;
        this.ContrasenaUsuario = ContrasenaUsuario;
    }
    
    public clsUsuario(int IdUsuario, String NombreUsuario, String ContrasenaUsuario) {
        this.IdUsuario = IdUsuario;
        this.NombreUsuario = NombreUsuario;
        this.ContrasenaUsuario = ContrasenaUsuario;
    }    

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasenaUsuario() {
        return ContrasenaUsuario;
    }

    public void setContrasenaUsuario(String ContrasenaUsuario) {
        this.ContrasenaUsuario = ContrasenaUsuario;
    }
    @Override
    public String toString() {
        return "clsUsuario{" + "IdUsuario=" + IdUsuario + ", NombreUsuario=" + NombreUsuario + ", ContrasenaUsuario=" + ContrasenaUsuario + '}';
    }
    public clsUsuario getInformacionUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        usuario = daousuario.query(usuario);
        return usuario;
    }
}
