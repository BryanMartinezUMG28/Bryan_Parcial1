/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Clases.NewClass;
import Clases.LibroController;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author bryan
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    NewClass newclass;
    LibroController registroAlumno;
    NewClass[] alumnosRegistrados;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try ( PrintWriter out = response.getWriter()) {
           
           newclass=new NewClass(
                request.getParameter("cod"),
                request.getParameter("primero"),
                request.getParameter("segundo"),
                request.getParameter("editorial"),
                request.getParameter("año")
            );               
            
            if(registroAlumno==null){
                 registroAlumno=new LibroController();
            }
             //Array, donde almacenaremos
            registroAlumno.guardarAlumno(newclass);
             alumnosRegistrados= registroAlumno.getAlumnos();
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>"); 
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"");
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
"");
            out.println("<script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>");
            out.println("</head>");
            out.println("<body background='https://i.pinimg.com/originals/ea/61/23/ea6123f403ebc08658ee18d4908cd573.png'>");
            out.println("<div class='container'>");
            out.println("<div class='p-3 mb-2 bg-dark text-white text-center'>");
            out.println("<br><h3>Usuarios ingresados - Parcial I - Programacion II</h3><br>");  
            out.println("<h4>¿Quieres ingresar un nuevo libro?</h4>");
            out.println("<h4>¡Click en el boton de Registrar nuevo!</h4>");
            out.println("<div class='center'> <a href='index.html' text-align:'center' class=\"btn btn-success btn-warning  ml-auto\">Registrar Nuevo</a></div><br>");
            out.println("</div>");
            out.println("<form name='nombreForm'>");
            out.println("<table class=\"table table-dark table-bordered table-striped\">");   
            out.println("<thead><tr> <th scope=\"col\">CODIGO</th> <th scope=\"col\">LIBRO</th>\n" +
                                "<th scope=\"col\">PASTA</th> <th scope=\"col\">EDITORIAL</th>\n" +
                     "<th scope=\"col\">AÑO PUBLICADO</th>\n</thead>");  
            out.println("<tbody>");
            for (int i = 0; i < alumnosRegistrados.length; i++){
                    if(!alumnosRegistrados[i].getCod().isEmpty()){
                       out.println("<tr><td>" + alumnosRegistrados[i].getCod()+ "</td>");
                       out.println("<td>" + alumnosRegistrados[i].getPrimero() + "</td>");
                       out.println("<td>" + alumnosRegistrados[i].getSegundo()+ "</td>");
                       out.println("<td>" + alumnosRegistrados[i].getEditorial()+ "</td>");
                       out.println("<td>" + alumnosRegistrados[i].getAño()+ "</td>");
                       out.println("</tr>");
                    }
                }
            out.println("</tbody></table>");
            out.println("/form");
            
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
        processRequest(request, response);
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
