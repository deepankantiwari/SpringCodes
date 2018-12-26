<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<!-- <link rel="stylesheet" type="text/css" href="login.css" /> -->

<!-- <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="login.js"></script> -->

</head>
<title>Login</title>

<body>
	<form name="loginform" action="dashboard" method="POST">
		<h1>Sign in</h1>
		<div class="container">

			<input id="email" type="email" placeholder="Your email" required
				name=email>
			<div id="div-emailid" class="errMsg"></div>


			<input id="password" type="password" placeholder="Your password"
				required name=password>
			<div id="div-password" class="errMsg"></div>

			<button id="loginSubmit" type="submit" onclick=validate()>
				<B>SIGN IN</B>
			</button>

			<div class="register">
				New User? <a href="http://localhost:8080/LoginRegistration/Registration">Register</a>
			</div>

		</div>
	</form>
	<script>
		function validate() {
			debugger;
			var x = document.forms.loginform.password.value;
			//var x = document.getElementById('password');
			var regex;
			if (x.length < 8) {
				$('#div-password').html("Minimum 8 character");
				//alert("Minimum 8 character");
				return false;
			}
			regex = /[0-9]/;
			if (!regex.test(x)) {
				$('#div-password').html("Must contain one numeric");
				//alert("Must contain one numeric");
				return false;
			}
			regex = /[A-Z]/;
			if (!regex.test(x)) {
				$('#div-password').html("Must contain one upper case letter");
				//alert("Must contain one upper case letter");
				return false;
			}
			regex = /[a-z]/;
			if (!regex.test(x)) {
				$('#div-password').html("Must contain one lower case letter");
				//alert("Must contain one lower case letter");
				return false;
			}

		}
	</script>

</body>

</html>