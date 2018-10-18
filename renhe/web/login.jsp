 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>教师工作量考核系统</title>
        <link href="css/css.css" rel="stylesheet">
    </head>
    <body>
 <h1>教师工作量考核系统</h1>
        <div class="b">
            <div class="denglu">    
                <div class="login-box-msg">
                用户名 <input type="text" id="userid" >
                <br>
                <br>
                密     码 <input type="text" id="userPWD">
                </div>
                <div class="butt">
                <button class="btn" onclick="login();">登录</button> 
                <button class="btn" onclick="regist();">注册</button>
                </div>
           </div>
          
        </div>
        <p class="banquan">版权所有ThanksPlane 2018@</p>

        <script src="js/jquery-1.12.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="dist/summernote.min.js"></script>
        <script src="dist/lang/summernote-zh-CN.js"></script>
        <script src="js/jmd5.js"></script>
        <script src="js/plupload.full.min.js"></script>
        <script src="js/upload/uploadimg.js"></script>
        <script>
            function login() {
                var name = document.getElementById("userid").value;                
                var pwd = document.getElementById("userPWD").value;
                window.location.href="login?para1="+name+"&para2="+pwd;
            }//管理者的登陆
             function regist() {
              
                window.location.href="regist.jsp";
            }//管理者的登陆
        </script> 
    </body>
</html>
