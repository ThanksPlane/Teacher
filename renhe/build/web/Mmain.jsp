
<%@page import="java.sql.*"%>
<%@page import="src.DB.DBPool"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
    String uname;
    Integer uid;
    session=request.getSession();
    uid=(Integer)session.getAttribute("bid");
    uname=(String)session.getAttribute("Mname");
     Connection con=DBPool.getInstance().getConnection();
    Statement stmt=con.createStatement();
    
    
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
     
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">院系【计算机科学与技术学院】调研室【软件工程调研室】</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="login.jsp">安全退出</a></li>
                    </ul>                    
                </div>
            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidebar">
                    <ul class="nav nav-sidebar">
                        <li class="active"><a href="#">高级设置<span class="sr-only">(current)</span></a></li>
                        <li><a href="#" onclick="setpeople();">设置人员</a></li>
                        <li><a href="#" onclick="rygl();">人员管理</a></li>
                        <li><a href="#" onclick="tianbao();">设置课程类别</a></li>
                        <li><a href="#" onclick="tianbao();">管理课程类别</a></li>
                        <li><a href="#" onclick="tianbao();">设置科研成果类别</a></li>
                        <li><a href="#" onclick="tianbao();">管理科研成果类别</a></li>
                        <li><a href="#" onclick="tianbao();">设置其他成果类别</a></li>
                        <li><a href="#" onclick="tianbao();">管理其他成果类别</a></li>
                        <li><a href="#" onclick="tianbao();">设置个人工作类型</a></li>
                        <li><a href="#" onclick="tianbao();">管理个人工作类型</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li class="active"><a href="#">个人设置<span class="sr-only">(current)</span></a></li>
                        <li><a href="#" onclick="bjwh();">个人信息修改</a></li>
                        <li><a href="#" onclick="xqwh();">个人密码修改</a></li>

                    </ul>
                     <ul class="nav nav-sidebar">
                        <li class="active"><a href="#">教学工作<span class="sr-only">(current)</span></a></li>
                        <li><a href="#">添加教学工作</a></li>
                        <li><a href="#">管理教学工作</a></li>
                    </ul>
                   <ul class="nav nav-sidebar">
                        <li class="active"><a href="#">科研工作<span class="sr-only">(current)</span></a></li>
                        <li><a href="#">添加科研工作</a></li>
                        <li><a href="#">管理科研工作</a></li>
                    </ul>
                </div>

                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" id="maincontent">
                   <h1 class="page-header">人员设置</h1>
                    <div class="panel panel-danger">
                        <div class="panel-body">
                            <table class="table"border="1">
                                <tr>
                                    <th>教师编号</th>
                                    <th>
                                        <input type="text" class="form-control" style="width: 250px ;display: inline" id="spid">
                                        <button class="btn btn-primary">检查编号</button>
                                    </th>
                                </tr>
                                <tr>
                                    <th>姓名</th>
                                    <th>
                                        <input type="text" class="form-control" style="width: 250px ;display: inline" id="spname">

                                    </th>
                                </tr>
                                <tr>
                                    <th>用户名</th>
                                    <th>
                                        <input type="text" class="form-control" style="width: 250px ;display: inline" id="spuname">
                                        <button  class="btn btn-primary">检查用户名</button>
                                    </th>
                                </tr>
                                <tr>
                                    <th>密码</th>
                                    <th>
                                        <input type="password" class="form-control" style="width: 250px ;display: inline" id="sppw">
                                    </th>
                                </tr>
                                <tr>
                                    <th>确认密码</th>
                                    <th>
                                        <input type="password" class="form-control" style="width: 250px ;display: inline" id="sppwd">
                                    </th>
                                </tr>
                                <tr>
                                    <th>所属院系</th>
                                    <th>
                                        <select class="form-control" id="spdp">
                                            <option value="计算机科学与技术学院" selected="selected">计算机科学与技术学院</option>
                                            <option value="化学工程学院">化学工程学院</option>
                                            <option value="经济与管理学院">经济与管理学院</option>
                                            <option value="外语系">外语系</option>
                                        </select>
                                    </th>
                                </tr>
                                <tr>
                                  <th>所属调研室</th>
                                    <th>
                                        <select class="form-control" id="spclass">
                                            <option value="软件工程调研室" selected="selected">软件工程调研室</option>
                                            <option value="计算机科学与技术调研室">计算机科学与技术调研室</option>
                                            <option value="网络工程调研室">网络工程调研室</option>
                                            <option value="信息与计算科学调研室">信息与计算科学调研室</option>
                                        </select>
                                    </th>
                                    
                                </tr>
                                <tr>
                                    <th>赋予特殊权限</th>
                                    <th>
                                        <input type="radio" checked name="splevel" id="splevel" value="领导">领导
                                        <input type="radio" name="splevel" id="splevel" value="审核人员">审核人员
                                        <input type="radio" name="splevel" id="splevel" value="普通教师">普通教师
                                    </th>
                                </tr>                                
                            </table>
                        </div>
  
                           
                            
                        </div>
           <button id="search" onclick="add();" class="btn btn-danger" >添加</button>
                    </div>
           
             
                </div>
            </div>

        <script src="js/jquery-1.12.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script>
             function add(){
                var spid=$("#spid").val();
                var spname=$("#spname").val();
                var spuname=$("#spuname").val();
                var sppw=$("#sppw").val();
                var sppwd=$("#sppwd").val();
                var spdp=$("#spdp option:selected").val();
                var spclass=$("#spclass option:selected").val();
                var splevel=$('input[type="radio"]:checked').val();
                 $.ajax({
                    url:"addd",
                    data:{"spid":spid,"spname":spname,"spuname":spuname,"sppw":sppw,"sppwd":sppwd,"spdp":spdp,"spclass":spclass,"splevel":splevel},
                    type:"get",
                    dataType:"html",
                    success:function(){
                        alert("添加成功!");
                        location.href="Mmain.jsp";
                    }
                });
            }
            
            
              function setpeople(){
                $.ajax({
                   url:"setpeople.jsp",
                   type:"get",
                   dataType:"html",
                   success:function(htmlstr){
                       $("#maincontent").empty();
                       $("#maincontent").append(htmlstr);
                   }
                });
            };
              function rygl(){
                $.ajax({
                   url:"rygl2.jsp",
                   type:"get",
                   dataType:"html",
                   success:function(htmlstr){
                       $("#maincontent").empty();
                       $("#maincontent").append(htmlstr);
                   }
                });
            };
//            function deletepeople(){
//                $.ajax({
//                   url:"deletepeople.jsp",
//                   type:"get",
//                   dataType:"html",
//                   success:function(htmlstr){
//                       $("#maincontent").empty();
//                       $("#maincontent").append(htmlstr);
//                   }
//                });
//            };
         
            function selectbooks(){
                var bookname=document.getElementById("bookname").value;
                window.location.href="selectbook?para1="+bookname;
                                
            }
        </script>
        
    </body>
</html>
