package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import src.DB.DBPool;

public final class rygl2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    
    
    
    Connection con=DBPool.getInstance().getConnection();
//  教室查询
    Statement stmt=con.createStatement();
    ResultSet pst=stmt.executeQuery("select * from setpeople");
//    if(pst.next()){
//                session.setAttribute("spid",pst.getInt(1));
//                session.setAttribute("spname", pst.getString(2));
//                session.setAttribute("spuname",pst.getString(3));
//                session.setAttribute("sppw", pst.getString(4));
//                session.setAttribute("sppwd", pst.getString(5));
//                session.setAttribute("spdp", pst.getString(6));
//                session.setAttribute("spclass", pst.getString(7));
//                session.setAttribute("splevel", pst.getString(8));
//            
//                stmt.close();
//                con.close();}
//    String sspname,sspuname,ssppw,ssppwd,sspdp,ssspclass,ssplevel;
//    Integer sspid;
//    session=request.getSession();
//    sspid=(Integer)session.getAttribute("spid");
//    sspname=(String)session.getAttribute("spname");
//    sspuname=(String)session.getAttribute("spuname");
//    ssppw=(String)session.getAttribute("sppw");
//    ssppwd=(String)session.getAttribute("sppwd");
//    sspdp=(String)session.getAttribute("spdp");
//    ssspclass=(String)session.getAttribute("spclass");
//    ssplevel=(String)session.getAttribute("splevel");
//    
    
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("                <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>教师工作量考核系统</title>\n");
      out.write("                <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link href=\"css/people.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                     \n");
      out.write("                    <h1 class=\"page-header\">人员管理</h1>\n");
      out.write("                    <div class=\"panel panel-danger\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <table value=\"1000\" class=\"table\">\n");
      out.write("                                <tr>\n");
      out.write("           <td>教师编号</td>\n");
      out.write("           <td>姓名</td>\n");
      out.write("           <td>用户名</td>\n");
      out.write("           <td>密码</td>\n");
      out.write("           <td>确认密码</td>\n");
      out.write("           <td>所属院系</td>\n");
      out.write("           <td>所属调研室</td>\n");
      out.write("           <td>赋予特殊权限</td>\n");
      out.write("       </tr>\n");
      out.write("   ");

       while (pst .next()) {
   
      out.write("\n");
      out.write("   <tr align=\"left\">\n");
      out.write("       <td>");
      out.print( pst.getInt(1));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( pst .getString(2));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( pst .getString(3));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( pst .getString(4));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( pst .getString(5));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( pst .getString(6));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( pst .getString(7));
      out.write("</td>\n");
      out.write("       <td>");
      out.print( pst .getString(8));
      out.write("</td>\n");
      out.write("   </tr>\n");
      out.write("   ");
    }
    
      out.write("</table>                                   \n");
      out.write("                      \n");
      out.write("                             <br>\n");
      out.write("                            <div>         \n");
      out.write("                                 <h2 class=\"page-header\">删除人员</h2>\n");
      out.write("                                <label for=\"spid\">教师编号：</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" style=\"width: 250px ;display: inline\" id=\"spid\">\n");
      out.write("                                    <button id=\"delete\" class=\"btn btn-danger\" onclick=\"deletepeople();\">删除</button>\n");
      out.write("                            </div>\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                        </div>                        \n");
      out.write("                             \n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("       <script src=\"js/jquery-1.12.2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"dist/summernote.min.js\"></script>\n");
      out.write("        <script src=\"dist/lang/summernote-zh-CN.js\"></script>\n");
      out.write("        <script src=\"js/jmd5.js\"></script>\n");
      out.write("        <script src=\"js/plupload.full.min.js\"></script>\n");
      out.write("        <script src=\"js/upload/uploadimg.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function deletepeople(){ \n");
      out.write("                var spid=document.getElementById(\"spid\").value;\n");
      out.write("                if(spid.length===0){\n");
      out.write("                    alert(\"教师编号不能为空!\");\n");
      out.write("                    $(\"#spid\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                 $.ajax({\n");
      out.write("                    url:\"deletee\",\n");
      out.write("                    data:{\"spid\":spid},\n");
      out.write("                    type:\"get\",\n");
      out.write("                    dataType:\"html\",\n");
      out.write("                    success:function(){\n");
      out.write("                        alert(\"删除成功!\");\n");
      out.write("                        location.href=\"Mmain.jsp\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }  \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
