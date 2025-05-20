package typings.electron.Electron

import typings.electron.electronStrings.`close-app`
import typings.electron.electronStrings.critical
import typings.electron.electronStrings.logoff
import typings.electron.electronStrings.shutdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent electron.Electron.Event<{}> */
trait WindowSessionEndEvent extends StObject {
  
  val defaultPrevented: Boolean
  
  def preventDefault(): Unit
  
  // Docs: https://electronjs.org/docs/api/structures/window-session-end-event
  /**
    * List of reasons for shutdown. Can be 'shutdown', 'close-app', 'critical', or
    * 'logoff'.
    */
  var reasons: js.Array[shutdown | `close-app` | critical | logoff]
}
object WindowSessionEndEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    preventDefault: () => Unit,
    reasons: js.Array[shutdown | `close-app` | critical | logoff]
  ): WindowSessionEndEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), reasons = reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSessionEndEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowSessionEndEvent] (val x: Self) extends AnyVal {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setReasons(value: js.Array[shutdown | `close-app` | critical | logoff]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsVarargs(value: (shutdown | `close-app` | critical | logoff)*): Self = StObject.set(x, "reasons", js.Array(value*))
  }
}
