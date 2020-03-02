<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>new product</title>
</head>
<body>
<form action="/hibernate/AjoutProduit"  method="post">
<div>
	<label>Product Name</label>
	<input type="text" name="name" placeholder="Introduce a name">
</div>
<div>
 	<label>Product Description</label>
	<textarea  name="Description" placeholder="Introduce a Description"></textarea>
</div>

<input type="submit" value="Save product">
</form>
</body>
</html>