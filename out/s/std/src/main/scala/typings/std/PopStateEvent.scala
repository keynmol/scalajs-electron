package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PopStateEvent is an event handler for the popstate event on the window.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent)
  */
@js.native
trait PopStateEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/hasUAVisualTransition) */
  /* standard dom */
  val hasUAVisualTransition: scala.Boolean = js.native
  
  /**
    * Returns a copy of the information that was provided to pushState() or replaceState().
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/state)
    */
  /* standard dom */
  val state: Any = js.native
}
