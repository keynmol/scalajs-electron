package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation) */
trait NavigationActivation extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/entry) */
  /* standard dom */
  val entry: NavigationHistoryEntry
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/from) */
  /* standard dom */
  val from: NavigationHistoryEntry | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/navigationType) */
  /* standard dom */
  val navigationType: NavigationType
}
object NavigationActivation {
  
  inline def apply(entry: NavigationHistoryEntry, navigationType: NavigationType): NavigationActivation = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], navigationType = navigationType.asInstanceOf[js.Any], from = null)
    __obj.asInstanceOf[NavigationActivation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationActivation] (val x: Self) extends AnyVal {
    
    inline def setEntry(value: NavigationHistoryEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: NavigationHistoryEntry): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setNavigationType(value: NavigationType): Self = StObject.set(x, "navigationType", value.asInstanceOf[js.Any])
  }
}
