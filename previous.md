// fun main() {
    // var arr = arrayOf("a", "b", "c", "d")
    // var arr2 = arrayOf("a", "b", "c", "d")
    // println(swapper(arr2, 0, 2).joinToString())
    // var arr3 = arrayOf("a", "b", "c", "d")
    // println(swapper(arr3, 3, 1).joinToString()) // ["a", "d", "c", "b"]
    // var arr4 = arrayOf("canal", "broadway", "madison")
    // println(swapper(arr4, 1, 0).joinToString()) // ["broadway", "canal", "madison"]
// }

// # Write a method, swapper(arr, idx_1, idx_2), that accepts an array and two indices as args.
// # The method should swap the elements at the given indices and return the array.
// # The method should modify the existing array and not create a new array.

// p swapper(["a", "b", "c", "d"], 0, 2)               # => ["c", "b", "a", "d"]
// p swapper(["a", "b", "c", "d"], 3, 1)               # => ["a", "d", "c", "b"]
// p swapper(["canal", "broadway", "madison"], 1, 0)   # => ["broadway", "canal", "madison"]

// fun swapper (arr: Array<String>, idx1: Int, idx2: Int): Array<String>{
//     val temp = arr[idx1]
//     arr[idx1] = arr[idx2]
//     arr[idx2] = temp

//     return arr
// }
// fun main(){
//     // p is_sorted([1, 4, 10, 13, 15])       # => true
//     // p is_sorted([1, 4, 10, 10, 13, 15])   # => true
//     // p is_sorted([1, 2, 5, 3, 4 ])         # => false
//     var arr = arrayOf(1,2,5,3,4)
//     println(is_sorted(arr))
// }
// // # Write a method, is_sorted(arr), that accepts an array of numbers as an arg.
// // # The method should return true if the elements are in increasing order, false otherwise.
// // # Do not use the built-in Array#sort in your solution :)

// fun is_sorted(arr : Array<Int>) : Boolean {
//     for ((index) in arr.withIndex()) {
//         if (index==0) continue
//         if (arr[index] < arr[index-1]) return false
//     }
//     return true
// }

// Main.kt:38:18: warning: variable 'value' is never used
//     for ((index, value) in arr.withIndex()) {

// fun main(){
    // println("the answer is ${peak_finder(arrayOf(1,3,5,4))}")//=> [5]
    // println("the answer is ${peak_finder(arrayOf(4, 2, 3, 6, 10))}")//=> [4, 10]
    // println("the answer is ${peak_finder(arrayOf(4, 2, 11, 6, 10))}")//=> [4, 11, 10]
    // println("the answer is ${peak_finder(arrayOf(1,3))}")//=> [3]
    // p peak_finder([3, 1])               # => [3]
// }

// # Write a method, peak_finder(arr), that accepts an array of numbers as an arg.
// # The method should return an array containing all of "peaks" of the array.
// # An element is considered a "peak" if it is greater than both it's left and right neighbor.
// # The first or last element of the array is considered a "peak" if it is greater than it's one neighbor.

// fun peak_finder(arr: Array<Int>): MutableList<Int>{
//     var list1 = mutableListOf<Int>()
//     if (arr.size == 1) {
//         list1.add(arr.first())
//         return list1
//     }
//     if (arr[0] > arr[1]) list1.add(arr[0])

//     for (i in 1..(arr.size-2)){
//         if (arr[i] > arr[i - 1] && arr[i] > arr[i+1]){
//             list1.add(arr[i])
//         }
//     }
    
//     if (arr.last() > arr[arr.lastIndex-1]) list1.add(arr.last())

//     return list1
// }

// fun main(){
//     println(pow(2, 0)) //# => 1
//     println(pow(2, 1)) //# => 2
//     println(pow(2, 5)) //# => 32
//     println(pow(3, 4)) //# => 81
//     println(pow(4, 3)) //# => 64
// }

// fun pow(base : Int , exponent : Int) : Int {
//     if (exponent == 0) return 1
//     return pow(base, exponent - 1) * base
// }

// # Write a method, pow(base, exponent), that takes in two numbers.
// # The method should calculate the base raised to the exponent power.
// # You can assume the exponent is always positive.
// #
// # Solve this recursively!
// #
// # Examples:
// #
// # pow(2, 0) # => 1
// # pow(2, 1) # => 2
// # pow(2, 5) # => 32
// # pow(3, 4) # => 81
// # pow(4, 3) # => 64

// fun main(){
//     println("the answer is ${lucas_number(0)}") //   # =>    2
//     println(lucas_number(1)) //   # =>    1
//     println(lucas_number(2)) //   # =>    3
//     println(lucas_number(3)) //   # =>    4
//     println(lucas_number(5)) //   # =>    11
//     println(lucas_number(9)) //   # =>    76
// }

// fun lucas_number(num: Int): Int{
//     if (num == 0) return 2
//     if (num == 1) return 1
//     return lucas_number(num-1) + lucas_number(num-2)
// }
// # Write a method, lucas_number(n), that takes in a number.
// # The method should return the n-th number of the Lucas Sequence.
// # The 0-th number of the Lucas Sequence is 2.
// # The 1-st number of the Lucas Sequence is 1
// # To generate the next number of the sequence, we add up the previous two numbers.
// #
// # For example, the sequence begins: 2, 1, 3, 4, 7, 11, ...
// #
// # Solve this recursively!
// #
// # Examples:
// #
// # lucas_number(0)   # =>    2
// # lucas_number(1)   # =>    1
// # lucas_number(2)   # =>    3
// # lucas_number(3)   # =>    4
// # lucas_number(5)   # =>    11
// # lucas_number(9)   # =>    76

// fun main(){
//     println(sum_array(arrayOf()))             // => 0
//     println(sum_array(arrayOf(5)))            // => 5
//     println(sum_array(arrayOf(5, 2)))        // => 7
//     println(sum_array(arrayOf(4, 10, -1, 2))) // => 15
// }

// fun sum_array(arr: Array<Int>):Int{
//     if (arr.size == 0) return 0
//     if (arr.size == 1) return arr[0]
//     return sum_array(arr.copyOfRange(0, arr.size-1)) + arr[arr.size-1]
// }
// fun sum_array(arr: Array<Int>): Int {
//     if (arr.size == 0) return 0
//     val list = arr.toMutableList()
//     var deleted = list.removeAt(arr.size-1) // return the one deleted
//     return sum_array(list.toTypedArray()) + deleted
// }

// # Write a method, sum_array(array), that takes in an array of numbers.
// # The method should return the total sum of the elements.
// # 
// # Solve this recursively!
// #
// # Examples:
// #
// # sum_array([])             # => 0
// # sum_array([5])            # => 5
// # sum_array([5, 2])         # => 7
// # sum_array([4, 10, -1, 2]) # => 15

// fun main(){
//     println(reverse_string("c"))   // # => "c"
//     println(reverse_string("internet"))   // # => "tenretni"
//     println(reverse_string("friends"))   // # => "sdneirf"
//     println(reverse_string(""))   // # => ""
// }

// fun reverse_string(str : String) : String {
//     if (str.length == 0) return ""
//     var lastchar = str[str.length-1]
//     var substr = str.substring(0,str.length-1)

//     return lastchar + reverse_string(substr)
// }

// /)/ # Write a method, println(reverse_string(str), that )takes in a string.
// # The method should return the string with it's characters in reverse order.
// #
// # Solve this recursively!
// #
// # Examples:
// # 
// # println(reverse_string("")        )    # => ""
// # println(reverse_string("c")       )    # => "c"
// # println(reverse_string("internet"))    # => "tenretni"
// # println(reverse_string("friends") )    # => "sdneirf"

// fun main(){
//     var array1: Array<Any?> = arrayOf(1, 2, arrayOf(arrayOf(3,4), arrayOf(5, 6), arrayOf(7,8))) //[1, 2, [[3, 4], [5, [6]]], [7, 8]]
//     println(flatten(array1).joinToString())
// }
// fun flatten(array: Array<*>): Array<Int> {
//     var arrList = mutableListOf<Int>()
//     for (el in array) {
//         if (el is Int) {
//             arrList.add(el)
//         } else if (el is Array<*>) {
//             var flattend = flatten(el)
//             for (el2 in flattend) {
//                 arrList.add(el2)
//             }
//         }
//     }
//     return arrList.toTypedArray()
// }

// []
// [1,[2,],1] => [1,2,1]
// [1,[2,2,3],1] => [1,2,2,3,1]

// flatten([2, [2 ,[3]]]) => 

// # A 1-dimensional array is also known as a flattened array.
// # Write a method, flatten(data), that accepts a single argument. The
// # method should take in an array of any dimension and return the flattened
// # version of that array. Solve this recursively.
// #   
// # Hint:
// #  - if the argument is not an array, then we have reached the base case
// #  - look up the documentation for how to check if data is an array or not
// #
// # Examples:
// #
// # array_1 = [1, 2, [[3, 4], [5, [6]]], [7, 8]]
// # flatten(array_1)      # => [ 1, 2, 3, 4, 5, 6, 7, 8 ]
// #
// # array_2 = ['this', ['problem', 'is'], [['pretty', 'tough'], [[':)']]]]
// # flatten(array_2)      # => [ 'this', 'problem', 'is', 'pretty', 'tough', ':)' ]
// #
// # flatten('base case')  # => [ 'base case' ]
// #
// # Another Hint:
// #
// # From the last example, you may be confused. We said that the method takes
// # in an array as an arg, but we passed it a string?
// # If data is not an array, then we can consider it as a 0-dimensional array.
// #     0-dimensional array: 'some data'
// #     1-dimensional array: ['some data']
// #     2-dimensional array: [['some data']]
// #     3-dimensional array: [[['some data']]]

////////////////// OCT 3 2020
// fun main(){
//     println(baseConverter(5, 2)) // 101
//     println(baseConverter(1239449, 16)) // 12e999
//     println(baseConverter(0, 16)) //0
//     println(baseConverter(0, 2)) //0
// }
// fun baseConverter(num: Int, base: Int): String{
//     if (num<base) return num.toString()
//     var remainder = num%base
//     var quotient = num/base
//     var map = arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8","9","a", "b", "c", "d", "e", "f")
//     return baseConverter(quotient, base) + map[remainder]
// }

fun main(){
    println(anagrams("abc", "cba")) // true
    println(anagrams("abc", "aba")) // false
    println(anagrams("abc", "cbaa")) // false
    println(anagrams("aiuwehfxzxcvmneowieurahsde","nsewceaerihfawzueouxdihmxv")) // true
    println(anagrams("aiuwehfxzxcvmneowieurahsde", "nsewceaerihfawzueouxdihmxw")) //false)
}

fun anagrams(str1: String, str2: String): Boolean{
    var bool = true
    var countMap = hashMapOf<Char, Int?>()
    // var countMap: MutableMap<Char, Int?> = HashMap()
    // var countMap = mutableMapOf<Char, Int>()

    for (char1 in str1){
        // countMap.putIfAbsent(char1, 0)
        // if (countMap[char1] == null) countMap[char1] = 0
        if (countMap.containsKey(char1)){
            countMap[char1] = countMap[char1]!! + 1
        } else {
            countMap[char1] = 1
        }

        // if (countMap[char1] == null){
        //     countMap[char1] = 0
        // }
        // countMap[char1] = countMap[char1] + 1 // here
    }
    for (char2 in str2){
        countMap.putIfAbsent(char2, 0)
        countMap[char2] = countMap[char2]!! - 1
    }
    // check every value in map is 0
    for ((key, value) in countMap){
        if (value != 0){
            bool = false
        }
    }
    return bool
}
