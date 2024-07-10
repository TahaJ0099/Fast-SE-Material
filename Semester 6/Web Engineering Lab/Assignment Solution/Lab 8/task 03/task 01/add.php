<?php
include ('connect.php');

$id=$_POST['id'];
$password=$_POST['password'];

$sql= "INSERT INTO user (id,password) VALUES ('$id','$password')";

if(mysqli_query($conn,$sql)) 
{
    echo"user added";
}
else{
    echo"user not added";
}

mysqli_close($conn);

?>