<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cinema Ticketing</title>
	<link rel="icon" type="image/svg+xml" href="assets/logo.png" />
	<link rel="stylesheet" href="css/bootstrap.min.css"></link>
	<link rel="stylesheet" href="css/style.css"></link>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container-md hero-content d-flex align-items-center">
		<div class="row flex-column flex-md-row">
          <div class="my-3 d-md-none"></div>
          <div class="col-12 col-md-6 d-flex justify-content-center flex-column ">
            <h3 class="text-white hero-font my-5 ">
              Get An Immersive Movie with Your Beloved One
            </h3>
            <div class="text">
              <p class="text-light m2-5 hero-text">
                An immersive cinematic experience, bringing stories to life on
                the big screen with captivating visuals, powerful sound, and
                unforgettable moments of joy, suspense, and wonder.
              </p>
            </div>
            <button class="btn fs-5 mt-2 col-12 col-md-6 reques-button bg-orange-y">
              Go to Movies
            </button>
          </div>
          <div class="col-12 col-md-6 d-flex justify-content-center align-items-center py-5 bg-inf">
            <img src="assets/hero/banner.jpg" class="hero-img"/>
          </div>
        </div>
	</div>
</body>
</html>