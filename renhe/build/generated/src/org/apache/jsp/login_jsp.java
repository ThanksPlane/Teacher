package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>教师工作量考核系统</title>\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <h1>教师工作量考核系统</h1>\n");
      out.write("        <div class=\"b\">\n");
      out.write("            <div class=\"denglu\">    \n");
      out.write("                <div class=\"login-box-msg\">\n");
      out.write("                用户名 <input type=\"text\" id=\"userid\" >\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                密     码 <input type=\"text\" id=\"userPWD\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"butt\">\n");
      out.write("                <button class=\"btn\" onclick=\"login();\">登录</button> \n");
      out.write("                <button class=\"btn\" onclick=\"regist();\">注册</button>\n");
      out.write("                </div>\n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <p class=\"banquan\">版权所有ThanksPlane 2018@</p>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.12.2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"dist/summernote.min.js\"></script>\n");
      out.write("        <script src=\"dist/lang/summernote-zh-CN.js\"></script>\n");
      out.write("        <script src=\"js/jmd5.js\"></script>\n");
      out.write("        <script src=\"js/plupload.full.min.js\"></script>\n");
      out.write("        <script src=\"js/upload/uploadimg.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function login() {\n");
      out.write("                var name = document.getElementById(\"userid\").value;                \n");
      out.write("                var pwd = document.getElementById(\"userPWD\").value;\n");
      out.write("                window.location.href=\"login?para1=\"+name+\"&para2=\"+pwd;\n");
      out.write("            }//管理者的登陆\n");
      out.write("             function regist() {\n");
      out.write("              \n");
      out.write("                window.location.href=\"regist.jsp\";\n");
      out.write("            }//管理者的登陆\n");
      out.write("        </script> \n");
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
