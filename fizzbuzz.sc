


def fizzbuzz(number:Int) : String = {
  val dividedbythree = number % 3
  val dividedbyfive = number % 5
  var output = ""
  if (dividedbythree == 0)
    {
      output = "fizz"
    }
  if (dividedbyfive == 0)
    {
      output += "buzz"
    }
  if (output == "")
  {
    output = number.toString
  }
  output
}
fizzbuzz(5)
fizzbuzz(3)
fizzbuzz(15)
fizzbuzz(2)


