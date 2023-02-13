/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
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
    public List<clsUsuario> getListadoUsuarios()
    {
        daoUsuario daousuario = new daoUsuario();
        List<clsUsuario> listadoUsuarios = daousuario.select();
        return listadoUsuarios;
    }
    public int setBorrarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.delete(usuario);
    }          
    public int setIngresarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.insert(usuario);
    }              
    public clsUsuario getBuscarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.query(usuario);
    }                  
    public int setModificarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.update(usuario);
    }              
}
