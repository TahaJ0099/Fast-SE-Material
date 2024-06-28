class Animal{  
Animal(){
	System.out.println("Animal Class Constructor...");
}
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
Dog(){
	System.out.println("Dog Class Constructor...");
}

void bark(){System.out.println("barking...");}  
}  
class BabyDog extends public Dog{  
BabyDog(){
	System.out.println("BabyDog Class Constructor...");
}

void weep(){System.out.println("weeping...");}  
}  
class test2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  
