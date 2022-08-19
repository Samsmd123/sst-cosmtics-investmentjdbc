<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Add Investment</h1>
<form action="addInvestment" method="post">
Name<input type="text" name="planName"><br>
Entry Age<input type="text" name="age"><br>
Amount<input type="text" name="amount"><br>
Risk<input type="radio" name="risk" value="high">High
<input type="radio"" name="risk" value="low"> Low<br>

Purpose<select name="purpose">
<option value="EDUCATION">Education
<option value="MARRIAGE">Marrage<br>
<option value="RETIREMENT">Retirement<br>
</select><br>

Nominee<select name="nominee">
		<option value="FATHER">Father
		<option value="MOTHER">Mother
		<option value="HUSBAND">Husband
		<option value="WIFE">Wife
		<option value="SON">Son
		<option value="DAUGHTER">Daughter
</select><br>

Type<select name="type">
		<option value="MUTUAL FUND">Mutual Fund
		<option value="PUBLIC PROVIDENT FUND">Public Provident Fund
		<option value="UNIT LIMITED INVESTMENT PLAN">ULIP
		<option value="SENIOR PENSION SCHEME">Senior Pension Scheme
		<option value="FIXED DEPOSITE">Fixed Deposite
		
		
</select><br>

<input type="submit" value="Add Investment">

</body>
</html>
+