package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEventMap extends StObject {
  
  /* standard dom */
  var cancel: AnimationPlaybackEvent
  
  /* standard dom */
  var finish: AnimationPlaybackEvent
  
  /* standard dom */
  var remove: AnimationPlaybackEvent
}
object AnimationEventMap {
  
  inline def apply(cancel: AnimationPlaybackEvent, finish: AnimationPlaybackEvent, remove: AnimationPlaybackEvent): AnimationEventMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationEventMap] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: AnimationPlaybackEvent): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setFinish(value: AnimationPlaybackEvent): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: AnimationPlaybackEvent): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
