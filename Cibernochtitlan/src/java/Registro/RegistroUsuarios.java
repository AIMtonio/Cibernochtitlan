
package Registro;

import BD.ConexionCall;
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
import java.util.Random;


@WebServlet(name = "RegistroUsuarios", urlPatterns = {"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {
    
    String id_Persona;
    String nombre,paterno,materno,correo,fecha;
    String telefono;

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
        String apellidos=request.getParameter("ape");
        String correo=request.getParameter("cor");
        //Variables del formulario
        
        String de = "antoniomc159807@gmail.com";
        String clave = "idqzffdwndpsgmih";
        String mensaje = "Bienvenido a Cibernochtitlan tu registro resulto correcto. Tu usuario es: "+correo+" "+" y tu contraseña es: 123456\n" +
                         "Dirígete a este enlace para poder ingresar al sitio y poder cambiar tu contraseña."
                + " http://192.168.100.9:8084/Cibernochtitlan/pages/login.jsp ";
        String asunto = "Registro a Cibernochtitlan: ";
        //Variables para el envio de correo Electronico
       
        if(nombre=="" || apellidos=="" || correo==""){
            //Validar que no se ingresen nulos
       out.print("error");
       //respuesta al script
        }else{
            try{
            final String sql= "{call buscarCorreo(?)}";//Sintaxis
            ConexionCall objConexion=new ConexionCall();//Creo conexion
            CallableStatement cs= objConexion.getCon().prepareCall(sql);//Accede al procedimiento
            cs.setString(1, correo);//Envio de parametros, (indice, valor a enviar)
            ResultSet registro= cs.executeQuery();//Almacena el resultado de la comsulta
            while(registro.next()){
                id_Persona=registro.getString(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }//Valida  si el correo no esta registrado
            if(obj.id_Persona!=null){
                out.print("repetido");
            }else{
             email.enviarCorreo(de, clave, correo, mensaje, asunto);
             //envia correo
            try{
            Random codigoR=new Random();
             int kdr=codigoR.nextInt(10000*10000);
             int validarExistenciaKdr=0;
             //Genera KDR
             
                try {
                    final String sql="{call validarKDR(?)}";
                    ConexionCall obj2=new ConexionCall();
                    CallableStatement cs=obj2.getCon().prepareCall(sql);
                    cs.setInt(1, kdr);
                    ResultSet regresa=cs.executeQuery();
                    validarExistenciaKdr=regresa.getInt(1);
                } catch (Exception e) {
                }
                if(validarExistenciaKdr!=0){
                
            }
                
            final String sql= "{call registroUsuarios(?,?,?,?,?,?)}";//Sintaxis
            ConexionCall objConexion=new ConexionCall();//Crea conexion
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
            out.print("si");
        }
        }
        }finally{
            out.close();
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
