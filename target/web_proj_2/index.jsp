<%@ page language="java" contentType="text/html; charset=UTF-8"
 
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 4 MVC - HelloWorld Index Page</title>
<script type="text/javascript">  
    function ajaxTest(){  
        $.ajax({  
        data: {
            'name' :$("#name").val()
           },   
        type:"POST",  
        dataType: 'json',  
        url:"hello",  
        error:function(data){  
            alert("出错了！！:"+data.msg);  
        },  
        success:function(data){  
            alert("success:"+data.msg);  
            $("#result").html(data.msg) ;  
        }  
        });  
    }  
</script>  
</head>
<body>
 
	<center>
		<h2>Hello World</h2>
		<h3>
<!-- 			<a href="hello?name=Eric">Click Here</a> -->
			<input type="text" name="name" id="name"/> 
			<input type="button" onclick="ajaxTest()" value="click here"/>
		</h3>
	</center>
</body>
</html>