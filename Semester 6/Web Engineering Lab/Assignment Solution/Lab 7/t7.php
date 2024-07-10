<!DOCTYPE html>

<html>

<head>

<title>Task 07_tahajawaid.com</title>

</head>
<h3>Done by Taha Jawaid 21k-3881</h3>
<h1>Signup Form</h1>

<body>

<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
<label for="name">Name:</label>
<input type="text" name="name" required><br><br>
 <label for="email">Email:</label>
<input type="email" name="email" required><br><br>
<label for="password">Password:</label>
<input type="password" name="password" required><br><br>
<input type="submit" name="submit" value="Submit">
</form>

<?php
 if ($_SERVER["REQUEST_METHOD"]=="POST") {

$name = $_POST["name"];
$email = $_POST["email"];
$password = $_POST["password"]; 
echo("<h2>Signup Details:</h2>");
echo("Name = " . $name . "<br>");
echo("Email =". $email . "<br>");
echo("Password= " . $password . "<br>");
}
?>
</body>
 </html>