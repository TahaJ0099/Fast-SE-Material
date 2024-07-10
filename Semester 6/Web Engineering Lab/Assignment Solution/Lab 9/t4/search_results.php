<?php
include 'connect.php';

$results_per_page = 10;

if (isset($_GET['page'])) {
    $page = $_GET['page'];
} else {
    $page = 1;
}

$offset = ($page - 1) * $results_per_page;

if (isset($_GET['query'])) {
    $search_query = $_GET['query'];

    $sql = "SELECT * FROM user WHERE id LIKE '%$search_query%' LIMIT $offset, $results_per_page";
    $result = mysqli_query($conn, $sql);

    echo "<h2>Search Results</h2>";
    echo "<table border='1'>";
    while ($row = mysqli_fetch_assoc($result)) {
    }
    echo "</table>";

    $sql = "SELECT COUNT(*) AS total FROM user WHERE id LIKE '%$search_query%'";
    $result = mysqli_query($conn, $sql);
    $row = mysqli_fetch_assoc($result);
    $total_pages = ceil($row['total'] / $results_per_page);

    echo "<br><br> Pages: ";
    for ($i = 1; $i <= $total_pages; $i++) {
        echo "<a href='search_results.php?page=$i'>$i</a> ";
    }
}

?>
