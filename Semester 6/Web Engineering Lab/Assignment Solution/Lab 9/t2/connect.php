<?php

$conn= mysqli_connect("localhost","root","","d");
if(!$conn)
{
    echo"not connect";
}
else{
    echo"connected";
}

?>