 <?php  include "header.php" ?>

<?php 
     if(isset($_GET['del']))
     {
         $userid= $_GET['del'];
         $query = "DELETE FROM user WHERE id = {$id}"; 
         $delete_query= mysqli_query($conn, $query);
         header("Location: home.php");
     }
?>