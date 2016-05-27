<%--
  Created by IntelliJ IDEA.
  User: miaol
  Date: 2016/5/26 0026
  Time: 22:32
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0037)http://v3.bootcss.com/examples/blog/# -->
<html lang="zh-CN"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>发布文章</title>

    <script src="semantic-ui/javascript/jquery-2.2.3.min.js"></script>
    <script src="Js/ueditor.config.js"></script>
    <script src="Js/ueditor.all.min.js"></script>

    <!-- Bootstrap core CSS -->
    <link href="Css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="Css/main.css" rel="stylesheet">

    <link rel="stylesheet" href="semantic-ui/semantic/dist/semantic.min.css">


</head>

<body>
<nav class="navbar navbar-fixed-top">

    <div class="blog-masthead">
        <div class="container">
            <nav class="blog-nav">
                <a class="blog-nav-item" href="index.action">主页</a>
                <a class="blog-nav-item active" href="publishArticle.jsp">发布</a>
                <a class="blog-nav-item" href="#">资讯</a>
                <a class="blog-nav-item" href="personal.action">个人</a>
                <a class="blog-nav-item" href="#">关于</a>
            </nav>
        </div>
    </div>
</nav>
</br>
</br>
<div class="container">
    <form class="ui form" method="post" action="publish.action" id="articlePublishForm" name="articlePublishForm">
        <div class="field">
            <label>文章标题</label>
            <input type="text" name="articleTitle" placeholder="标题">
        </div>
        <div class="field">
            <label>下载路径</label>
            <input type="text" name="articleDownloadUrl" placeholder="下载路径">
        </div>
        <div class="field">
            <script id="container" name="articleContent" type="text/plain">
            </script>
        </div>
        <script type="text/javascript">
            var ue = UE.getEditor('container');
        </script>

        <input type="hidden" name="articleContext" id="articleContext">
        <input type="hidden" name="articleImgPath" id="articleImgPath">
        <button class="ui button" type="button" id="formBtn">提交</button>

    </form>
</div>

<div class="ui divider"></div>
<div class="contain">

<script>
    $(document).ready(function () {
        $("#formBtn").click(function () {
            $("#articleContext").val(UE.getEditor('container').getContentTxt());
            var str = UE.getEditor('container').getContent();
            var imgReg = /<img.*?(?:>|\/>)/gi;
            var srcReg = /src="([^"]*)"/i;
            var arr = str.match(imgReg);
            var src = arr[0].match(srcReg);
            $("#articleImgPath").val(src[1]);
            $("#articlePublishForm").submit();
        })
    })
</script>








    <script src="semantic-ui/semantic/dist/semantic.min.js"></script>
    <script>  $('.ui.dropdown').dropdown();  </script>

</body>
</html>
