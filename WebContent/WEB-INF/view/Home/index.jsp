<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.springframework.mysqltables.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<title>Home</title>

<jsp:include page="../includes/header.jsp" />

</head>

<body>

	<!-- Navigation -->
	<jsp:include page="../includes/nav-bar.jsp" />

	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<!-- main Contain -->
			

			<jsp:include page="../includes/index-mainContain.jsp"></jsp:include>

			<!-- side bar -->
			<jsp:include page="../includes/side-bar.jsp" />

		</div>
		<!-- /.row -->

		<hr>

		<!-- Footer -->
		<jsp:include page="../includes/footer.jsp" />
</body>

</html>
