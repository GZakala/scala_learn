class Rational(n: Int, d: Int):
    require(d != 0)
    val num = n
    val den = d
    override def toString = f"$n/$d"

    def add(other: Rational): Rational =
        Rational(num * other.den + den * other.num, den + other.den)

    def lessThan(other: Rational): Boolean =
        this.num * other.den < other.num * this.den

    def max(other: Rational): Rational =
        if this.lessThan(other) then
            other
        else
            this
