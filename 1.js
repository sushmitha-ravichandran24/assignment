// var fn =() => 'response';  // arrow function
var fn = function () {
    return ' response';
};
var abc;
abc = 10;
abc = " helo0";
var def;
def = " hello";
def = 20;
var myArr;
myArr = [1, 3, "dfdf"];
var empId;
var isIndian;
var say;
empId = " hello";
function greet() {
    return "Hello";
}
var greeting = greet(); //same line declaration
greeting = 2; // not possible
console.log(greeting);
var greetHello;
greetHello = greet();
greetHello = 2; // any data types 
console.log(greeting);
//  --------------any type----------------------
var burger; // loosely type / loosely structured 
burger = "dominos";
burger = 2;
burger = true;
// ------------union type-------------
var isBurger;
isBurger = "dominos";
isBurger = true;
isBurger = 2;