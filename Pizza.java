//WAJP to create a enum called size which indicates the pizza small, medium ,large,monster. Create a class called test which has an instance of size, constuctor, a method called orderPizza which has a switch statement having the case 
//labels of enum size. A driver class called main method creates an instance of test and orders pizza.

enum size{
small,medium,large,monster
}

class test{
size ps;
public test(size pizzaSize){
this.ps=pizzaSize; 
}
public void orderPizza(){
switch(ps){
case small: System.out.println("I will have a small pizza");
break;
case medium: System.out.println("I will have a medium pizza");
break;
case large: System.out.println("I will have a large pizza");
break;
case monster: System.out.println("I will have a monster pizza");
break;
default:System.out.println("Error, choose a valid option");
}
}
}

class Pizza{
public static void main(String args[]){
size s=size.monster;
test t = new test(s);
t.orderPizza();
}
}
