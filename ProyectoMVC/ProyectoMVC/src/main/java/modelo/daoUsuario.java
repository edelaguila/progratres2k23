/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsUsuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoUsuario {

    private static final String SQL_SELECT = "SELECT usuid, usunombre, usucontrasena FROM tbl_usuario";
    private static final String SQL_INSERT = "INSERT INTO tbl_usuario(usunombre, usucontrasena) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_usuario SET usunombre=?, usucontrasena=? WHERE usuid = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_usuario WHERE usuid=?";
    private static final String SQL_QUERY = "SELECT usuid, usunombre, usucontrasena FROM tbl_usuario WHERE usunombre = ?";

    public List<clsUsuario> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsUsuario usuario = new clsUsuario();
        List<clsUsuario> usuarios = new ArrayList<clsUsuario>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("usuid");
                String nombre = rs.getString("usunombre");
                String contrasena = rs.getString("usucontrasena");
                
                usuario.setIdUsuario(id);
                usuario.setNombreUsuario(nombre);
                usuario.setContrasenaUsuario(contrasena);

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuarios;
    }

    public int insert(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getContrasenaUsuario());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int update(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getContrasenaUsuario());
            stmt.setInt(3, usuario.getIdUsuario());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int delete(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public clsUsuario query(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, usuario.getNombreUsuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("usuid");
                String nombre = rs.getString("usunombre");
                String contrasena = rs.getString("usucontrasena");

                usuario = new clsUsuario();
                usuario.setIdUsuario(id);
                usuario.setNombreUsuario(nombre);
                usuario.setContrasenaUsuario(contrasena);
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return usuario;
    }
}
