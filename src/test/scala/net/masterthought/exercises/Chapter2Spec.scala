package net.masterthought.exercises

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers


class Chapter2Spec extends FunSuite with ShouldMatchers  {

  test("exercise 2.1 fibonacci function"){
     val chapter2 = new Chapter2()
     chapter2.fib2(4) should be(3)
  }

}





