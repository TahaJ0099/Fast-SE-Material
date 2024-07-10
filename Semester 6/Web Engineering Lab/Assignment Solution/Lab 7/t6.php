<?php
echo("Done by Taha Jawaid 21k-3881");
echo nl2br("\n");
echo nl2br("By swich statement:");
$a=1; 
$b = 5; 
$c = 6;
$delta = $b*$b - 4*$a*$c; 

switch (true) { 
case ($delta < 0):

echo ("No real roots exist.");
break;
case ($delta == 0):
$x = (-$b)/(2*$a);
echo ("The equation has a single root: x= $x");
break;
default:
$x1= (-$b + sqrt($delta))/(2*$a);

$x2 = (-$b - sqrt($delta))/(2*$a);

echo nl2br("\nroot equation: x1 = $x1 and x2 = $x2");
break;
}
echo nl2br("\n");
echo nl2br("\n");
echo nl2br("By if-else statements");

echo nl2br("\n");

if ($delta < 0) {

echo ("No real roots exist.");
} 
else if ($delta == 0) {  
    $x(-$b)/(2*$a);
echo ("The equation has a single root: x = $x");

} 
else {
$x1 = (-$b+sqrt($delta))/(2*$a);
$x2 = (-$b-sqrt($delta))/(2*$a);
 echo ("root equation x1 = $x1 and x2 = $x2");
}
?>