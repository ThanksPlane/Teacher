
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
//                if(bookname.length===0){
//                    alert("bookname don't empty!");
//                    $("#bookname").focus();
//                    return false;
//                }
//                if(authorname.length===0){
//                    alert("author's name don't empty!");
//                    $("#authorname").focus();
//                    return false;
//                }
//                if(press.length===0){
//                    alert("press don't empty!");
//                    $("#press").focus();
//                    return false;
//                }
//                if(ctype===1000){
//                    alert("请选择类别：");
//                    $("#ctype").focus();
//                    return false;
//                }
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
            
            
        </script>
    </body>
</html>
