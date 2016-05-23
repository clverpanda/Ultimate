<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0037)http://v3.bootcss.com/examples/blog/# -->
<html lang="zh-CN"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Main</title>
    <style>
     .contain{
      margin-left: 15%;
      margin-right: 15%;
      margin-top: 3%;
     }
    </style>

    <!-- Bootstrap core CSS -->
    <link href="Css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="Css/blog.css" rel="stylesheet">
   
    <link rel="stylesheet" href="semantic-ui/semantic/dist/semantic.min.css">

  
  </head>

  <body>
    <nav class="navbar navbar-fixed-top">

    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item" href="http://v3.bootcss.com/examples/blog/#">主页</a>
          <a class="blog-nav-item active" href="#">New features</a>
          <a class="blog-nav-item" href="#">Press</a>
          <a class="blog-nav-item" href="#">New hires</a>
          <a class="blog-nav-item" href="#">About</a>
        </nav>
      </div>
    </div>
    </nav>
    </br>
    </br>
    <div class="ui secondary menu">
      <a class="item">所有分类</a>
      <a class="item">Windows</a>
      <a class="item active">Android</a>
      <a class="item">Ios</a>
      <a class="item">资讯</a>
      <a class="ui dropdown item">
        其他
        <i class="dropdown icon"></i>
        <div class="menu">
          <div class="item">Label1</div>
          <div class="item">Label2</div>
          <div class="item">Label3</div>
        </div>
      </a>
      <div class="right secondary menu">
        <div class="item">
          <div class="ui icon input">
            <input type="text" placeholder="Search...">
            <i class="search link icon"></i>
          </div>
        </div>
        <a class="ui dropdown item">
          Username
          <i class="dropdown icon"></i>
          <div class="menu">
            <div class="item">个人主页</div>
            <div class="item">信息修改</div>
            <div class="item">登出</div>
          </div>
        </a>
        <a class="item">登录</a>
      </div>
    </div>
    <div class="ui divider"></div>
    <div class="contain">
    <div class="ui three cards">
      <div class="ui card">
        <div class="content">
          <a class="ui blue right ribbon label">Windows</a> 
          <div class="header">可爱的小狗</div>
            <div class="meta">
              <span class="right floated time">2 天前</span>
              <div class="author">Matt </div>
            </div>
          <div class="description">
            <p></p>
          </div>
        </div>
        <div class="image">
            <image src="dummy.png"/>
        </div>
        <div class="extra content">
          <div class="ui label">Coments<div class="detail">214</div>
          </div>
        </div>
      </div>
    </div>
    </div>





      <p>
        <a href="#">Back to top</a>
      </p>



    <script src="semantic-ui/javascript/jquery-2.2.3.min.js"></script>
    <script src="semantic-ui/semantic/dist/semantic.min.js"></script>
    <script>  $('.ui.dropdown').dropdown();  </script>

</body>
</html>