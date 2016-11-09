<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="org.afdemp.bootcamp.giannis.dao.SchoolTripDao, org.afdemp.bootcamp.giannis.domain.Destination, org.afdemp.bootcamp.giannis.domain.User"%>
<%if(session.getAttribute("userobject") == null){%> 
	<jsp:forward page="login.jsp">
		<jsp:param name="msg" value="Please log in first" />
	</jsp:forward>
<%}%>
<!DOCTYPE html>
<html lang="en">
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
<body class ="index">
<% User user1 = (User)session.getAttribute("userobject");%>
	<!--nav bar menu -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">SCHOOL TRIP</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">HOME</a></li>
					<li><a href="#destination">DESTINATIONS</a></li>
					<li><a href="#vote">VOTE</a></li>
					<li><a href="#contact">CONTACT</a></li>
					<li><a href="logout.jsp" ><span class="glyphicon glyphicon-user"></span>LOGOUT</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!--First section (Destinations) -->
	<div class="container-fluid text-center" id="destination">
		<h3>DESTINATIONS</h3>
		<p>
			<em>We love trips.</em>
		</p>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean
			eu rhoncus ligula, quis rhoncus massa. Nullam scelerisque quam nec
			semper volutpat. Aliquam interdum accumsan lorem. Vestibulum quis ex
			facilisis, interdum libero vel, fermentum ante. Quisque venenatis,
			dui et consequat finibus, nulla nisl dictum nibh, eu vulputate orci
			ipsum vitae eros. Praesent et sem sed elit vestibulum consequat. Nam
			mollis at risus a condimentum.</p>
		<br>
		<div class="row">
			<div class="col-sm-4">
				<p class="text-center">
					<strong>Barcelona</strong>
				</p>
				<a href="#barcelona" data-toggle="collapse"> <img
					src="css/barcelona-city.jpg" class="img-circle destination"
					alt="Random name">
				</a>
				<div id="barcelona" class="collapse">
					<p>In lacinia maximus porta. Donec tempor eros vitae ipsum
						ornare, et facilisis quam vehicula. Proin lacinia, urna nec
						consectetur imperdiet, risus dui porttitor velit, ut pharetra odio
						lorem eget ante. Proin et efficitur arcu. Nulla egestas aliquet
						turpis quis eleifend. Nam vestibulum leo massa.</p>
					<br>
				</div>
			</div>
			<div class="col-sm-4">
				<p>
					<strong>Rome</strong>
				</p>
				<a href="#rome" data-toggle="collapse"> <img src="css/rome.jpg"
					class="img-circle destination" alt="Random name">
				</a>
				<div id="rome" class="collapse">
					<p>Quisque pretium facilisis neque, in tincidunt augue
						tristique vel. Sed rhoncus sem mattis nulla eleifend, placerat
						rutrum leo dictum. Sed et pharetra ex, sed feugiat metus. Mauris
						vitae metus finibus, efficitur lacus nec, facilisis orci. Praesent
						ut felis iaculis, luctus arcu ultricies, consequat augue. Nam ac
						rutrum lorem.</p>
					<br>
				</div>
			</div>
			<div class="col-sm-4">
				<p>
					<strong>Berlin</strong>
				</p>
				<a href="#berlin" data-toggle="collapse"> <img
					src="css/berlin.jpg" class="img-circle destination"
					alt="Random name">
				</a>
				<div id="berlin" class="collapse">
					<p>Nulla tincidunt orci et tellus volutpat, quis sollicitudin
						nisl ornare. Aliquam erat volutpat. Quisque eget libero non orci
						vulputate sagittis. Sed eu facilisis ante. Quisque eu augue
						pharetra purus dictum dignissim. Pellentesque nec massa dui.
						Maecenas ut nisi massa.</p>
				</div>
			</div>
		</div>
	</div>

	<!-- vote section -->
	<div class="vote" id="vote">
		<div class="container">
			<h3 class="text-center">TOUR VOTES</h3>
			<p class="text-center">
				Vestibulum quis ex facilisis, interdum libero vel, fermentum ante.
				Quisque venenatis, dui et consequat finibus, nulla nisl dictum nibh,
				eu vulputate orci ipsum vitae eros. Praesent et sem sed elit
				vestibulum consequat. Nam mollis at risus a condimentum.<br>
				Remember to book your tickets!
			</p>

			<%
				SchoolTripDao school = new SchoolTripDao();
				school.open();
				List<Destination> desList = school.getDestinations();
				school.close();
			%>
			<ul class="list-group">
				<%
					for (int i = 0; i < desList.size(); i++) {
				%>
				<li class="list-group-item"><%=desList.get(i).getName()%><span
					class="badge"><%=desList.get(i).getVote()%></span></li>
				<%
					}
				%>
			</ul>
			<div class="row text-center">
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="css/barcelona-city.jpg" alt="Barcelona">
						<p>
							<strong>Barcelona</strong>
						</p>
						<form action="index" method="POST">
							<input type="hidden" name="username" value="<%=user1.getUsername()%>">
							<button type="submit" name="submit" value="Barcelona" class="btn" <%if(user1.getVote().equals("Y")){%>disabled<%}%>>Vote</button>
						</form>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="css/rome.jpg" alt="Rome">
						<p>
							<strong>Rome</strong>
						</p>
						<form action="index" method="POST">
							<input type="hidden" name="username" value="<%=user1.getUsername()%>">
							<button type="submit" name="submit"  value="Rome" class="btn" <%if(user1.getVote().equals("Y")){%>disabled<%}%>>Vote</button>
						</form>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="thumbnail">
						<img src="css/berlin.jpg" alt="Berlin">
						<p>
							<strong>Berlin</strong>
						</p>
						<form action="index" method="POST">
							<input type="hidden" name="username" value="<%=user1.getUsername()%>">
							<button type="submit" name="submit" value="Berlin"  class="btn" <%if(user1.getVote().equals("Y")){%>disabled<%}%>>Vote</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Contact form section -->
	<div class="container" id="contact">
		<h3 class="text-center">Contact Us</h3>

		<div class="row test">
			<div class="col-md-4">
				<p>Question? Drop a note.</p>
				<p>
					<span class="glyphicon glyphicon-phone"></span>Phone: 2741027410
				</p>
				<p>
					<span class="glyphicon glyphicon-envelope"></span>Email:
					mail@mail.com
				</p>
			</div>
			<div class="col-md-8">
				<div class="row">
					<div class="col-sm-6 form-group">
						<input class="form-control" type="text" name="name" id="name"
							placeholder="Name" required>
					</div>
					<div class="col-sm-6 form-group">
						<input class="form-control" type="email" name="email" id="email"
							placeholder="Email" required>
					</div>
				</div>
				<textarea class="form-control" id="comments" name="comments"
					placeholder="Comments" rows="5"></textarea>
				<div class="row">
					<div class="col-md-12 form-group">
						<button class="btn pull-right" type="submit">Send</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- footer -->
	<footer class="text-center">
		<a class="up-arrow" href="#"> <span
			class="glyphicon glyphicon-chevron-up"></span>
		</a> <br>
		This site Made By Giannis Dimitriou
	</footer>
	<!-- end footer -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>