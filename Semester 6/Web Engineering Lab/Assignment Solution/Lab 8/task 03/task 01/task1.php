<!DOCTYPE html>
<html>
<head>
    <title>Task 01_tahajawaid.com</title>
</head>
<body>
    <h1>CRUD Operations</h1>

    <form method="post" action="add.php">
        <h3>Add user: </h3>
        <label for="add_id">Id:</label>
        <input type="text" id="add_id" name="id">
        <br>
        <label for="add_password">Password:</label>
        <input type="text" id="add_password" name="password">
        <br>
        <input type="submit" value="Add User">
    </form>
    <br>
    <form method="post" action="del.php">
    <h3>Delete User:</h3>
        <label for="del_id">Id:</label>
        <input type="text" id="del_id" name="id">
        <br>
        <input type="submit" value="Delete User">
    </form>
    <br>
    <form method="post" action="update.php">
        <h3>Update User:</h3>
        <label for="update_id">Id:</label>
        <input type="text" id="update_id" name="id">
        <br>
        <label for="update_password">Password:</label>
        <input type="text" id="update_password" name="password">
        <br>
        <input type="submit" value="Update User">
    </form>

    <?php
    include('connect.php');

    $sql = "SELECT * FROM user";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo "<table>";
        echo "<tr><th>Id</th><th>Password</th></tr>";

        while ($row = $result->fetch_assoc()) {
            echo "<tr><td>" . $row["id"] . "</td><td>" . $row["password"] . "</td></tr>";
        }
        echo "</table>";
    } else {
        echo "0 results";
    }
    ?>
</body>
</html>