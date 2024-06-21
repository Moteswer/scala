object datastructures {
  def main(args: Array[String]): Unit = {
    // List; immutable, homogeneous
    val fruits: List[String] = List("apple", "oranges", "grapes", "guava")

    // Printing the first element of the list
    println("first element: " + fruits.head)

    // Printing the tail of the list (all elements except the first)
    println("last element: " + fruits.tail)

    // Corrected list with homogeneous elements (all strings)
    val lst2 = List("Hadoop", "Spark", "Flume")
    println(lst2)
    println(lst2.getClass) // Prints the class of lst2

    // Empty list declaration
    val emptyList: List[Nothing] = List()

    // Corrected array declaration with elements (e.g., Array[Int])
    val arrayData: Array[String] = Array("apple","beetroot")
    arrayData.foreach(println)
    // prints all values
    println(arrayData.mkString(","))
    arrayData(0) = "banana"
    println(arrayData.mkString(","))
    //Declare an empty array
    val arr_1 = new Array[String](10)
    val arr_2 = Array.ofDim[Int](2,2)
    arr_2(0)(0) = 234
    arr_2(0)(1) = 135
    arr_2(1)(0) = 911
    arr_2(1)(1) = 102

    // print the array
    val flattenArr : Array[Int] = arr_2.flatten
    println(flattenArr.mkString(", "))

    arr_2(0)(1) = 34

    //lsit declaration
    val list2 = 10::20::30::40::Nil
    // create a list buffer of type mutable
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Thiruvananthapuram"
    cities += ("Mumbai","Delhi","Pune")
    cities -= "Mumbai"
    println(cities)
    cities.toList //typecasting in scala is done by toDataType()

    // Set Collection:Immutable collection
    // Hashset - mutable collection sets
    val set_1 : Set[String] = Set()

    val set_2 = Set("apple","oranges","watermelon","grapes","guava")

    import scala.collection.mutable.Set
    val mutableSet = Set("apple","oranges","watermelon","grapes","guava")
    mutableSet += "blueberry"
    mutableSet -= "apple"
    //Tuple declaration - Immutable Collection
    //In scala tuple is fixed size,can hold multiple data
    val Tuple_1 = (10,20,30,40,50,60,70,80)
    // Tuple_1._1 = "String" Update will provide error
    println(Tuple_1._2) // Accessing individual value.
    //map in scala is collection of key value pairs
    //each key is unique,it is similar to dictionary in python

//    import scala.collection.immutable.Map
    var MapVar : Map[String,Int] = Map()
    var MapVar1 = Map("UST1001" -> "sandeep","UST1002"->"Midun","UST1003"->"Sankaritem","UST1004"->"Adinan")
    println(MapVar1.contains("UST1003"))
    println(MapVar1.get("UST1003"))

    //import scala.collection.mutable.Map
    // an iterator in scala represent a sequence of elements that allows you to
    // traverse through a collection sequentially.
    val myList = List(20,30,40,50,60,70,80,90)
    val iter = myList.iterator
    // method of iterator to check if there is more elements (.hasNext())
    // .remove() to remove elements from mutable iterators
    println(iter.next())
    println(iter.next())

    lazy val donuts: Int = 100
    println(donuts*5)


  }
}
