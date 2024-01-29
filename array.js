let arr = ["apple", "orange", "grapes"];
for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}
document.write("<br>");

var emp = new Array();
emp[0] = "amal";
emp[1] = "arun";
emp[2] = "arjun";
emp[3] = "kavya";
alert(emp[2]);
console.log(emp[1]);
document.write(emp);
document.write("<br>");

var n = emp.indexOf("arjun");
document.write(n);
document.write("<br>");

var a = emp.pop();
document.write(emp);
document.write("<br>");

var b = emp.push("raju");
document.write(emp);
document.write("<br>");

var empy = arr.concat(emp);
document.write(empy);
document.write("<br>");

var d = emp.slice();
document.write(d);
document.write("<br>");

var e = emp.sort();
document.write(e);
document.write("<br>");
var f = emp.reverse();
document.write(f);
document.write("<br>");
document.write("<br>");

let home = ["flat", "villah", "hut", "banglaw"];
for (let key in home) {
    alert(home[key]);
}

function User(name) {
    this.name = name;
    this.isAdmin = false;
}

let user = new User("Jack");
alert(user.name);
alert(user.isAdmin);

function BigUser() {
    this.name = "John";
    return { name: "Godzilla" };
}
document.write(new BigUser().name)

function User(name) {
    this.name = name;
    this.sayHi = function () {
        alert("My name is: " + this.name);
    };
}
let john = new User("John");
john.sayHi();
