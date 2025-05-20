package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition) */
trait ViewTransition extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/finished) */
  /* standard dom */
  val finished: js.Promise[Unit]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/ready) */
  /* standard dom */
  val ready: js.Promise[Unit]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/skipTransition) */
  /* standard dom */
  def skipTransition(): Unit
  
  /* standard dom */
  var types: ViewTransitionTypeSet
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/updateCallbackDone) */
  /* standard dom */
  val updateCallbackDone: js.Promise[Unit]
}
object ViewTransition {
  
  inline def apply(
    finished: js.Promise[Unit],
    ready: js.Promise[Unit],
    skipTransition: () => Unit,
    types: ViewTransitionTypeSet,
    updateCallbackDone: js.Promise[Unit]
  ): ViewTransition = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], skipTransition = js.Any.fromFunction0(skipTransition), types = types.asInstanceOf[js.Any], updateCallbackDone = updateCallbackDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewTransition] (val x: Self) extends AnyVal {
    
    inline def setFinished(value: js.Promise[Unit]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setReady(value: js.Promise[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setSkipTransition(value: () => Unit): Self = StObject.set(x, "skipTransition", js.Any.fromFunction0(value))
    
    inline def setTypes(value: ViewTransitionTypeSet): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setUpdateCallbackDone(value: js.Promise[Unit]): Self = StObject.set(x, "updateCallbackDone", value.asInstanceOf[js.Any])
  }
}
