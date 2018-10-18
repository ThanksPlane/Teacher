package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import src.DB.DBPool;

public final class Mmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    
    String uname;
    Integer uid;
    session=request.getSession();
    uid=(Integer)session.getAttribute("bid");
    uname=(String)session.getAttribute("Mname");
     Connection con=DBPool.getInstance().getConnection();
    Statement stmt=con.createStatement();
    
    

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>教师工作量考核系统</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
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
      out.write("     \n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">院系【计算机科学与技术学院】调研室【软件工程调研室】</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"login.jsp\">安全退出</a></li>\n");
      out.write("                    </ul>                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">高级设置<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"setpeople();\">设置人员</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"rygl();\">人员管理</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">设置课程类别</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">管理课程类别</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">设置科研成果类别</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">管理科研成果类别</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">设置其他成果类别</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">管理其他成果类别</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">设置个人工作类型</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"tianbao();\">管理个人工作类型</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">个人设置<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"bjwh();\">个人信息修改</a></li>\n");
      out.write("                        <li><a href=\"#\" onclick=\"xqwh();\">个人密码修改</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                     <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">教学工作<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"#\">添加教学工作</a></li>\n");
      out.write("                        <li><a href=\"#\">管理教学工作</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                   <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">科研工作<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"#\">添加科研工作</a></li>\n");
      out.write("                        <li><a href=\"#\">管理科研工作</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\" id=\"maincontent\">\n");
      out.write("                   <h1 class=\"page-header\">人员设置</h1>\n");
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
      out.write("                    </div>\n");
      out.write("           \n");
      out.write("             \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.12.2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("             function add(){\n");
      out.write("                var spid=$(\"#spid\").val();\n");
      out.write("                var spname=$(\"#spname\").val();\n");
      out.write("                var spuname=$(\"#spuname\").val();\n");
      out.write("                var sppw=$(\"#sppw\").val();\n");
      out.write("                var sppwd=$(\"#sppwd\").val();\n");
      out.write("                var spdp=$(\"#spdp option:selected\").val();\n");
      out.write("                var spclass=$(\"#spclass option:selected\").val();\n");
      out.write("                var splevel=$('input[type=\"radio\"]:checked').val();\n");
      out.write("                 $.ajax({\n");
      out.write("                    url:\"addd\",\n");
      out.write("                    data:{\"spid\":spid,\"spname\":spname,\"spuname\":spuname,\"sppw\":sppw,\"sppwd\":sppwd,\"spdp\":spdp,\"spclass\":spclass,\"splevel\":splevel},\n");
      out.write("                    type:\"get\",\n");
      out.write("                    dataType:\"html\",\n");
      out.write("                    success:function(){\n");
      out.write("                        alert(\"添加成功!\");\n");
      out.write("                        location.href=\"Mmain.jsp\";\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("              function setpeople(){\n");
      out.write("                $.ajax({\n");
      out.write("                   url:\"setpeople.jsp\",\n");
      out.write("                   type:\"get\",\n");
      out.write("                   dataType:\"html\",\n");
      out.write("                   success:function(htmlstr){\n");
      out.write("                       $(\"#maincontent\").empty();\n");
      out.write("                       $(\"#maincontent\").append(htmlstr);\n");
      out.write("                   }\n");
      out.write("                });\n");
      out.write("            };\n");
      out.write("              function rygl(){\n");
      out.write("                $.ajax({\n");
      out.write("                   url:\"rygl2.jsp\",\n");
      out.write("                   type:\"get\",\n");
      out.write("                   dataType:\"html\",\n");
      out.write("                   success:function(htmlstr){\n");
      out.write("                       $(\"#maincontent\").empty();\n");
      out.write("                       $(\"#maincontent\").append(htmlstr);\n");
      out.write("                   }\n");
      out.write("                });\n");
      out.write("            };\n");
      out.write("//            function deletepeople(){\n");
      out.write("//                $.ajax({\n");
      out.write("//                   url:\"deletepeople.jsp\",\n");
      out.write("//                   type:\"get\",\n");
      out.write("//                   dataType:\"html\",\n");
      out.write("//                   success:function(htmlstr){\n");
      out.write("//                       $(\"#maincontent\").empty();\n");
      out.write("//                       $(\"#maincontent\").append(htmlstr);\n");
      out.write("//                   }\n");
      out.write("//                });\n");
      out.write("//            };\n");
      out.write("         \n");
      out.write("            function selectbooks(){\n");
      out.write("                var bookname=document.getElementById(\"bookname\").value;\n");
      out.write("                window.location.href=\"selectbook?para1=\"+bookname;\n");
      out.write("                                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
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
