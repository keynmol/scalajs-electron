package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ViewTransition")
@js.native
/* standard dom */
open class ViewTransition ()
  extends StObject
     with typings.std.ViewTransition {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/finished) */
  /* standard dom */
  /* CompleteClass */
  override val finished: js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/ready) */
  /* standard dom */
  /* CompleteClass */
  override val ready: js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/skipTransition) */
  /* standard dom */
  /* CompleteClass */
  override def skipTransition(): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  var types: typings.std.ViewTransitionTypeSet = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ViewTransition/updateCallbackDone) */
  /* standard dom */
  /* CompleteClass */
  override val updateCallbackDone: js.Promise[Unit] = js.native
}
