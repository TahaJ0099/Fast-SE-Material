<?php
session_start();

$conn = mysqli_connect('localhost', 'root', '', 'newdb');

if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

if (isset($_POST['submit'])) {
    $id = $_POST['id'];
    $name = $_POST['name'];
    $email = $_POST['email'];
    $password = $_POST['password'];

    $errors = array();
    if (empty($id)) {
        $errors[] = "id is required";
    }
    if (empty($name)) {
        $errors[] = "name is required";
    }
    if (empty($email)) {
        $errors[] = "email is required";
    }
    if (empty($password)) {
        $errors[] = "Password is required";
    }

    if (count($errors) == 0) {
        $sql = "INSERT INTO user (id, name, email, password) VALUES ('$id', '$name', '$email', '$password')";
        if (mysqli_query($conn, $sql)) {
            header("Location: home.php");
            exit();
        } else {
            $errors[] = "Error registering user: " . mysqli_error($conn);
        }
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Task 02_tahajawaid.com</title>
    
</head>
<body>
    <form method="post">
        <label for="id">id:</label>
        <input type="text" name="id" id="id">
        <br>
        <label for="name">Name:</label>
        <input type="text" name="name" id="name">
        <br>
        <label for="email">Email:</label>
        <input type="text" name="email" id="email">
        <br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password">
        <br>
        <input type="submit" name="submit" value="Register">
    </form>
    <?php if (isset($errors) && count($errors) > 0) { ?>
        <?php foreach ($errors as $error) { ?>
            <p style="color: red;"><?php echo $error; ?></p>
        <?php } ?>
    <?php } ?>
</body>
</html>