<?php

$conn= mysqli_connect("localhost","root","","db");
if(!$conn)
{
    echo"not connect";
}
else{
    echo"connected";
}

?>