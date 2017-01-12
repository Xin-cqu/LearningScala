package recfun

object Main {

  def main(args: Array[String]) {
    /*println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }*/
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    //println("()".toList)
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = if (c==r||c==0){
      1
    }else {
      pascal(c-1,r-1)+pascal(c,r-1)
    }

  /**
   * Exercise 2
   */


  def balance(chars: List[Char]):

    Boolean = {

    def countS(state:Int,chars:List[Char]):Boolean={
      if(chars.isEmpty && state==0) true
      else if(chars.isEmpty && state!=0) false
      else if(state<0) false
      else if(chars.head=='(') countS(state+1, chars.tail)
      else if(chars.head==')') countS(state-1, chars.tail)
      else countS(state, chars.tail)
    }
    countS(0, chars)
  }
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money==0) 1
      else if(money<0) 0
      else if(coins.isEmpty) 0
      else countChange(money-coins.head,coins)+countChange(money,coins.tail)
    }
  }
