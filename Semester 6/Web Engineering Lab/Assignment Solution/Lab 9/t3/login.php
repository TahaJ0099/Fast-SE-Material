<?php
include 'connect.php';

$page = $_SERVER['REQUEST_URI'];
setcookie('last_visited_page', $page, time()+ 3600); 

session_start();
if(isset($_SESSION['id']) && isset($_SESSION['password'])){
    header("Location: home.php");
    exit();
}

$error = "";
if(isset($_POST['login'])){
    $id = $_POST['id'];
    $password = $_POST['password'];
    
    $id = mysqli_real_escape_string($conn, $id);
    $password = mysqli_real_escape_string($conn, $password);

    $query = "SELECT * FROM user WHERE id = '$id' AND PASSWORD = '$password'";
    $result = mysqli_query($conn, $query);

    if($result){
        $count = mysqli_num_rows($result);
        if($count > 0){
            $_SESSION['id'] = $id;
            $_SESSION['password'] = $password;
            header("Location: home.php");
            exit();
        } else {
            $error = "<p style='color:red;'>Username or password is incorrect</p>";
        }
    } else {
        $error = "<p style='color:red;'>Error: " . mysqli_error($conn) . "</p>";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>

    <form action="" method="post">
        <label for="id" style="display: block;">id:</label>
        <input type="text" name="id" id="id" style="padding: 5px; margin-bottom: 10px;">
        <label for="password" style="display: block;">Password:</label>
        <input type="password" name="password" id="password" style="padding: 5px; margin-bottom: 10px;"><br>

        <input type="submit" name="login" value="Login" style="padding: 10px 20px; background-color: #007bff; color: #fff; border: none; border-radius: 5px; cursor: pointer;">
    </form>
    <?php echo $error; ?>
    
</body>
</html>
