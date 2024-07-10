<?php
echo("Done by Taha Jawaid 21k-3881");
echo nl2br("\n");
$txt = "Hello world!";
$x = 5;
$y = 10.5;

echo $txt;
echo "<br>";
echo $x;
echo "<br>";
echo nl2br($y."\n");

echo nl2br("\nArithmetic Operators + - * / % **    :");
echo nl2br("\n");
$x = 10;
$y = 6;
echo $x + $y;
echo "<br>";
echo $x - $y;
echo "<br>";
echo $x * $y;
echo "<br>";
echo $x / $y;
echo "<br>";
echo $x % $y;
echo "<br>";
echo $x ** $y;
echo nl2br("<br>\n");

echo nl2br("Assignment Operators = += -= = /= %= *=    :\n");

$x = 10;
$x += 5;
echo $x;
echo "<br>";

$x = 10;
$x -= 5;
echo $x;
echo "<br>";

$x = 10;
$x *= 5;
echo $x;
echo "<br>";

$x = 10;
$x /= 5;
echo $x;
echo "<br>";

$x = 10;
$x %= 5;
echo $x;
echo "<br>";

$x = 10;
$x **= 5;
echo $x;
echo nl2br("<br>\n");

echo nl2br("Comparison Operators == != > < >= <= === !==    :\n");

$x = 10;
$y = 10;
var_dump($x == $y);
echo "<br>";
var_dump($x != $y);
echo "<br>";
var_dump($x > $y);
echo "<br>";
var_dump($x < $y);
echo "<br>";
var_dump($x >= $y);
echo "<br>";
var_dump($x <= $y);
echo "<br>";
var_dump($x === $y);
echo "<br>";
var_dump($x !== $y);
echo nl2br("<br>\n");

echo nl2br("Increment and Decrement Operators  ++ --     :\n");
$x = 10;
echo ++$x;
echo "<br>";
echo $x++;
echo "<br>";
echo $x;
echo "<br>";
echo --$x;
echo "<br>";
echo $x--;
echo "<br>";
echo $x;
echo nl2br("<br>\n");

echo nl2br("Logical Operators and && or || xor !     :\n");

$x = 10;
$y = 20;
var_dump($x < 20 and $y > 10);
echo "<br>";
var_dump($x < 20 && $y > 10);
echo "<br>";
var_dump($x < 20 or $y > 10);
echo "<br>";
var_dump($x < 20 || $y > 10);
echo "<br>";
var_dump($x < 20 xor $y > 10);
echo "<br>";
var_dump(!($x < 20 and $y > 10));
echo nl2br("<br>\n");

echo nl2br("String Operators . .=    : \n");

$x = "Hello";
$y = "World";
echo $x . $y;
echo "<br>";
echo $x .= $y;
echo nl2br("<br>\n");

echo nl2br("Array operators + == === != !==     :\n");

$x = array("a" => "red", "b" => "green");
$y = array("c" => "blue", "d" => "yellow");
var_dump($x + $y);
echo "<br>";
var_dump($x == $y);
echo "<br>";
var_dump($x === $y);
echo "<br>";
var_dump($x != $y);
echo "<br>";
var_dump($x !== $y);
echo nl2br("<br>\n");

echo nl2br("Conditional statements  if else elseif    : \n");

$t = date("H");

if ($t < "20") {
  echo "Have a good day!";
}
echo nl2br("\n");
echo nl2br("\n");
echo nl2br("Switch    :\n");

$favcolor = "red";

switch ($favcolor) {
  case "red":
    echo "Your favorite color is red!";
    break;
  case "blue":
    echo "Your favorite color is blue!";
    break;
  case "green":
    echo "Your favorite color is green!";
    break;
  default:
    echo "Your favorite color is neither red, blue, nor green!";
}

echo nl2br("\n");
echo nl2br("\n");
echo nl2br("While Loop    :\n");
$x = 1;
while ($x <= 5) {
  echo "The number is: $x <br>";
  $x++;
}
echo nl2br("\n");
echo nl2br("\n");
echo nl2br("Do While Loop   :\n");
$x = 1;
do {
  echo "The number is: $x <br>";
  $x++;
} while ($x <= 5);
echo nl2br("\n");
echo nl2br("\n");
echo nl2br("for Loop    :\n");
for ($x = 0; $x <= 10; $x++) {
  echo "The number is: $x <br>";
}
echo nl2br("\n");
echo nl2br("\n");
echo nl2br("for each Loop    :\n");
$colors = array("red", "green", "blue", "yellow");
foreach ($colors as $value) {
  echo "$value <br>";
}