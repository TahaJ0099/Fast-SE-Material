<?php
$conn = mysqli_connect("localhost", "root", "", "db_11");
if (!$conn) {
    echo "not connect";
} else {
    echo "connected";
}
?>