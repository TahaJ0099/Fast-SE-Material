<?php include "header.php"?>

  <div class="container">
    <h1 class="text-center" >Data to perform CRUD Operations</h1>
      <a href="create.php" class='btn btn-outline-dark mb-2'> <i class="bi bi-person-plus"></i> Create New User</a>

        <table class="table table-striped table-bordered table-hover">
          <thead class="table-dark">
            <tr>
              <th  scope="col">ID</th>
              <th  scope="col"> Password</th>
              <th  scope="col" colspan="3" class="text-center">CRUD Operations</th>
            </tr>
          </thead>
            <tbody>
              <tr>
 
          <?php
          session_start();
          if(isset($_COOKIE['last_visited_page'])) {
            $last_page = $_COOKIE['last_visited_page'];
            echo "<a href='$last_page'>$last_page</a>";
          }
        
          if(isset($_SESSION['id']) && isset($_SESSION['password'])){
            $query="SELECT * FROM user";               
            $view_users= mysqli_query($conn,$query);    

            while($row= mysqli_fetch_assoc($view_users)){
              $id = $row['id'];                
              $password = $row['password'];        

              echo "<tr >";
              echo " <th scope='row' >{$id}</th>";
              echo " <td >{$password} </td>";

              echo " <td class='text-center'> <a href='view.php?user_id={$id}' class='btn btn-primary'> <i class='bi bi-eye'></i> View</a> </td>";

              echo " <td class='text-center' > <a href='update.php?edit&user_id={$id}' class='btn btn-secondary'><i class='bi bi-pencil'></i> EDIT</a> </td>";

              echo " <td  class='text-center'>  <a href='del.php?delete={$id}' class='btn btn-danger'> <i class='bi bi-trash'></i> DELETE</a> </td>";
              echo " </tr> ";
              }
          }
          else{
              header("Location: login.php");
              exit();
          }
             
                ?>
              </tr>  
            </tbody>
        </table>
  </div>
