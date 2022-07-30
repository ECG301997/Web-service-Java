/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */

import com.definitiva.Definitiva_Service;    
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Karen Marín Angel
 * @author Victor Santiago Morales
 * @author Eduardo Cadavid García
  
 */
public class Definitiva extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WebServiceNotas/Definitiva.wsdl")
    private Definitiva_Service service;

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
        try (PrintWriter out = response.getWriter()) {
            double nota1,nota2,nota3;
            nota1 =Double.parseDouble(request.getParameter("nota1"));
            nota2 =Double.parseDouble(request.getParameter("nota2"));
            nota3 =Double.parseDouble(request.getParameter("nota3"));
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<title>Nota Definitiva</title>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<link rel='stylesheet' href='estilos.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<section class='resultado'>");
            out.println("<div id='estado'>");
            out.println("<h1>EL resultado de las calificaciones fueron"+getNotas(nota1, nota2, nota3) +"</h1>");
            out.println("</div>");
            out.println("</section>");
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
    /**
     * 
     * @param nota1 primera nota ingresado en el html
     * @param nota2 segunda nota ingresado en el html
     * @param nota3 tercera nota ingresado en el html
     * @return Servlet
     * Esta funcion llama al get notas del servicio web para poder realizar la respuesta al cliente luego de la interacción
     */
    private String getNotas(double nota1, double nota2, double nota3) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.definitiva.Definitiva port = service.getDefinitivaPort(); 
        return port.getNotas(nota1, nota2, nota3);
    }

}
