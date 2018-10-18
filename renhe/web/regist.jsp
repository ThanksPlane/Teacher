<%-- 
    Document   : login
    Created on : 2016-1-28, 5:53:39
    Author     : liu
--%>


<%@page import="java.sql.*"%>
<%@page import="src.DB.DBPool"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>regist Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="js/html5shiv.min.js"></script>
          <script src="js/respond.min.js"></script>
        <![endif]-->
        <link href="css/index.css" rel="stylesheet">
        <link href="dist/summernote.css" rel="stylesheet">
    </head>
    <body style=" background: gray; height: 100%;">
        <div class="jumbotron" style=" background: gray;" >
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="titlecontent" style="color:orange;">教师工作量考核系统</div>
                </div>
                <div class="col-md-2"></div>
            </div>
            <div class="row" style="margin-top: 10%;">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading"><p class="login-box-msg" >新用户注册</p></div>
                        <div class="panel-body">

                            <div class="form-group">
                                <label for="loginname">注册名:<i class=" fa fa-asterisk" style=" color: #c9302c;"></i></label>
                                <input type="text" id="loginname" class="form-control" placeholder="LoginName">
                            </div>
                            <div class="form-group">
                                <label for="PWD">密码:<i class=" fa fa-asterisk" style=" color: #c9302c;"></i></label>
                                <input type="text" id="PWD" class="form-control" placeholder="Password">
                            </div>
                            <div class="row">
                                <div class="col-xs-4">
                                    <button type="button" id="reg" class="btn btn-primary btn-block btn-flat" onclick="regkk();">Register</button>
                                </div><!-- /.col -->
                            </div>

                        </div>
                    </div>
                </div>
                <div class="col-md-4"></div>
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
            function regkk(){
                var loginname=document.getElementById("loginname").value;
                var pwd=document.getElementById("PWD").value;
     
                $.ajax({
                    url:"regist",
                    data:{"loginname":loginname,"pwd":pwd},
                    type:"get",
                    dataType:"html",
                    success:function(){
                        alert("注册成功!");
                        location.href="login.jsp";
                    }
                });
            }
        </script>
    </body>
</html>

