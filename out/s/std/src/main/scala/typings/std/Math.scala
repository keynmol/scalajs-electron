package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Math extends StObject {
  
  /** The mathematical constant e. This is Euler's number, the base of natural logarithms. */
  /* standard es5 */
  val E: Double = js.native
  
  /** The natural logarithm of 10. */
  /* standard es5 */
  val LN10: Double = js.native
  
  /** The natural logarithm of 2. */
  /* standard es5 */
  val LN2: Double = js.native
  
  /** The base-10 logarithm of e. */
  /* standard es5 */
  val LOG10E: Double = js.native
  
  /** The base-2 logarithm of e. */
  /* standard es5 */
  val LOG2E: Double = js.native
  
  /** Pi. This is the ratio of the circumference of a circle to its diameter. */
  /* standard es5 */
  val PI: Double = js.native
  
  /** The square root of 0.5, or, equivalently, one divided by the square root of 2. */
  /* standard es5 */
  val SQRT1_2: Double = js.native
  
  /** The square root of 2. */
  /* standard es5 */
  val SQRT2: Double = js.native
  
  /**
    * Returns the absolute value of a number (the value without regard to whether it is positive or negative).
    * For example, the absolute value of -5 is the same as the absolute value of 5.
    * @param x A numeric expression for which the absolute value is needed.
    */
  /* standard es5 */
  def abs(x: Double): Double = js.native
  
  /**
    * Returns the arc cosine (or inverse cosine) of a number.
    * @param x A numeric expression.
    */
  /* standard es5 */
  def acos(x: Double): Double = js.native
  
  /**
    * Returns the inverse hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es2015.core */
  def acosh(x: Double): Double = js.native
  
  /**
    * Returns the arcsine of a number.
    * @param x A numeric expression.
    */
  /* standard es5 */
  def asin(x: Double): Double = js.native
  
  /**
    * Returns the inverse hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es2015.core */
  def asinh(x: Double): Double = js.native
  
  /**
    * Returns the arctangent of a number.
    * @param x A numeric expression for which the arctangent is needed.
    */
  /* standard es5 */
  def atan(x: Double): Double = js.native
  
  /**
    * Returns the angle (in radians) between the X axis and the line going through both the origin and the given point.
    * @param y A numeric expression representing the cartesian y-coordinate.
    * @param x A numeric expression representing the cartesian x-coordinate.
    */
  /* standard es5 */
  def atan2(y: Double, x: Double): Double = js.native
  
  /**
    * Returns the inverse hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es2015.core */
  def atanh(x: Double): Double = js.native
  
  /**
    * Returns an implementation-dependent approximation to the cube root of number.
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def cbrt(x: Double): Double = js.native
  
  /**
    * Returns the smallest integer greater than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  /* standard es5 */
  def ceil(x: Double): Double = js.native
  
  /**
    * Returns the number of leading zero bits in the 32-bit binary representation of a number.
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def clz32(x: Double): Double = js.native
  
  /**
    * Returns the cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es5 */
  def cos(x: Double): Double = js.native
  
  /**
    * Returns the hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es2015.core */
  def cosh(x: Double): Double = js.native
  
  /**
    * Returns e (the base of natural logarithms) raised to a power.
    * @param x A numeric expression representing the power of e.
    */
  /* standard es5 */
  def exp(x: Double): Double = js.native
  
  /**
    * Returns the result of (e^x - 1), which is an implementation-dependent approximation to
    * subtracting 1 from the exponential function of x (e raised to the power of x, where e
    * is the base of the natural logarithms).
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def expm1(x: Double): Double = js.native
  
  /**
    * Returns the greatest integer less than or equal to its numeric argument.
    * @param x A numeric expression.
    */
  /* standard es5 */
  def floor(x: Double): Double = js.native
  
  /**
    * Returns the nearest single precision float representation of a number.
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def fround(x: Double): Double = js.native
  
  /**
    * Returns the square root of the sum of squares of its arguments.
    * @param values Values to compute the square root for.
    *     If no arguments are passed, the result is +0.
    *     If there is only one argument, the result is the absolute value.
    *     If any argument is +Infinity or -Infinity, the result is +Infinity.
    *     If any argument is NaN, the result is NaN.
    *     If all arguments are either +0 or −0, the result is +0.
    */
  /* standard es2015.core */
  def hypot(values: Double*): Double = js.native
  
  /**
    * Returns the result of 32-bit multiplication of two numbers.
    * @param x First number
    * @param y Second number
    */
  /* standard es2015.core */
  def imul(x: Double, y: Double): Double = js.native
  
  /**
    * Returns the natural logarithm (base e) of a number.
    * @param x A numeric expression.
    */
  /* standard es5 */
  def log(x: Double): Double = js.native
  
  /**
    * Returns the base 10 logarithm of a number.
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def log10(x: Double): Double = js.native
  
  /**
    * Returns the natural logarithm of 1 + x.
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def log1p(x: Double): Double = js.native
  
  /**
    * Returns the base 2 logarithm of a number.
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def log2(x: Double): Double = js.native
  
  /**
    * Returns the larger of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  /* standard es5 */
  def max(values: Double*): Double = js.native
  
  /**
    * Returns the smaller of a set of supplied numeric expressions.
    * @param values Numeric expressions to be evaluated.
    */
  /* standard es5 */
  def min(values: Double*): Double = js.native
  
  /**
    * Returns the value of a base expression taken to a specified power.
    * @param x The base value of the expression.
    * @param y The exponent value of the expression.
    */
  /* standard es5 */
  def pow(x: Double, y: Double): Double = js.native
  
  /** Returns a pseudorandom number between 0 and 1. */
  /* standard es5 */
  def random(): Double = js.native
  
  /**
    * Returns a supplied numeric expression rounded to the nearest integer.
    * @param x The value to be rounded to the nearest integer.
    */
  /* standard es5 */
  def round(x: Double): Double = js.native
  
  /**
    * Returns the sign of the x, indicating whether x is positive, negative or zero.
    * @param x The numeric expression to test
    */
  /* standard es2015.core */
  def sign(x: Double): Double = js.native
  
  /**
    * Returns the sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es5 */
  def sin(x: Double): Double = js.native
  
  /**
    * Returns the hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es2015.core */
  def sinh(x: Double): Double = js.native
  
  /**
    * Returns the square root of a number.
    * @param x A numeric expression.
    */
  /* standard es5 */
  def sqrt(x: Double): Double = js.native
  
  /**
    * Returns the tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es5 */
  def tan(x: Double): Double = js.native
  
  /**
    * Returns the hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  /* standard es2015.core */
  def tanh(x: Double): Double = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  
  /**
    * Returns the integral part of the a numeric expression, x, removing any fractional digits.
    * If x is already an integer, the result is x.
    * @param x A numeric expression.
    */
  /* standard es2015.core */
  def trunc(x: Double): Double = js.native
}
