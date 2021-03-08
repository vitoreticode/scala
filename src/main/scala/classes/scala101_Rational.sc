// class Rational(val n: Int, val d: Int)

// val half = new Rational(1, 2)

// every class have a toString method that can be overridden

class Rational(val n: Int, val d: Int) {
  // if the predicate fails, get an IllegalArgumentException thrown, the message is optional
  require(this.d != 0, "Zero denominator")

  // auxiliary constructor, they are very limited, only call another constructor
  // better alternative is to use factory methods
  def this(i: Int) = this(i, 1)

  override def  toString: String = s"R($n/$d)"

  def min(other: Rational): Rational = {
    if((n.toDouble / d) < other.n.toDouble / other.d))
      this else other // use to return
  }

  def +(other: Rational): Rational =
    new Rational(
      n * other.d + d * other.n,
      d * other.d
    )
}

val half = new Rational(1, 2)
val fifth = new Rational(1, 5)

val smaller = fifth min half // infix re-writing rule

val sum = half + fifth

// val divByZero = new Rational(1, 0)