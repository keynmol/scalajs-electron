package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerEventMap
  extends StObject
     with AbstractWorkerEventMap
     with MessageEventTargetEventMap
object WorkerEventMap {
  
  inline def apply(
    error: org.scalajs.dom.ErrorEvent,
    message: org.scalajs.dom.MessageEvent,
    messageerror: org.scalajs.dom.MessageEvent
  ): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
}
