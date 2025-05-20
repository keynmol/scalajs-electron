package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a user-defined {@link Iterator} that is also iterable.
  */
@js.native
trait IterableIterator[T, TReturn, TNext]
  extends StObject
     with Iterator[T, TReturn, TNext] {
  
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T, TReturn, TNext]] = js.native
}
