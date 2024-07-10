<?php  include "header.php" ?>
<?php 
  if(isset($_POST['add'])) 
    {
        $user = $_POST['id'];
        $pass = $_POST['pass'];
        $query= "INSERT INTO user(id, password) VALUES('{$id}','{$password}')";
        $add_user = mysqli_query($conn,$query);
 
          if (!$add_user) {
              echo "something went wrong ". mysqli_error($conn);
          }

          else { echo "<script type='text/javascript'>alert('User added successfully!')</script>";
              }         
    }
?>
<h1 class="text-center">Add User details </h1>
  <div class="container">
    <form action="" method="post">
      <div class="form-group"><?php include "header.php"; ?>

<?php 
  if(isset($_POST['add'])) {
    $user = $_POST['id'];
    $pass = $_POST['pass'];
      
    $query= "INSERT INTO user(id, password) VALUES('{$id}','{$password}')";
    $add_user = mysqli_query($conn,$query);

    if (!$add_user) {
      echo "something went wrong ". mysqli_error($conn);
    } else {
      echo "<script type='text/javascript'>alert('User added successfully!')</script>";
    }         
  }
?>

<h1 class="text-center">Add User details </h1>
<div class="container">
  <form action="" method="post">
    <div class="form-group">
      <label for="user" class="form-label">id</label>
      <input type="text" name="id"  class="form-control">
    </div>

    <div class="form-group">
      <label for="pass" class="form-label">Password</label>
      <input type="password" name="pass"  class="form-control">
    </div>    

    <div class="form-group">
      <input type="submit"  name="create" class="btn btn-primary mt-2" value="submit">
    </div>
  </form> 
</div>

<div class="container text-center mt-5">
  <a href="home.php" class="btn btn-warning mt-5"> Back </a>
</div>

        <label for="user" class="form-label">id</label>
        <input type="text" name="id"  class="form-control">
      </div>

    
      <div class="form-group">
        <label for="pass" class="form-label">Password</label>
        <input type="password" name="pass"  class="form-control">
      </div>    

      <div class="form-group">
          <input type="submit"  name="create" class="btn btn-primary mt-2" value="submit">
      </div>
    </form> 
  </div>
  <div class="container text-center mt-5">
    <a href="home.php" class="btn btn-warning mt-5"> Back </a>
  <div>
