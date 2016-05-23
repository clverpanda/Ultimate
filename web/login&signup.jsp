<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0045)http://www.semantic-ui.cn/examples/login.html -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Standard Meta -->
  
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

  <!-- Site Properties -->
  <title>Login&Signup</title>

  <link rel="stylesheet" href="semantic-ui/semantic/dist/semantic.min.css">
  <link rel="stylesheet" href="Css/signin&signup.css">

  <script src="Js/jquery-2.2.3.min.js"></script>
  <script src="Js/signin&signup.js"></script>
</head>
<body>
<div class="ui middle aligned center aligned grid signin">
  <div class="column">
    <h2 class="ui teal image header">
      <img src="logo.png" class="image">
      <div class="content">
        Log-in to your account
      </div>
    </h2>
    <form class="ui large form" id="signin">
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input type="text" name="username" placeholder="Username">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="lock icon"></i>
            <input type="password" name="password" placeholder="Password">
          </div>
        </div>
        <div class="ui fluid large teal submit button">Login</div>

    <div class="ui divider"></div>
    <div class="footer">
      <!-- text plus button here -->
      <div class="text"> Not a member? </div>
      <div class="ui vertical animated teal mini button signup">
        <div class="visible content"> Join Us </div>
        <div class="hidden content">
          <i class="users icon"></i>
        </div>
      </div>
    </div>

      </div>

      <div class="ui error message"></div>

      
    
    </form>

    
  </div>
</div>


<div class="ui middle aligned center aligned grid signup inactive">
  <div class="column">
    <h2 class="ui teal image header">
      <img src="logo.png" class="image">
      <div class="content">
        Sign-up your account
      </div>
    </h2>
    <form class="ui large form">
      <div class="ui stacked segment">
        <div class="field">
          <div class="ui left icon input">
            <i class="user icon"></i>
            <input type="text" name="username" placeholder="Username">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="lock icon"></i>
            <input type="password" name="password" placeholder="Password">
          </div>
        </div>
        <div class="field">
          <div class="ui left icon input">
            <i class="lock icon"></i>
            <input type="password" name="confirm-password" placeholder="Confirm your password">
          </div>
        </div>
        <div class="ui fluid large teal submit button">Sign up</div>

    <div class="ui divider"></div>
    <div class="footer">
      <!-- text plus button here -->
      <div class="text"> Already a member? </div>
      <div class="ui vertical animated teal mini button signin">
        <div class="visible content"> Login </div>
        <div class="hidden content">
          <i class="users icon"></i>
        </div>
      </div>
    </div>

      </div>

      <div class="ui error message"></div>

      
    
    </form>

    
  </div>
</div>




<script src="semantic-ui/semantic/dist/semantic.min.js"></script>

</body></html>