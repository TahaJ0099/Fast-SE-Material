<?php
echo("Done by Taha Jawaid 21k-3881");
echo nl2br("\n");
function recursive_search($arr, $left, $right, $x){
if($right < $left){
return -1;
}
if($arr[$left] == $x) {
return $left;}
if($arr[$right] == $x) {
return $right; }
 return recursive_search($arr, $left+1, $right-1, $x); 
}
$arr = array (5, 4, 3, 2, 1, 6, 10, 9, 7, 8);
$n = count($arr);
$x = 8;
$result = recursive_search($arr, 0, $n-1, $x);
if($result == -1){
echo("Element is not present.");
}
 else{
echo("Position = " . $result);
}
?>