package net.masterthought.exercises

class Chapter2 {

  def fib2(n: Int): Int ={
    def go(n: Int, a: Int, b:Int): Int = if(n == 0) a else go(n-1,b,a+b)
    go(n,0,1)
  }

}
