<?php
// Database connection
$conn = mysqli_connect("localhost", "root", "", "ap");
if (!$conn) {
    echo "not connect";
} else {
    echo "connected";
}

// Create
if (isset($_POST['submit'])) {
    $name = $_POST['name'];
    $specialization = $_POST['specialization'];
    $email = $_POST['email'];

    $sql = "INSERT INTO doctors (name, specialization, email) VALUES ('$name', '$specialization', '$email')";
    if ($conn->query($sql) === TRUE) {
        echo "New record created successfully";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }
}

// Delete
if (isset($_POST['delete'])) {
    $id = $_POST['id'];
    $sql = "DELETE FROM doctors WHERE id=$id";
    if ($conn->query($sql) === TRUE) {
        echo "Record deleted successfully";
    } else {
        echo "Error deleting record: " . $conn->error;
    }
}

// Update
if (isset($_POST['update'])) {
    $id = $_POST['id'];
    $name = $_POST['name'];
    $specialization = $_POST['specialization'];
    $email = $_POST['email'];

    $sql = "UPDATE doctors SET name='$name', specialization='$specialization', email='$email' WHERE id=$id";
    if ($conn->query($sql) === TRUE) {
        echo "Record updated successfully";
    } else {
        echo "Error updating record: " . $conn->error;
    }
}

// Read
$sql = "SELECT * FROM doctors";
$result = $conn->query($sql);

if ($result === false) {
    echo "Error executing query: " . $conn->error;
} else {
    if ($result->num_rows > 0) {
?>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Panel - Hospital Management System</title>
</head>
<body>
    <h2>Add Doctor</h2>
    <form method="post">
        <input type="text" name="name" placeholder="Name"><br>
        <input type="text" name="specialization" placeholder="Specialization"><br>
        <input type="email" name="email" placeholder="Email"><br>
        <input type="submit" name="submit" value="Add">
    </form>

    <h2>Doctors List</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Specialization</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
        <?php
        while ($row = $result->fetch_assoc()) {
            echo "<tr>";
            echo "<form method='post'>";
            echo "<td><input type='text' name='name' value='".$row['name']."'></td>";
            echo "<td><input type='text' name='specialization' value='".$row['specialization']."'></td>";
            echo "<td><input type='email' name='email' value='".$row['email']."'></td>";
            echo "<input type='hidden' name='id' value='".$row['id']."'>";
            echo "<td>
                    <input type='submit' name='update' value='Update'>
                    <input type='submit' name='delete' value='Delete'>
                </td>";
            echo "</form>";
            echo "</tr>";
        }
        ?>
    </table>
</body>
</html>
<?php
    } else {
        echo "No doctors found";
    }
}

$conn->close();
?>
