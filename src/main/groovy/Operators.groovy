//arithmetic operator
assert 10+1 == 11
assert 8*8 ==64
assert 8%2 ==0
assert 2**3 ==8
assert 9.div(3) ==3


//unary operator
assert +3 == 3


//increment
int i=10
println(i++)
println(i)

def a=2
def b=a++ * 3
assert a==3 & b==6


//assignment arithmetic operator
def r=4
r+=3 //r=4+3;
println("r+=3-->r=r+3-->+$r")
assert r==7

//relational operators
assert 1+2 ==3
assert 1!=2
assert 2<3
assert 4>2

//logical operators
boolean e=true
assert e
assert e==true
assert true && true
assert true || false&&true

//conditional operators

assert (!true)==false
assert(!'')==true

