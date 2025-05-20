package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationHistoryEntryEventMap extends StObject {
  
  /* standard dom */
  var dispose: org.scalajs.dom.Event
}
object NavigationHistoryEntryEventMap {
  
  inline def apply(dispose: org.scalajs.dom.Event): NavigationHistoryEntryEventMap = {
    val __obj = js.Dynamic.literal(dispose = dispose.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationHistoryEntryEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationHistoryEntryEventMap] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: org.scalajs.dom.Event): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
  }
}
