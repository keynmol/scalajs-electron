package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIPortEventMap extends StObject {
  
  /* standard dom */
  var statechange: MIDIConnectionEvent
}
object MIDIPortEventMap {
  
  inline def apply(statechange: MIDIConnectionEvent): MIDIPortEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIPortEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIDIPortEventMap] (val x: Self) extends AnyVal {
    
    inline def setStatechange(value: MIDIConnectionEvent): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
  }
}
