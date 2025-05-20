package typings.electron.Electron

import typings.electron.electronStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.EventEmitter * / any */ trait ParentPort extends StObject {
  
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type
  
  @JSName("off")
  def off_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type
  
  // Docs: https://electronjs.org/docs/api/parent-port
  /**
    * Emitted when the process receives a message. Messages received on this port will
    * be queued up until a handler is registered for this event.
    */
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type
  
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type
  
  /**
    * Sends a message from the process to its parent.
    */
  def postMessage(message: Any): Unit
  
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* messageEvent */ MessageEvent, Unit]): this.type
}
object ParentPort {
  
  inline def apply(
    addListener: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort,
    off: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort,
    on: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort,
    once: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort,
    postMessage: Any => Unit,
    removeListener: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort
  ): ParentPort = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), postMessage = js.Any.fromFunction1(postMessage), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[ParentPort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentPort] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setOff(value: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnce(value: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    
    inline def setRemoveListener(value: (message, js.Function1[/* messageEvent */ MessageEvent, Unit]) => ParentPort): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
  }
}
