<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0037)http://v3.bootcss.com/examples/blog/# -->
<html lang="zh-CN"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Article</title>


    <!-- Bootstrap core CSS -->
    <link href="Css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="Css/main.css" rel="stylesheet">
    <link href="Css/article.css" rel="stylesheet">

   
    <link rel="stylesheet" href="semantic-ui/semantic/dist/semantic.min.css">

  
  </head>

  <body>
  <s:set name="user" value="#session['user']"/>
    <nav class="navbar navbar-fixed-top">

    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item active" href="index.action">主页</a>
          <a class="blog-nav-item" href="publishArticle.jsp">发布</a>
          <a class="blog-nav-item" href="#">资讯</a>
          <a class="blog-nav-item" href="personal.action">个人</a>
          <a class="blog-nav-item" href="#">关于</a>
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

          <div class="menu">
              <%
                  if (session.getAttribute("user") == null)
                  {
              %>
              <a class="item" href="sign.jsp">登录</a>
              <a class="item" href="sign.jsp">注册</a>
              <%
              }
              else
              {
              %>
              <a class="ui dropdown item">
                  <s:property value="#user.username"/>
                  <i class="dropdown icon"></i>
                  <div class="menu">
                      <div class="item">个人主页</div>
                      <div class="item">信息修改</div>
                      <div class="item">登出</div>
                  </div>
              </a>
              <%
                  }
              %>
          </div>
      </div>
    </div>
    <div class="ui divider"></div>
    

    <div class="container article-page">
      <div class="main">
            <div class="content-th">
                <a class="ui tag label">资讯</a>
              <h1 id="articleTitle"><s:property value="article.getArticleTitle()"/> </h1>
              <div class="content-th-info">
                    <a><s:property value="article.getArticleAuthor()"/>  </a>
                    <span><s:property value="article.getArticlePublishTime()"/></span>
                    <button class="ui basic button"><a href="#">收藏</a></button>
              </div>
            </div>
            <div class="content-txt" id="articleContent">
              <div class="document" id="articleContentDoc">
                  <s:property value="article.getArticleContent()" escape="false"/>
              </div>
            </div>
            <div id="commentsReplyer" class="cmts-do">
                <h3 id="replyer">你的评论</h3>
                <form action="#">
                    <div class="ui segment"><p class="reply-info">请 <a href="#">登录</a> 发表评论</p></div>
                    <button class="ui primary button">评论</button>
                </form>
            </div>
          </div>
      <div class="side">
        <div class="ui card">
            <div class="image">
              <%--<img src="/images/avatar2/large/kristy.png">--%>
                <p>用户资料</p>
            </div>
            <div class="content">
              <a class="header"><s:property value="article.getArticleAuthor()"/></a>
              <div class="meta">
              <span class="date">2016年加入</span>
            </div>
            <div class="description">clverpanda哈哈哈哈</div>
            </div>
            <div class="extra content">
              <a><i class="user icon"></i> 22 Friends </a>
            </div>
        </div>
        <div class="side-title">
            <h2>作者的其他文章</h2>
        </div>
        <div class="column">
          <div class="ui segments">
            <div class="ui segment">
                <a href="#">【科学美图】生命即艺术：2016惠康摄影奖</a>
            </div>
            <div class="ui segment">
                <a href="#">酷炫动图（二十八）：医学篇</a>
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

</body></html>