
// ALL ABOUT KOTLIN BASICS ❤️//

var myVariable="Hello" //Mutable Type
myVariable="Hola" 
print(myVariable.reversed()) //To Reverse a String

val  myVariable1="Good Evening" //Immutable Type
println(myVariable1.toUpperCase())

for (char in myVariable1) //Using For Loop to extract the characters from the Variable
    {println(char)}

//To find out if the variable Contains Something
val Contains=myVariable1.contains("good")
  println(Contains)



/////////////////////////////////////////////////////////////////////////////////////////
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


/////////////////////////////////////////////////////////////////////////////////////////
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


/////////////////////////////////////////////////////////////////////////////////////////
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

/////////////////////////////////////////////////////////////////////////////////////////
// Ranges in Kotlin
for (i in 5..10)
println(i)

for (i in 10 downTo 5 step 2) // Top-Down implementation
println(i)

/////////////////////////////////////////////////////////////////////////////////////////
// Array Implementation (Arrays are Mutable in Nature)

fun main() {
	val names=arrayOf("Kotlin","Python","Dart","Java")
//     for (name in names)
//     {
//         println(name)
//     }
//  
	
// Doing the same thing using While Block
 val arrayLength=names.size
    var i=0
    while(i<arrayLength){
        println(names[i])
        i++
    }
}

//Find the Greates Number from an Array

fun main() {
	val nums=arrayOf(1,2,3,65,5,666,32,1111,2,3)
    var max=nums[0]
    
    for (i in nums)
    {
        if(i>max)
        max=i
    }
    println(max)

    }

// ARRAYS ARE MUTABLE
fun main() {
	val nums=arrayOf(1,2,3,65,5,666,32,1111,2,3)

nums[4]=999
    for (i in nums)
    {
        println(i)

    }
    
}


/////////////////////////////////////////////////////////////////////////////////////////
// LISTS ARE IMMUTABLE

fun main() {
	val nums=listOf(1,2,3,65,5,666,32,1111,2,3) //Immutable in nature

nums[4]=999
    for (i in nums)
    {
        println(i)

    }
    
}

/////////////////////////////////////////////////////////////////////////////////////////
//We can make List Mutable By making it "mutableListOf"
fun main() {
	val nums=mutableListOf(1,2,3,65,5,666,32,1111,2,3) //Mutable in nature

nums[4]=999
nums.add(333) //Difference between Array and Mutable list
    for (i in nums)
    {
        println(i)

    }
    
}


/////////////////////////////////////////////////////////////////////////////////////////
//Map
fun main() {
	val map=mapOf(1 to "a", 2 to "b", 3 to "c")
     map.forEach { (key, value) -> println("$key = $value") }
     println(map)
}

/////////////////////////////////////////////////////////////////////////////////////////
//When (Similar to Switch Case in C Program)
fun main() {
	val age=4
    
    when(age)
    {
        in 1..17 -> println("You can't Vote Now")
        18-> println("You are Finally 18")
        else ->println("You can legally vote right Now")
    }
}


/////////////////////////////////////////////////////////////////////////////////////////
//FUNCTIONS

fun main() {
	
  callName() 
  }

fun callName(){
    println("Android is Awesome")
}

//Alternatively we can define Single Line Functions as 

fun callName()= println("Android is Awesome")

//Return Type of Integer Example

fun main() {
	
  println(callName() )
  }

fun callName():Int= 3

//Return Type of String Example


fun main() {
	
  println(callName() )
  }

fun callName():String= "red"

//Parameterized Functions
fun main() {
	
  print(multiply(3,5))
  }

//Single Expression Function Definition
// fun multiply(a:Int , b:Int ):Int = a*b 

fun multiply(a:Int , b:Int ):Int {
return a*b
}
    
/////////////////////////////////////////////////////////////////////////////////////////
//DEFAULT ARGUMENT

fun main() {
	
  print(multiply())
  }

//Default Parameter

fun multiply(a:Int =2, b:Int =8):Int {
return a*b
}


/////////////////////////////////////////////////////////////////////////////////////////
//NAMED ARGUMENT
fun main() {
	
  println(multiply(c=3,b=2,a=1))
  }

//Named Parameter

fun multiply(a:Int =2, b:Int =8,c:Int=5 ):Int {
return a*b-c
}


/////////////////////////////////////////////////////////////////////////////////////////
//List uses in Argument
fun main() {
	val nums=listOf(3,6,7)
  multiply(c=nums,b=2,a=1)
  }

//Named Parameter

fun multiply(a:Int =2, b:Int =8,c:List<Int> ) {
c.forEach{c->
    println(a*b-c)
}
}


////////////////////////////////////////////////////////////////////////////////////////
//VARARG

fun main() {
	
 val max=getMax(1,2,356,66,4444)
 println(max)
  }


fun getMax(vararg nums:Int ):Int {
    var max=nums[0]
    for (num in nums)
    {
        if (num>max)
        max=num
    }
    return max

}


////////////// Another Example //////////////////////

fun main() {
	
  var result=multiply(1,2,3,4,5,6,7,8)
  println(result)
}



fun multiply(vararg nums:Int ):Int {
    var res=1
    for (num in nums)
    {res=res*num}
    return res
}

////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////CLASSES//////////////////////////////////////////////

fun main() {
	
  val Area1=Rectangle(7.0,9.0).area()
  println(Area1)
  
}

//Class Definiton


class Rectangle(val a:Double,val b:Double){
    init{println("Rectangle created with length :$a and breadth :$b")}
    fun area()=a*b
    
}



