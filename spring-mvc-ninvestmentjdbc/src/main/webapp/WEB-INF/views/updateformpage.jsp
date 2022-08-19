<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Update Investment</h1>
<form action="updateInvestment" method="post">
<input action="hidden" name="planId" value+"${investment.planId }"readonly><br>
Name<input type="text" name="planName" value="${investment.planName }" readonly><br>
Entry Age<input type="text" name="age" value="${investment.age }" readonly><br>
Amount<input type="text" name="amount" value="${investment.amount }" ><br>
Risk<input type="radio" name="risk" value="high">High
<input type="radio" name="risk" value="low"> Low<br>

Purpose<select name="purpose">
<option value="${investment.purpose }">${investment.purpose }
<option value="EDUCATION">Education
<option value="MARRIAGE">Marraige
<option value="RETIREMENT">Retirement
</select><br>
Nominee<select name="nominee">
<option value="${investment.nominee}">${investment.nominee }
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

<input type="submit" value="Update Investment">
</form>
</body>
</html>