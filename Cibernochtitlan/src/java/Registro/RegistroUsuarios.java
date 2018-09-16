
package Registro;

import BD.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Correo.Email;


@WebServlet(name = "RegistroUsuarios", urlPatterns = {"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {
    
    String id_Persona;
    String nombre,paterno,materno,correo,fecha;
    String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
    

    public String getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(String id_Persona) {
        this.id_Persona = id_Persona;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroUsuarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         RegistroUsuarios obj=new RegistroUsuarios();
         Email email = new Email();
        try{
        String nombre=request.getParameter("nom");
        String paterno=request.getParameter("pat");
        String materno=request.getParameter("mat");
        String correo=request.getParameter("cor");
        String fecha=request.getParameter("fec");
        String telefono=request.getParameter("tel");
        //Variables del formulario
        
        String de = "antoniomc159807@gmail.com";
        String clave = "idqzffdwndpsgmih";
        String mensaje = "Bienvenido a Cibernochtitlan tu registro resulto correcto. Tu usuario es: "+correo+" "+" y tu contraseña es: 123456\n" +
                         "Dirígete a este enlace para poder ingresar al sitio y poder cambiar tu contraseña."
                + " http://192.168.100.9:8084/Cibernochtitlan/pages/login.jsp ";
        String asunto = "Registro a Cibernochtitlan: ";
        //Variables para el envio de correo Electronico

        obj.setNombre(nombre);
        obj.setPaterno(paterno);
        obj.setMaterno(materno);
        obj.setCorreo(correo);
        obj.setFecha(fecha);
        obj.setTelefono(telefono);
        if(nombre=="" || paterno=="" || materno=="" || correo=="" || fecha=="" || telefono==""){
       out.print("error");
        }else{
            obj.buscarCorreo();
            if(obj.getId_Persona()!=null){
                out.print("repetido");
            }else{
             email.enviarCorreo(de, clave, correo, mensaje, asunto);
              obj.InsertarCallableCliente();
            out.print("si");
        }
        }
        }finally{
            out.close();
        }
    }
    
    public void buscarCorreo(){//Método de busca mediante procedimientos almacenados
        try{
            final String sql= "{call buscarCorreo(?)}";//Sintaxis
            Conexion objConexion=new Conexion();//Creo conexion
            CallableStatement cs= objConexion.getCon().prepareCall(sql);//Accede al procedimiento
            cs.setString(1, correo);//Envio de parametros, (indice, valor a enviar)
            ResultSet registro= cs.executeQuery();//Almacena el resultado de la comsulta
            while(registro.next()){
                id_Persona=registro.getString(1);
                RegistroUsuarios manda=new RegistroUsuarios();
                manda.setId_Persona(id_Persona);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void InsertarCallableCliente(){
       		try{
            final String sql= "{call registroUsuarios(?,?,?,?,?,?)}";//Sintaxis
            Conexion objConexion=new Conexion();//Crea conexion
            CallableStatement cs= objConexion.getCon().prepareCall(sql);//Accede al procedimiento
            //Envia valores
            //cs.setInt(1,empleadosId);
            cs.setString(1,nombre);
            cs.setString(2,paterno);
            cs.setString(3,materno);
            cs.setString(4,correo);
            cs.setString(5,telefono);
            cs.setString(6,fecha);
            cs.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
          //  obj2.setE(e);
        }        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
