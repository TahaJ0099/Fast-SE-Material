<?php
echo("Done by Taha Jawaid 21k-3881");
echo nl2br("\n");  
$num = 0;  
$a = 0;  
$b = 1;  
$sum = 0;
echo "Fibonacci series 45 numbers are : ";
echo nl2br("\n");
echo ($a.' , '.$b.' , ');  

while ($num < 43)  {
    $c = $b + $a;  
    echo ($c.' , ');  
    if ($c % 3 == 0 && $c % 5 == 0 && $c % 7 == 0) {
        $sum += $c;
    }
    $a = $b;  
    $b = $c;  
    $num++;
}

echo nl2br("\nSum of Fibonacci numbers divisible by 3, 5, and 7 only = " . $sum);
?>
