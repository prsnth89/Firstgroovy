def name = "Prasanth"; //def keyword helps in defining variable name

println "My name is ${name}" //double quote will print the variable name

println 'My name is ${name}' //single quote will print as it is

name=10999

println name; //dynamically typed

//def Name2="Test";
//println name2; //wont execute since groovy is case sensitive

println('Defining multiple arrays and its types')
def (int a, double b, String c) =[10,20, "arr-prasanth"]
println a
println b
println c

//case1 -if variable is  declared but didnt define the value then it will be ignored
println('case1 -if variable is  declared but didnt define the value then it will be ignored')
def(tt,uu,vv) =[55,77]
println tt
println uu
println vv //will get null value

//case2-if variable is  not but defined the value then it will not throw error
println('case2-if variable is  not but defined the value then it will not throw error')
def(int x,String y) =[999,"YY",333]
println x
println y
