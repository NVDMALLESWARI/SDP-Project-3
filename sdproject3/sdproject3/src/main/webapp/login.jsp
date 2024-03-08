<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>HTML5 Login Form with validation Example</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="./style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div id="login-form-wrap">
  <h2>Login</h2>
  <span class="blink">
  <h3 align=center style="color: red"><c:out value="${msg}"/></h3>
  </span>
  <form id="login-form" method="post" action="checkcustlogin">
    <p>
    <input type="text" id="username" name="uname" placeholder="Username" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="text" id="password" name="pwd" placeholder="Password" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="submit" id="login" value="Login">
    </p>
  </form>
  <div id="create-account-wrap">
    <p>New account? <a href="custreg">Register</a><p>
  </div><!--create-account-wrap-->
</div><!--login-form-wrap-->
<!-- partial -->
  
</body>
</html>
