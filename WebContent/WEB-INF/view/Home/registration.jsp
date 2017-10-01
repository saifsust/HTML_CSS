<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.springframework.mysqltables.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Registration</title>
<jsp:include page="../includes/header.jsp"></jsp:include>

</head>

<body>

	<!-- Navigation -->
  <jsp:include page="../includes/nav-bar.jsp" />




	<!-- Page Content -->
	<div class="container">

	<div class="jumbotron text-center ">
		<h1>Registration</h1>
		<p>please fill up your detail</p>
	</div>

		<!-- /.row -->
		<div class="row">


			<hr>
			<div class="col-md-5 col-md-offset-3">
				<form action="" method="POST">
					<div class="form-group">
						<label class="control-label" for="firstname">First Name</label> <input
							type="text" name="firstName" class="form-control" />
					</div>

					<div class="form-group">
						<label class="control-label" for="Lastname">Last Name</label> <input
							type="text" name="lastName" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label" for="username">User Name</label> <input
							type="text" name="userName" class="form-control" />
					</div>

					<div class="form-group">
						<label class="control-label" for="email">Email</label> <input
							type="email" name="email" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label" for="confermemail">Conferm
							Email</label> <input type="email" name="confermEmail"
							class="form-control" />
					</div>


					<div class="form-group">
						<label class="control-label" for="password">password</label> <input
							type="password" name="password" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label" for="confermpassword">Conferm
							password</label> <input type="password" name="confermPassword"
							class="form-control" />
					</div>
					<div class="from-group">
						<input type="submit" name="signup" value="Sign up"
							class="btn btn-primary /">
					</div>
				</form>

			</div>

		</div>
		<!-- /.row -->
		<hr>

		<!-- Footer -->
		<jsp:include page="../includes/footer.jsp"></jsp:include>
</body>

</html>
