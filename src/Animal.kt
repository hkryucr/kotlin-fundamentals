//class Animal {
//    fun speak(){
//        println("aww!")
//    }
//}

//class Dog {
//    fun speak(){
//        println("aww!")
//    }
//}

interface Animal {
    fun speak (){
        print("meww")
    }
    fun eat (){

    }
    fun breed (){
        println("lay eggs")
    }
}

class Mammal: Animal {
    override fun breed() {
        println("give a birth")
    }
}

class Cat : Animal by Mammal() {
    
}

// class instance
fun main() {
    var kitty = Cat()
    kitty.breed()
    kitty.speak()
//    var doggy = Dog()
//    doggy.speak()
    print("Write any number: ")

    val number = Integer.valueOf(readLine())
    println("The entered number is: $number")

}