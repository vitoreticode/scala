// avoid implicit warnings
import language.implicitConversions

class Rational(val n: Int, val d: Int) {
  require(this.d != 0, "Zero denominator")

  def this(i: Int) = this(i, 1)

  override def  toString: String = s"R($n/$d)"

  def min(other: Rational): Rational = {
    if((n.toDouble / d) < (other.n.toDouble / other.d))
    this else other
  }

  def +(other: Rational): Rational =
    new Rational(
      n * other.d + d * other.n,
      d * other.d
    )
}

// Companion Objects have the same name of a class in the same source file
// shares private state and behavior with the class
// scala alternative to static
// good place to a factory method

object Rational {
  def apply(n: Int, d: Int): Rational = new Rational(n, d)
  // implicits are used to solve type issues
  implicit def apply(i: Int): Rational = new Rational(i, 1)
}

// can no longer call new, its private
val half = Rational.apply(1, 2)
val fifth = Rational.apply(5)

half + 5
5 + half

val sum = half + fifth
