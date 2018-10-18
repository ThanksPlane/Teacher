package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import src.DB.DBPool;

public final class deletepeople_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>delete Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link href=\"css/index.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"dist/summernote.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("               \n");
      out.write("                    <h1 class=\"page-header\">删除人员</h1>\n");
      out.write("                    <div class=\"panel panel-danger\">\n");
      out.write("                        aa\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                                <div>\n");
      out.write("                                <label for=\"spid\">教师编号：</label>\n");
      out.write("                                <input type=\"text\" id=\"spid\" class=\"form-control\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("  \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("   <button type=\"button\" id=\"delete\" class=\"btn btn-danger\" onclick=\"deletepeople();\">删除</button>\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("                     \n");
      out.write("  \n");
      out.write("        <script src=\"js/jquery-1.12.2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"dist/summernote.min.js\"></script>\n");
      out.write("        <script src=\"dist/lang/summernote-zh-CN.js\"></script>\n");
      out.write("        <script src=\"js/jmd5.js\"></script>\n");
      out.write("        <script src=\"js/plupload.full.min.js\"></script>\n");
      out.write("        <script src=\"js/upload/uploadimg.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function deletepeople(){\n");
      out.write("                 $.ajax({\n");
      out.write("                    url:\"deletee\",\n");
      out.write("                    data:{\"spid\":spid},\n");
      out.write("                    type:\"get\",\n");
      out.write("                    dataType:\"html\",\n");
      out.write("                    success:function(){\n");
      out.write("                        alert(\"delete is success!\");\n");
      out.write("                        location.href=\"Mmain.jsp\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            \n");
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
