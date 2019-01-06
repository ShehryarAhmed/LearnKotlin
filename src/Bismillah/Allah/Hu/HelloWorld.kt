package Bismillah.Allah.Hu

typealias  Empol = Set<Empolyee>

fun main(args: Array<String>) {

//    var number: Int
//    number = 10;
//    number = 20;
//
//    val emplyee : Empolyee;
//
////    println("Hello, world!")
//    val emp = Empolyee("Ali",12);
//    emp.name = "Ahmed"
//
//    val employee = Empolyee("first",10)
//
//    val myEmp : Empol
//
//    val empolyee2 : Empolyee;
//    val number2 = 100
//
//    if(number < number2){
//        empolyee2 = Empolyee("Jane",10)
//    }else{
//        empolyee2 = Empolyee("KHAN",20)
//
//    }

    var emp1 = Empolyee("Ali",12)
    val emp2 = Empolyee("Ahmed",12)
    val emp3 = Empolyee("Ahmed",12)
    emp1 = emp2
    println(emp1 === emp2)
    println(emp2 === emp3)
    println(emp1 == emp2)
    println(emp2 == emp3)

}

class Empolyee(var name:String, val age : Int){
    override fun equals(obj: Any?): Boolean {

        if(obj is Empolyee){
            return  name == obj.name && age == obj.age
        }else{
            return false
        }
    }
}