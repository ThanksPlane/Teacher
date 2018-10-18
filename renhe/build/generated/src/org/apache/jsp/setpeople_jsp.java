package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setpeople_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("       \n");
      out.write("                    <h1 class=\"page-header\">人员设置</h1>\n");
      out.write("                    <div class=\"panel panel-danger\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <table class=\"table\"border=\"1\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>教师编号</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" style=\"width: 250px ;display: inline\" id=\"spid\">\n");
      out.write("                                        <button class=\"btn btn-primary\">检查编号</button>\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>姓名</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" style=\"width: 250px ;display: inline\" id=\"spname\">\n");
      out.write("\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>用户名</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" style=\"width: 250px ;display: inline\" id=\"spuname\">\n");
      out.write("                                        <button  class=\"btn btn-primary\">检查用户名</button>\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>密码</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" style=\"width: 250px ;display: inline\" id=\"sppw\">\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>确认密码</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" style=\"width: 250px ;display: inline\" id=\"sppwd\">\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>所属院系</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <select class=\"form-control\" id=\"spdp\">\n");
      out.write("                                            <option value=\"计算机科学与技术学院\" selected=\"selected\">计算机科学与技术学院</option>\n");
      out.write("                                            <option value=\"化学工程学院\">化学工程学院</option>\n");
      out.write("                                            <option value=\"经济与管理学院\">经济与管理学院</option>\n");
      out.write("                                            <option value=\"外语系\">外语系</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                  <th>所属调研室</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <select class=\"form-control\" id=\"spclass\">\n");
      out.write("                                            <option value=\"软件工程调研室\" selected=\"selected\">软件工程调研室</option>\n");
      out.write("                                            <option value=\"计算机科学与技术调研室\">计算机科学与技术调研室</option>\n");
      out.write("                                            <option value=\"网络工程调研室\">网络工程调研室</option>\n");
      out.write("                                            <option value=\"信息与计算科学调研室\">信息与计算科学调研室</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </th>\n");
      out.write("                                    \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>赋予特殊权限</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <input type=\"radio\" checked name=\"splevel\" id=\"splevel\" value=\"领导\">领导\n");
      out.write("                                        <input type=\"radio\" name=\"splevel\" id=\"splevel\" value=\"审核人员\">审核人员\n");
      out.write("                                        <input type=\"radio\" name=\"splevel\" id=\"splevel\" value=\"普通教师\">普通教师\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>                                \n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("  \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("           <button id=\"search\" onclick=\"add();\" class=\"btn btn-danger\" >添加</button>\n");
      out.write("                   <script src=\"js/jquery-1.12.2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>         \n");
      out.write("           <script>\n");
      out.write("            function add(){\n");
      out.write("                var spid=$(\"#spid\").val();\n");
      out.write("                var spname=$(\"#spname\").val();\n");
      out.write("                var spuname=$(\"#spuname\").val();\n");
      out.write("                var sppw=$(\"#sppw\").val();\n");
      out.write("                var sppwd=$(\"#sppwd\").val();\n");
      out.write("                var spdp=$(\"#spdp option:selected\").val();\n");
      out.write("                var spclass=$(\"#spclass option:selected\").val();\n");
      out.write("                var splevel=$('input[type=\"radio\"]:checked').val();\n");
      out.write("//                if(bookname.length===0){\n");
      out.write("//                    alert(\"bookname don't empty!\");\n");
      out.write("//                    $(\"#bookname\").focus();\n");
      out.write("//                    return false;\n");
      out.write("//                }\n");
      out.write("//                if(authorname.length===0){\n");
      out.write("//                    alert(\"author's name don't empty!\");\n");
      out.write("//                    $(\"#authorname\").focus();\n");
      out.write("//                    return false;\n");
      out.write("//                }\n");
      out.write("//                if(press.length===0){\n");
      out.write("//                    alert(\"press don't empty!\");\n");
      out.write("//                    $(\"#press\").focus();\n");
      out.write("//                    return false;\n");
      out.write("//                }\n");
      out.write("//                if(ctype===1000){\n");
      out.write("//                    alert(\"请选择类别：\");\n");
      out.write("//                    $(\"#ctype\").focus();\n");
      out.write("//                    return false;\n");
      out.write("//                }\n");
      out.write("                 $.ajax({\n");
      out.write("                    url:\"adddbook\",\n");
      out.write("                    data:{\"spid\":spid,\"spname\":spname,\"spuname\":spuname,\"sppw\":sppw,\"sppwd\":sppwd,\"spdp\":spdp,\"spclass\":spclass,\"splevel\":splevel},\n");
      out.write("                    type:\"get\",\n");
      out.write("                    dataType:\"html\",\n");
      out.write("                    success:function(){\n");
      out.write("                        alert(\"add is success!\");\n");
      out.write("                        location.href=\"Mmain.jsp\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            \n");
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
