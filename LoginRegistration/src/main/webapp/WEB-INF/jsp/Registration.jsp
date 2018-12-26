<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Registration Page</title>

<!-- <link rel="stylesheet" type="text/css" media="screen" href="login.css" /> -->
<!-- <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="registration.js"></script> -->
</head>

<body>

	<form name="registration" action="registration"
		onsubmit="return validate()" method="POST">

		<h1>Registration</h1>

		<input id="firstname" type="text" placeholder="First Name" required
			name=firstName> <input id="lastname" type="text"
			placeholder="Last Name" required name=lastName> <input
			id="email" type="text" placeholder="Email ID" required name=email>
		<div id="div-email" class="errMsg"></div>

		<input id="password" type="text" placeholder="Password" required
			name=password>
		<div id="div-password" class="errMsg"></div>

		<input id="confirmpassword" type="text" placeholder="Confirm Password"
			required name=confirmpassword>
		<div id="div-con-password" class="errMsg"></div>

		<button id="registerSubmit" type="submit">
			<B>REGISTER</B>
		</button>

		<div class="register">
			Already registered? <a
				href="http://localhost:8080/LoginRegistration/Login">Sign in</a>
		</div>
	</form>

	<script>
		function validate() {
			/* var x = document.forms.registerform.password.value; */
			var x = document.getElementById(password);
			var regex;
			if (x.length < 8) {
				alert("Minimum 8 character");
				return false;
			}
			regex = /[0-9]/;
			if (!regex.test(x)) {
				alert("Must contain one numeric");
				return false;
			}
			regex = /[A-Z]/;
			if (!regex.test(x)) {
				alert("Must contain one upper case letter");
				return false;
			}
			regex = /[a-z]/;
			if (!regex.test(x)) {
				alert("Must contain one lower case letter");
				return false;
			}

		}
	</script>

</body>

</html>