// fun main(){
//     println(bubbleSort(mutableListOf<Int>(5, 3, 4, 2, 1, 7, 8, 9, 6, 10)))
// }

// fun bubbleSort(arr: MutableList<Int>): MutableList<Int>{    
//     for (endIdx in arr.indices.reversed()){
//         var sort: Boolean = true
//         for (idx in 0..endIdx-1){
//             if (arr[idx] > arr[idx+1]) {
//                 val temp = arr[idx+1]
//                 arr[idx+1] = arr[idx]
//                 arr[idx] = temp
//                 sort = false
//             }
//         }
//         if (sort) break
//     }

//     return arr
// }

// 1) create a boolean variable 'sort' which checks if the lift is sorted and set it equal to false
// 2) while sort is false, fisrt set sort = true & end = list.length-1 and iterate through the list and compare the current and next index and see if next > current
// 3) if current > next then swap the two and set sort = false
// 4) return list

// fun main (){
//     println(binarySearch(mutableListOf(1,2,3,4,5,9,10,15,18),15)) // 7
//     println(binarySearch(mutableListOf(1,2,3,4,5,9,10,15,18),11)) // -1
//     println(binarySearch(mutableListOf(1,2,3,4,5,9,10,15,18),0)) // -1
//     println(binarySearch(mutableListOf(1,2,3,4,5,9,10,15,18),1)) // 0
// }

// fun binarySearch(inputList: List<Int>, target: Int) : Int {
//     var left = 0
//     var right = inputList.size-1
//     while (left <= right){
//         var mid = left + (right-left)/2
//         if (inputList[mid]==target) return mid
//         else if (inputList[mid]>target) right = mid - 1
//         else left = mid + 1        
//     }
//     return -1
// }
//               0 1 2 3 4 5 6  7  8 
// mutableListOf(1,2,3,4,5,9,10,15,18),18)

// fun binarySearch(inputList: List<Int>, target: Int): Int {
//     if(inputList.size == 0) return -1
//     var mid = (inputList.size-1) / 2 
//     if (inputList[mid] == target){
//         return mid 
//     } else if (inputList[mid] > target){
//         return binarySearch(inputList.slice(0..mid-1), target)
//     } else {
//         var outcomeFromBS = binarySearch(inputList.slice(mid+1..inputList.size-1), target)
//         if (outcomeFromBS == -1) {
//             return outcomeFromBS
//         } else {
//             return mid+1 + outcomeFromBS
//         }
//     }
// }

// fun binarySearch(inputList: MutableList<Int>, target: Int, left: Int = 0, right: Int = inputList.size-1): Int {
//     if (left > right) return -1
//     var mid = left + (right-left) / 2
//     if (inputList[mid] == target) {
//         return mid
//     } else if (inputList[mid] > target) {
//         return binarySearch(inputList, target, left, mid-1)
//     } else {
//         return binarySearch(inputList, target, mid+1, right)
//     }
// }

// .slice -> create a new list


fun main(){
    var list1 = listOf(1,2,3,4)
    var list2 = mutableListOf(1,2,3,4)
    // println(list1 == list2)

    var slicedList1 = list1.slice(0..1)
    var subList1 = list1.subList(0, 2) // reference 

    println(slicedList1 == subList1)

    // slicedList1[0] = 2
    // println("----------")
    // println(subList1)

    // println("----------")
    // println(list1)
}

// Object variables
// Int primitive variables


// pointing 


// --------------------- mutableLIs(2,3)
// "listOf(1,2,3,4)",                        "2"
// space:3, 3, 4, 1