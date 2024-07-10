<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <?php
    session_start();
    if(isset($_SESSION['id'])){
        header("Location: dashboard.php");
        exit();
    }

    $error = "";
    if(isset($_POST['login'])){
        include 'connect.php'; 
        $id = $_POST['id'];
        $password = $_POST['password'];

        $query = "SELECT * FROM user WHERE USERNAME = '$id' and PASSWORD = '$password'";
        $result = mysqli_query($conn, $query);

        if(!$result) {
            $error = "<p style='color:red;'>Error executing the query: " . mysqli_error($conn) . "</p>";
        } else {
            $count = mysqli_num_rows($result);
            if($count > 0){
                $_SESSION['id'] = $id;
                header("Location: dashboard.php");
                exit();
            } else {
                $error = "<p style='color:red;'>Username or password is incorrect</p>";
            }
        }
    }
    ?>

    <form action="" method="post">
        <h1>Login Page!!!</h1>
        <label for="id" style="display: block;">Username:</label>
        <input type="text" name="id" id="id" style="padding: 5px; margin-bottom: 10px;">
        <label for="password" style="display: block;">Password:</label>
        <input type="password" name="password" id="password" style="padding: 5px; margin-bottom: 10px;"><br>
        <input type="submit" name="login" value="Login" style="padding: 10px 20px; background-color: #007bff; color: #fff; border: none; border-radius: 5px; cursor: pointer;">
    </form>
    <?php echo $error; ?>
</body>
</html>
