//conditions
int f=3
if(f>5){
    println("E is greater than 5---Value of e--$f")
}else if(f>6){
    println("E is greater than 6---Value of e--$f")
}else{
    println("E is lesser than 5---Value of e--$f")
}


//using ternary operator -similar to streams
def result=(f>5) ? "Ternary--E is greater than 5--value of e $f" : "Ternary--E is lesser than 5 value of e $f"
println(result)


//switchcase

def x=10
switch (x){
    case 10:
        println("Value of x is $x")
        break;
    case 20:
        println("Value of x is $x")
        break;

    default:
        print("Value of x --$x--is not specified in list")
}
