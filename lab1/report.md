% Лабораторная работа № 1 «Введение в функциональное
  программирование на языке Scala»
% 27 февраля 2024 г.
% Кабанов Андрей Юрьевич, ИУ9-62Б

# Цель работы
Целью данной работы является ознакомление с программированием 
на языке Scala на основе чистых функций.

# Индивидуальный вариант
Функция coprimes: `List[Int] => List[(Int, Int)]`, выполняющая поиск в 
списке целых чисел пар взаимно простых чисел. Функция должна возвращать 
список найденных пар, причём в каждой паре первое число должно быть меньше второго.

# Реализация и тестирование

Работа в REPL-интерпретаторе Scala:

```scala
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
```

# Вывод
В ходе выполнения лабораторной работы были получены навыки работы с 
REPL-интерпретатором Scala, а также было изучено базовое функциональное 
программирование на Scala.

