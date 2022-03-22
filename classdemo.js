var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    // constructor(){
    //     this.firstName = '';
    //     this.lastName = ' ';
    // }
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.getFullName = function () {
        return this.lastName + this.firstName;
    };
    Person.prototype.greet = function () {
        console.log("saying good morning");
    };
    return Person;
}());
;
// var objectPerson = new Person("captain","america");
// // objectPerson.firstName = "hulk";
// console.log(objectPerson.firstName);
// console.log(objectPerson.lastName);
// var fullName = objectPerson.getFullName();
// console.log(fullName);
var Programmer = /** @class */ (function (_super) {
    __extends(Programmer, _super);
    function Programmer() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Programmer.prototype.greet = function () {
        console.log("saying good afternoon"); //overriding +dominant(1st priority)
    };
    Programmer.prototype.greetLikeNormalPeople = function () {
        // this.greet();//afternoon
        _super.prototype.greet.call(this); // morning -> parent
    };
    return Programmer;
}(Person));
var objectProgrammer = new Programmer("captain", "america");
objectProgrammer.greetLikeNormalPeople();
// objectProgrammer.
var checkType;
checkType = new Programmer("cheese", "pizza");