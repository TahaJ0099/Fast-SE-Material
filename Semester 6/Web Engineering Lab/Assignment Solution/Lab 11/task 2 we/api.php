<?php
include('db.php');
$action = $_GET["action"];

if ($action == "create-user") {

    $name = $_POST['name'];
    $email = $_POST['email'];
    $password = $_POST['password'];

    $query = "INSERT INTO user (name, email, password) VALUES ('$name', '$email', '$password')";
    $result = mysqli_query($conn, $query);


    $response = array(
        "error" => true,
        "message" => "User cannot be added successfully!"
    );

    if ($result) {
        $response['error'] = false;
        $response['message'] = "User added successfully!";
    }
        echo json_encode($response);
        die();
    } else if($action == "login-user"){
        $email = $_POST['email'];
    $password = $_POST['password'];

    $query = "Select * from user where email = '$email' and password = '$password'";
    $result = mysqli_query($conn, $query);

    if($result->num_rows > 0){
        $userRow = $result -> fetch_assoc();
        $response['error'] = false;
        $response['message'] = "User logged in successfully!";
        $response['data'] = $userRow;
    } else{
        $response['error'] = true;
        $response['message'] = "Incorrect email or password!";  
    }
        echo json_encode($response);
        
    } else if($action == "get-user-details"){
        $user_id = $_POST['user-id'];
        
        $query = "Select * from user where id = $user_id";
    $result = mysqli_query($conn, $query);

    if($result->num_rows > 0){
        $userRow = $result -> fetch_assoc();
        $response['error'] = false;
        $response['message'] = "User Found!";
        $response['data'] = $userRow;
    } else{
        $response['error'] = true;
        $response['message'] = "User notfound!";  
    }
    echo json_encode($response);
    } else if($action == 'get-products'){
        $query = "select * from products";
        $result = mysqli_query($conn, $query);
        if($result->num_rows > 0){
        $response['error'] = false;
        $response['message'] = $result->num_rows . "Products Found!";
        while($row = $result->fetch_assoc()){
            $products[]=$row;
        }
        $response['data'] = $products;
        }
        else{
            $response['error'] = true;
            $response['message'] = "No Products found!"; 
        }
        echo json_encode($response);
    }
    

    exit();
?>
