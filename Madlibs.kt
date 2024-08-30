fun main () {
  
  val costOfGas = 2.28
  val mileage = 25
  // Declare the variable distance below
  var distance : Int
    
  println("What's your name?")
  var name = readLine()
  // Write your code below
  println("What's your friend's name?")
  var friendName = readLine()

  println("Write an adjective.")
  var adjective = readLine()

  println("Which city are you driving to?")
  var city = readLine()
  
  println("Which band are you seeing?")
  var bandName = readLine()


  println("What kind of job will you and $friendName do?")
  var work = readLine()

  println("How far will you be traveling?")
  distance = Integer.valueOf(readLine())

  var totalForGas = (costOfGas / mileage) * distance

  totalForGas = Math.round(totalForGas * 100) / 100.00

  var totalMoneySaved = totalForGas + 200




  print("""
    A long time ago, $name and their friend $friendName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $$totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}