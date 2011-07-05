<!doctype html>
<%-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ --%>
<!--[if lt IE 7 ]> <html class="no-js ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]>    <html class="no-js ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]>    <html class="no-js ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" --%>
<head>
  <meta charset="utf-8" />
  <%-- Always force latest IE rendering engine (even in intranet) & Chrome Frame --%>
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  
  <title>Spring playground</title>
  
  <meta name="description" content="spring playground">
  <meta name="author" content="farnoux">

  <link rel="shortcut icon" href="favicon.ico">
  <link rel="author" href="humans.txt" />
  
  <link rel="stylesheet" href="<c:url value="/static/css/main.css" />" />

<!--[if IE]>
	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<!--[if lte IE 7]>
	<script src="js/IE8.js" type="text/javascript"></script><![endif]-->
<!--[if lt IE 7]>
	<link rel="stylesheet" type="text/css" media="all" href="css/ie6.css"/><![endif]-->
  
  <%-- All JavaScript at the bottom, except for Modernizr which enables HTML5 elements & feature detects --%>
  <script src="<c:url value="/static/js/libs/modernizr-1.7.min.js" />"></script>
</head>

<body>

  <div id="container">
    <header>
      <h1>Spring playground</h1>
    </header>
    
    <div id="body">
      <p>Say hi.</p>
    </div>
    
    <footer>
    </footer>
  </div> <!-- #container -->

  <%-- JavaScript at the bottom for fast page loading --%>

  <%-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if necessary --%>
  <script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.js"></script>
  <script>window.jQuery || document.write("<script src='<c:url value="/static/js/libs/jquery-1.6.1.min.js" />'>\x3C/script>")</script>

  <script src="js/script.js"></script>
</body>
</html>