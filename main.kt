fun main() {
  println("Digite Um Numero Inteiro:")
  var num1:Int=readLine()?.toIntOrNull()?:0
  println("Digite Outro Numero Inteiro")
  var num2:Int=readLine()?.toIntOrNull()?:0
  var result= num1+num2
  println ("A soma é $result")

  val sub: Int= num1-num2
  println("A Subtração É: $sub")
  var mult:Int= num1*num2
  println("A Multiplicação É: $mult") 
  var div:Int= num1/num2 
  println("A Divisão É: $div") 
}