<?php

include ("connect.php");

$id=$_POST['id'];

$sql="delete from user where id='$id'";

if(mysqli_query($conn,$sql)) 
{
    echo"user deleted";
}
else{
    echo"user not deleted";
}

mysqli_close($conn);


?>