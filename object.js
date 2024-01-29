emp={id:5,name:"devi",salary:40000}
document.write(emp.id+" "+emp.name+" "+emp.salary) ;
document.write("<br>") ;

var emp=new Object();
emp.id=9;
emp.name="priya";
emp.salary=50000;
document.write(emp.id+" "+emp.name+" "+emp.salary);
document.write("<br>") ;

function emp1(id,name,salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
}
e= new emp1(7,"sree",6000);

document.write(e.id+" "+e.name+" "+e.salary);
document.write("<br>") ;

let user = {
    name: "John",
    age: 30,
    isAdmin : true ,
};
    document.write(user.age+", "+user.name+", "+user.isAdmin);
    document.write("<br>") ;
    delete user.age;

    let use = {
        name: "John",
        age: 30,
        isAdmin: true
        };
        for (let key in use)
        {
         document.write(key);
         
        }
        document.write("<br>") ;