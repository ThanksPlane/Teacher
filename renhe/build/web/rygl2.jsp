<%-- 
    Document   : rygl
    Created on : 2018-10-9, 20:06:55
    Author     : 喝茶的Lenovo
--%>
<%@page import="java.sql.*"%>
<%@page import="src.DB.DBPool"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    
    
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
    %>
<html>
    <head>
                <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>教师工作量考核系统</title>
                <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/dashboard.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="js/html5shiv.min.js"></script>
          <script src="js/respond.min.js"></script>
        <![endif]-->
        <link href="css/people.css" rel="stylesheet">
    </head>
    <body>
                     
                    <h1 class="page-header">人员管理</h1>
                    <div class="panel panel-danger">
                        <div class="panel-body">
                            

                            <table value="1000" class="table">
                                <tr>
           <td>教师编号</td>
           <td>姓名</td>
           <td>用户名</td>
           <td>密码</td>
           <td>确认密码</td>
           <td>所属院系</td>
           <td>所属调研室</td>
           <td>赋予特殊权限</td>
       </tr>
   <%
       while (pst .next()) {
   %>
   <tr align="left">
       <td><%= pst.getInt(1)%></td>
       <td><%= pst .getString(2)%></td>
       <td><%= pst .getString(3)%></td>
       <td><%= pst .getString(4)%></td>
       <td><%= pst .getString(5)%></td>
       <td><%= pst .getString(6)%></td>
       <td><%= pst .getString(7)%></td>
       <td><%= pst .getString(8)%></td>
   </tr>
   <%    }
    %></table>                                   
                      
                             <br>
                            <div>         
                                 <h2 class="page-header">删除人员</h2>
                                <label for="spid">教师编号：</label>
                                    <input type="text" class="form-control" style="width: 250px ;display: inline" id="spid">
                                    <button id="delete" class="btn btn-danger" onclick="deletepeople();">删除</button>
                            </div>
                               

                        </div>                        
                             
                        </div>
                    
       <script src="js/jquery-1.12.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="dist/summernote.min.js"></script>
        <script src="dist/lang/summernote-zh-CN.js"></script>
        <script src="js/jmd5.js"></script>
        <script src="js/plupload.full.min.js"></script>
        <script src="js/upload/uploadimg.js"></script>
        <script>
            function deletepeople(){ 
                var spid=document.getElementById("spid").value;
                if(spid.length===0){
                    alert("教师编号不能为空!");
                    $("#spid").focus();
                    return false;
                }
                 $.ajax({
                    url:"deletee",
                    data:{"spid":spid},
                    type:"get",
                    dataType:"html",
                    success:function(){
                        alert("删除成功!");
                        location.href="Mmain.jsp";
                    }
                });
            }  
        </script>
    </body>
</html>
