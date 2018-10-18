/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import src.DB.DBPool;

/**
 *
 * @author 喝茶的Lenovo
 */
public class select extends HttpServlet{
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    
        try {
            HttpSession session=request.getSession();
            response.setContentType("text/html;charset=UTF-8");
            Connection con=DBPool.getInstance().getConnection();
            Statement stmt=con.createStatement();
            String sql="select * from setpeople";
            ResultSet pst=stmt.executeQuery(sql);
            if(pst.next()){
                session.setAttribute("spid",pst.getInt(1));
                session.setAttribute("spname", pst.getString(2));
                session.setAttribute("spuname",pst.getString(3));
                session.setAttribute("sppw", pst.getString(4));
                session.setAttribute("sppwd", pst.getString(5));
                session.setAttribute("spdp", pst.getString(6));
                session.setAttribute("spclass", pst.getString(7));
                session.setAttribute("splevel", pst.getString(8));
            
                stmt.close();
                con.close();
                request.getRequestDispatcher("rygl.jsp").forward(request, response);
            }else{
                stmt.close();
                con.close();
                request.getRequestDispatcher("Mmain.jsp").forward(request, response);
            }
            
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(select.class.getName()).log(Level.SEVERE, null, ex);
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
