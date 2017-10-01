
<!-- Blog Sidebar Widgets Column -->
<%@page import="com.springframework.mysqltables.*,java.util.*"%>
<div class="col-md-4">

	<!-- Blog Search Well -->
	<div class="well">
	
	
		<h4>Blog Search</h4>
		<div class="input-group">
			<input type="text" class="form-control"> <span
				class="input-group-btn">
				<button class="btn btn-default" type="button">
					<span class="glyphicon glyphicon-search"></span>
				</button>
			</span>
		</div>
		<!-- /.input-group -->
	</div>

	<!-- Blog Categories Well -->
	<div class="well">
		<h4>Blog Categories</h4>
		<div class="row">


			<div class="col-lg-6">
				<ul class="list-unstyled">
					<%
						List<Category> categoryList = (List<Category>) request.getAttribute("category");
						int count = 0;
						int size = categoryList.size();
						for (Category category : categoryList) {
					%>
					<li><a href="#"><%=category.getCat_title()%></a></li>
					<%
						}
					%>

				</ul>
			</div>
			<!-- /.col-lg-6 -->




		</div>
		<!-- /.row -->
	</div>

	<!-- Side Widget Well -->
	<div class="well">

	<% for(Announcement announce :(List<Announcement>) request.getAttribute("announce")){
	%>
		<h2><%= announce.getAnn_title()%></h2>
		<p>
			<span class="glyphicon glyphicon-time"></span><%= announce.getAnn_date() %>
		</p>		
		<p><%= announce.getAnn_content() %></p>
			<%} %>
	</div>

</div>