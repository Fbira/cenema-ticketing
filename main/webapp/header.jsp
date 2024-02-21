<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="icon" type="image/svg+xml" href="assets/logo.png" />
	<link rel="stylesheet" href="css/bootstrap.min.css"></link>
	<link rel="stylesheet" href="css/style.css"></link>
</head>
<body>
<nav class="navbar navbar-expand-md py-3" aria-label="Main Navigation" role="navigation">
    <div class="container-md">
      <a class="navbar-brand nav-home" href="/">
        <img src="assets/logo.png" alt="Cinema Ticketing" class="nav-img"/>
        <span class="mx-2">My Cinema</span> 
      </a>
      
      <div class="collapse navbar-collapse main-nav" id="mainNavbar" aria-labelledby="navigation">
        <ul class="navbar-nav d-flex justify-content-md-end w-100 me-auto mb-2 mb-lg-0">
        <li class="nav-item mx-md-2">
            <a class="nav-link" href="./">Home</a>
        </li>
        <li class="nav-item mx-md-2">
            <a class="nav-link" href="movies.jsp">Movies</a>
        </li>
        <li class="nav-item mx-md-2">
            <a class="nav-link" href="login.jsp">Login</a>
        </li>
        <li class="nav-item mx-md-2">
            <a class="nav-link" href="register.jsp">Register</a>
        </li>
        <li class="nav-item mx-md-2">
            <a class="nav-link " href="tickets">My Tickets</a>
        </li>
        </ul>
      </div>
    </div>
  </nav>
</body>
</html>