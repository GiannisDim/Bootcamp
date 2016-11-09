<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>School Trip</title>
<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Custom styles for this template -->
<link href="css/mystyle.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<!-- navbar start -->
	<header>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span> 
					</button>
					<a class="navbar-brand" href="#">SCHOOL TRIP</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<form id="signin" class=" nav navbar-form navbar-right" role="form" method="POST" action="login">
						<div class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
							<input id="username" type="text" class="form-control" name="username" value="" placeholder="Username" required>                                        
						</div>

						<div class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
							<input id="password" type="password" class="form-control" name="password" value="" placeholder="Password" required>                                        
						</div>

						<button type="submit" class="btn btn-primary">Login</button>
					</form>
				</div>
			</div>
		</nav>
	</header>
	


	<!--main start -->
	<div class="container-fluid main">
		<div class="container" id="wrap">
			<div class="row">
				<div class="bg"></div>
				<div class="col-md-6 col-md-offset-3">
					<form action="register" method="POST" accept-charset="utf-8" class="form" role="form">
						<legend>Sign Up</legend>
						<div class="row">
							<div class="col-xs-6 col-md-6">
								<input type="text" name="firstname" class="form-control" placeholder="First Name" required/>
							</div>
							<div class="col-xs-6 col-md-6">
								<input type="text" name="lastname" class="form-control" placeholder="Last Name" required/>
							</div>
						</div>
						<input type="text" name="username" value="" class="form-control input" placeholder="Username" required/>
						<input type="email" name="email" value="" class="form-control input" placeholder="Your Email" required/>
						<input type="password" name="password" value="" class="form-control input" placeholder="Password" required/>
						<button class="btn btn-primary btn-lg btn-block" type="submit" id="register">
							Create my account
						</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- footer -->
	<footer class="text-center">
		<a class="up-arrow" href="#" >
			<span class="glyphicon glyphicon-chevron-up"></span>
		</a><br>
		<p>This site Made By Giannis Dimitriou</p>
	</footer>
	
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>