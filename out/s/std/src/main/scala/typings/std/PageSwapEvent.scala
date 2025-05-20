package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent) */
@js.native
trait PageSwapEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/activation) */
  /* standard dom */
  val activation: NavigationActivation | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/viewTransition) */
  /* standard dom */
  val viewTransition: ViewTransition | Null = js.native
}
