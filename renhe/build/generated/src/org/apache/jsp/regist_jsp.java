package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import src.DB.DBPool;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>regist Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link href=\"css/index.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"dist/summernote.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background: gray; height: 100%;\">\n");
      out.write("        <div class=\"jumbotron\" style=\" background: gray;\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"titlecontent\" style=\"color:orange;\">教师工作量考核系统</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"margin-top: 10%;\">\n");
      out.write("                <div class=\"col-md-4\"></div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\"><p class=\"login-box-msg\" >新用户注册</p></div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"loginname\">注册名:<i class=\" fa fa-asterisk\" style=\" color: #c9302c;\"></i></label>\n");
      out.write("                                <input type=\"text\" id=\"loginname\" class=\"form-control\" placeholder=\"LoginName\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"PWD\">密码:<i class=\" fa fa-asterisk\" style=\" color: #c9302c;\"></i></label>\n");
      out.write("                                <input type=\"text\" id=\"PWD\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-4\">\n");
      out.write("                                    <button type=\"button\" id=\"reg\" class=\"btn btn-primary btn-block btn-flat\" onclick=\"regkk();\">Register</button>\n");
      out.write("                                </div><!-- /.col -->\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-1.12.2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"dist/summernote.min.js\"></script>\n");
      out.write("        <script src=\"dist/lang/summernote-zh-CN.js\"></script>\n");
      out.write("        <script src=\"js/jmd5.js\"></script>\n");
      out.write("        <script src=\"js/plupload.full.min.js\"></script>\n");
      out.write("        <script src=\"js/upload/uploadimg.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function regkk(){\n");
      out.write("                var loginname=document.getElementById(\"loginname\").value;\n");
      out.write("                var pwd=document.getElementById(\"PWD\").value;\n");
      out.write("     \n");
      out.write("                $.ajax({\n");
      out.write("                    url:\"regist\",\n");
      out.write("                    data:{\"loginname\":loginname,\"pwd\":pwd},\n");
      out.write("                    type:\"get\",\n");
      out.write("                    dataType:\"html\",\n");
      out.write("                    success:function(){\n");
      out.write("                        alert(\"regist is success!\");\n");
      out.write("                        location.href=\"login.jsp\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
