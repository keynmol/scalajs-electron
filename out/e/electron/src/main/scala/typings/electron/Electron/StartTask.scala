package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTask extends StObject {
  
  /**
    * Method to call when the task has ended. If never called, the service won't
    * terminate while otherwise idle.
    */
  def end(): Unit
}
object StartTask {
  
  inline def apply(end: () => Unit): StartTask = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
    __obj.asInstanceOf[StartTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTask] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
  }
}
