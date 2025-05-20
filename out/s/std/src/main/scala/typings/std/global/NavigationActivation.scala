package typings.std.global

import typings.std.NavigationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("NavigationActivation")
@js.native
/* standard dom */
open class NavigationActivation ()
  extends StObject
     with typings.std.NavigationActivation {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/entry) */
  /* standard dom */
  /* CompleteClass */
  override val entry: typings.std.NavigationHistoryEntry = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/from) */
  /* standard dom */
  /* CompleteClass */
  override val from: typings.std.NavigationHistoryEntry | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/navigationType) */
  /* standard dom */
  /* CompleteClass */
  override val navigationType: NavigationType = js.native
}
