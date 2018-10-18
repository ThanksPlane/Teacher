/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.DB.DBPool;

/**
 *
 * @author 喝茶的Lenovo
 */
public class addd extends HttpServlet{
     /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
        try {
           
            response.setContentType("text/html;charset=UTF-8");
            String spid=request.getParameter("spid");
            String spname=request.getParameter("spname");
            String spuname=request.getParameter("spuname");
            String sppw=request.getParameter("sppw");
            String sppwd=request.getParameter("sppwd");
            String spdp=request.getParameter("spdp");
            String spclass=request.getParameter("spclass");
            String splevel=request.getParameter("splevel");
            Connection con=DBPool.getInstance().getConnection();
            String sql="insert into setpeople(spid,spname,spuname,sppw,sppwd,spdp,spclass,splevel) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, spid);
            pst.setString(2,spname);
            pst.setString(3, spuname);
            pst.setString(4, sppw);
            pst.setString(5, sppwd);
            pst.setString(6, spdp);
            pst.setString(7, spclass);
            pst.setString(8, splevel);
            pst.execute();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(addd.class.getName()).log(Level.SEVERE, null, ex);
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
