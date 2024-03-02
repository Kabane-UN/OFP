import scala.collection.mutable
import scala.util.control.Breaks.*
import scala.util.boundary
def gcd(g: Int, h: Int): Int = {
  if (h == 0) g else gcd(h, g%h)
}
def gen(t: Int, y: Int) : List[(Int, Int)] = {
  if (t < y) List[(Int, Int)]((t, y)) else List[(Int, Int)]((y, t))
}
def foo (b: Int, xs: List[Int]): List[(Int, Int)] = xs match {
  case Nil => List[(Int, Int)]()
  case x :: xs if gcd(x, b) == 1 => gen(b, x) ::: foo(b, xs)
  case x :: xs => foo(b, xs)
}
def coprimes(a: List[Int]): List[(Int, Int)] = a match {

  case Nil => List[(Int, Int)]()
  case x :: xs => foo(x, xs) ::: coprimes(xs)
}
object main extends App{
  val a: List[Int] = List(1, 2, 3, 4, 5)
  println(coprimes(a))
}