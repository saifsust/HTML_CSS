<%@ page import="com.springframework.mysqltables.*, java.util.*"%>

<!-- Blog Entries Column -->
<div class="col-md-8">

	<h1 class="page-header">
		Page Heading <small>Secondary Text</small>
	</h1>

	<!-- First Blog Post -->

	<%
		for (HomePost post : (List<HomePost>) request.getAttribute("postView")) {
	%>

	<h2>
		<a href="#"><%=post.getPost_title()%></a>
	</h2>
	<p class="lead">
		by <a href="#"><%=post.getPost_author()%></a>
	</p>
	<p>
		<span class="glyphicon glyphicon-time"></span><%=post.getPost_date()%>
	</p>
	<hr>
	<img class="img-responsive" width=100%
		src="${pageContext.request.contextPath}/<%=post.getPost_img()%>"
		alt="Image">
	<hr>
	<p><%=post.getPost_content().substring(0, 500)%></p>
	<a class="btn btn-primary" href="#">Read More <span
		class="glyphicon glyphicon-chevron-right"></span></a>

	<%
		}
	%>


	<hr>



	<!-- Pager -->
	<ul class="pager">
		<li class="previous"><a href="#">&larr; Older</a></li>
		<li class="next"><a href="#">Newer &rarr;</a></li>
	</ul>

</div>