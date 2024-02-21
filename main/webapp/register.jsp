<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding ="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Sign Up</title>
	<link rel="icon" type="image/svg+xml" href="assets/logo.png" />
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="form-container">
		<div class="container-md d-flex justify-content-center align-items-center login ">
	      <form class="col-12 col-md-6 col-lg-6 login-form" action="SaveUser" method="post">
	        <h2 class="fw-bold color my-4">Register</h2>
	
	        <div class="mb-4">
	          <label class="form-label">Email address</label>
	          <input
	            type="email"
	            class="form-control"
	            required
	            name="email"
	          />
	        </div>
	
			<div class="row">
	        	<div class="mb-4 col">
		          <label class="form-label">First Name</label>
		          <input
		            type="text"
		            class="form-control"
		            required
		            name="fName"
		          />
		        </div>
		
		        <div class="mb-4 col">
		          <label class="form-label">Last Name</label>
		          <input
		            type="text"
		            class="form-control"
		            required
		            name="lName"
		          />
		        </div>
	        </div>
	        
	        <div class="row">
	        	<div class="mb-4 col">
		          <label class="form-label">Age</label>
		          <input
		            type="number"
		            class="form-control"
		            required
		            name="age"
		          />
		        </div>
		
		        <div class="mb-4 col">
		          <label class="form-label">Sex</label>
		          <div class="row mx-1">
		          	<div class="form-check col">
					  <input class="form-check-input" type="radio" name="gender" id="male">
					  <label class="form-check-label" for="male">
					    Male
					  </label>
					</div>
					<div class="form-check col">
					  <input class="form-check-input" type="radio" name="gender" id="female">
					  <label class="form-check-label" for="female">
					    Female
					  </label>
					</div>
		          </div>
		        </div>
	        </div>
	
	        <div class="row">
	        	<div class="mb-4 col">
		          <label class="form-label">Password</label>
		          <input
		            type="password"
		            class="form-control"
		            required
		            name="password"
		          />
		        </div>
		
		        <div class="mb-4 col">
		          <label class="form-label">Confirm Password</label>
		          <input
		            type="password"
		            class="form-control"
		            required
		            name="confirm_password"
		          />
		        </div>
	        </div>
	
	        <button type="submit" class="btn btn-primary w-100 login-btn">
	          Register
	        </button>
	        <p class="mt-2">
	          <span>Already have account? </span>
	          <a href="login.jsp" class="color">
	            Login
	          </a>
	        </p>
	      </form>
	    </div>
	</div>
</body>
</html>
