package Bismillah.Allah.Hu

typealias  Empol = Set<Empolyee>

fun main(args: Array<String>) {

    var number: Int
    number = 10;
    number = 20;

    val emplyee : Empolyee;

//    println("Hello, world!")
    val emp = Empolyee("Ali",12);
    emp.name = "Ahmed"

    val employee = Empolyee("first",10)

    val myEmp : Empol

    val empolyee2 : Empolyee;
    val number2 = 100

    if(number < number2){
        empolyee2 = Empolyee("Jane",10)
    }else{
        empolyee2 = Empolyee("KHAN",20)

    }
}

class Empolyee(var name:String, val age : Int){

}