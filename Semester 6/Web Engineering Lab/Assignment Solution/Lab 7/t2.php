<?php
echo("Done by Taha Jawaid 21k-3881");
echo nl2br("\n");
$a=3;
$b=2;
function func($a,$b){
    $add=$a+$b;
    $mul=$a*$b;
    $div=$a/$b;
    $sub=$a-$b;
    
    echo nl2br("Addition = ".$add."\n");
    echo nl2br("Subtraction = ". $sub."\n");
    echo nl2br("Multiplication = ".$mul."\n");
    echo("Divison = ".$div."\n");
}
func($a,$b);
?>