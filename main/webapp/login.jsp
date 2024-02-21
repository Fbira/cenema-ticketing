<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link rel="icon" type="image/svg+xml" href="assets/logo.png" />
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css" />
	</head>
<body>
	<div class="countainer form-container">
		<div class="container-md d-flex justify-content-center align-items-center login ">
	      <form class="col-12 col-md-6 col-lg-4 login-form" action="LoginUser" method="post">
	        <h2 class="fw-bold color my-4">Login</h2>
	
	        <div class="mb-4">
	          <label class="form-label">Email</label>
	          <input
	            type="email"
	            class="form-control"
	            id="exampleInputEmail1"
	            aria-describedby="emailHelp"
	            required
	            name="email"
	          />
	
	        </div>
	
	        <div class="mb-4">
	          <label class="form-label">Password</label>
	          <input
	            type="password"
	            class="form-control"
	            id="exampleInputPassword1"
	            required
				name="password"
	          />
	        </div>
	
	        <button type="submit" class="btn btn-primary w-100 login-btn">
	          Login
	        </button>
	
	        <p class="mt-2">
	          <span>Don't have account? </span>
	          <a href="register.jsp" class="color">
	            Signup
	          </a>
	        </p>
	      </form>
	    </div>
	</div>
</body>
</html>