var date = new Date();
var day = date.getDate();
var month = date.getMonth() + 1;
var year = date.getFullYear();
document.write("<br>Date is: " + day + "/" + month + "/" + year);
document.write("<br>");

var today = new Date();
var h = today.getHours();
var m = today.getMinutes();
var s = today.getSeconds();
document.write(h + "," + m + "," + s);
document.write("<br>");

var a = date.getDay();
document.write(a);
document.write("<br>");

var b = date.getHours();
document.write(b);
document.write("<br>");

var c = date.getMinutes();
document.write(c);
document.write("<br>");

var d = date.getTime();
document.write(d);
document.write("<br>");

