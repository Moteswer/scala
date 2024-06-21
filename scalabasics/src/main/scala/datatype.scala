//object is a singleton instance that is lazily
//when it is first accessed . it is similar class but only one
// instance will be createde automatically

object dtype{
  //main is entry point to any scala application
  // unit defines the return type of 'main' indicating
  // that it return nothing
  def main(args:Array[String]):Unit = {
    //integer data type
    val intNum: Int = 20
    val longNum: Long = 1234567890L
    val shortNum: Short = 32756
    val byteNum: Byte=127

    // Float
    val FloatingNum:Float = 3.14f
    val doubleNum: Double = 3.1415999833
//    println(s"doublenum is: $doubleNum")
//    println(s"bytenum is: $byteNum")
//    println(s"float is: $FloatingNum")

    var boolVar: Boolean = true
    print("boolean",boolVar)
    var intVar: Int =1234
    print("Integer Variable",intVar)
  }
}
