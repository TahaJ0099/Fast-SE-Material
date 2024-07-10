<!DOCTYPE html>
<html>
<head>
  <title>Task 03_tahajawaid.com</title>
  <style>
    input {
      padding: 5px;
    }

    img {
      width: 150px;
      height: 150px;
      border-radius: 50%;
      object-fit: cover;
    }
  </style>
</head>
<body>
  <?php
  $conn = mysqli_connect("localhost", "root", "", "dbase");

  if (mysqli_connect_errno()) {
    echo "Failed to connect to MySQL: " . mysqli_connect_error();
    exit();
  }

  $id = 1;

  $sql = "SELECT name, email, img_file FROM user WHERE id = $id";
  $result = mysqli_query($conn, $sql);

  if (!$result) {
    echo "Error retrieving user data: " . mysqli_error($conn);
    exit();
  }

  $row = mysqli_fetch_assoc($result);
  if (!$row) {
    echo "No user found with ID: $id";
    exit();
  }

  $user_name = isset($row['name']) ? $row['name'] : '';
  $user_email = isset($row['email']) ? $row['email'] : '';
  $user_profile_picture = isset($row['img_file']) ? $row['img_file'] : '';

  if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $name = mysqli_real_escape_string($conn, $_POST['name']);
    $email = mysqli_real_escape_string($conn, $_POST['email']);

    $sql = "UPDATE user SET name = '$name', email = '$email' WHERE id = $id";
    $update_result = mysqli_query($conn, $sql);

    if (!$update_result) {
      echo "Error updating user data: " . mysqli_error($conn);
    }

    if (!empty($_FILES['profile_picture']['tmp_name'])) {
      $upload_folder = 'upload/';
      $file_name = $id . '_' . $_FILES['profile_picture']['name'];
      if (move_uploaded_file($_FILES['profile_picture']['tmp_name'], $upload_folder . $file_name)) {
        $sql = "UPDATE user SET img_file = '$file_name' WHERE id = $id";
        $update_picture_result = mysqli_query($conn, $sql);
        if (!$update_picture_result) {
          echo "Error updating profile picture: " . mysqli_error($conn);
        } else {
          $user_profile_picture = $file_name;
        }
      } else {
        echo "Error uploading profile picture.";
      }
    }

    header("Refresh:0");
  }
  ?>

  <h1>User Profile</h1>
  <img src="<?php echo 'upload/' . $user_profile_picture; ?>" alt="Profile Picture">
  <form method="post" enctype="multipart/form-data">
    <label for="name">Name:</label>
    <input type="text" name="name" value="<?php echo $user_name; ?>"><br><br>

    <label for="email">Email:</label>
    <input type="text" name="email" value="<?php echo $user_email; ?>"><br><br>

    <label for="profile_picture">Upload New Profile Picture:</label>
    <input type="file" name="profile_picture"><br><br>

    <input type="submit" value="Update">
  </form>

  <?php
  mysqli_close($conn);
  ?>
</body>
</html>
