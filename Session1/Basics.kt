
var myVariable="Hello" //Mutable Type
myVariable="Hola" 

val  myVariable1="Good Evening" //Immutable Type
println(myVariable1.toUpperCase())

for (char in myVariable1) //Using For Loop to extract the characters from the Variable
    {println(char)}

//To find out if the variable Contains Something
val Contains=myVariable1.contains("good")
  println(Contains)


//Type Inference done Explicitly 

var boolVariable:Boolean=true
println("the value entered is $boolVariable")

//Arithmetic operators

fun main() {
	val x=6
	val y=99
	println(x>y)
	println(x==y)
	println(x<y)
	println(x!=y)
}

//If- Else Blocks

fun main() {
	val num=5
	if (num >5)
	println("$num is greater than 5")
    else if (num<5)
	println("$num is smaller than 5")
	else
	println("number is equal to 5")
}

//Assigning If-Else values to an another variable

fun main() {
	val x=5
    val y=6
    val z=if(x==y) 7 else 8
	println(z)
}

//While Block 


fun main() {
	var x=5
    while (x>1)
    {
    println("X value is $x")
    x--
	}
    
println("Done")
}

