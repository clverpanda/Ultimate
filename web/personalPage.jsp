<%--
  Created by IntelliJ IDEA.
  User: miaol
  Date: 2016/5/27 0027
  Time: 7:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<!-- saved from url=(0037)http://v3.bootcss.com/examples/blog/# -->
<html lang="zh-CN"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>主页</title>


    <!-- Bootstrap core CSS -->
    <link href="Css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="Css/main.css" rel="stylesheet">

    <link rel="stylesheet" href="semantic-ui/semantic/dist/semantic.min.css">


</head>

<body>

<s:set name="user" value="#session['user']"/>
<nav class="navbar navbar-fixed-top">

    <div class="blog-masthead">
        <div class="container">
            <nav class="blog-nav">
                <a class="blog-nav-item" href="index.action">主页</a>
                <a class="blog-nav-item" href="publishArticle.jsp">发布</a>
                <a class="blog-nav-item" href="#">资讯</a>
                <a class="blog-nav-item active" href="personal.action">个人</a>
                <a class="blog-nav-item" href="#">关于</a>
            </nav>
        </div>
    </div>
</nav>
</br>
</br>
<div class="ui secondary menu">
    <a class="item active">所有分类</a>
    <a class="item">Windows</a>
    <a class="item">Android</a>
    <a class="item">Ios</a>
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
                <input type="text" placeholder="搜索">
                <i class="search link icon"></i>
            </div>
        </div>
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
<div class="ui divider"></div>
<div class="contain">


    <table class="table">
        <tr>
            <th>文章标题</th>
            <th>文章作者</th>
            <th>发布日期</th>
        </tr>
        <s:iterator value="personal" id="person">
            <tr>
                <td><s:property value="#person.getArticleTitle()"/></td>
                <td><s:property value="#person.getArticleAuthor()"/></td>
                <td><s:property value="#person.getArticlePublishDate()"/></td>
                <td><a href="deleteArticle.action?articleId=<s:property value="#person.getArticleId()"/>">删除</a></td>
                <td><a href="#">修改</a></td>
            </tr>
        </s:iterator>

    </table>









    <script src="semantic-ui/javascript/jquery-2.2.3.min.js"></script>
    <script src="semantic-ui/semantic/dist/semantic.min.js"></script>
    <script>  $('.ui.dropdown').dropdown();  </script>

</body>
</html>