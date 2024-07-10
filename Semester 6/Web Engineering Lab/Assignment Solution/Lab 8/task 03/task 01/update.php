<?php
include ('connect.php');

$id=$_POST['id'];
$password=$_POST['password'];

$sql= "update user set password='$password' where id='$id'";

if(mysqli_query($conn,$sql)) 
{
    echo"user updated";
}
else{
    echo"user not updated";
}

mysqli_close($conn);

?>