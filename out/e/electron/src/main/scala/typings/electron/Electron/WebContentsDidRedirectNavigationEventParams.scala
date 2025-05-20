package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebContentsDidRedirectNavigationEventParams extends StObject {
  
  /**
    * The frame to be navigated. May be `null` if accessed after the frame has either
    * navigated or been destroyed.
    */
  var frame: WebFrameMain_ | Null
  
  /**
    * The frame which initiated the navigation, which can be a parent frame (e.g. via
    * `window.open` with a frame's name), or null if the navigation was not initiated
    * by a frame. This can also be null if the initiating frame was deleted before the
    * event was emitted.
    */
  var initiator: js.UndefOr[WebFrameMain_ | Null] = js.undefined
  
  /**
    * True if the navigation is taking place in a main frame.
    */
  var isMainFrame: Boolean
  
  /**
    * Whether the navigation happened without changing document. Examples of same
    * document navigations are reference fragment navigations, pushState/replaceState,
    * and same page history navigation.
    */
  var isSameDocument: Boolean
  
  /**
    * The URL the frame is navigating to.
    */
  var url: String
}
object WebContentsDidRedirectNavigationEventParams {
  
  inline def apply(isMainFrame: Boolean, isSameDocument: Boolean, url: String): WebContentsDidRedirectNavigationEventParams = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], isSameDocument = isSameDocument.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], frame = null)
    __obj.asInstanceOf[WebContentsDidRedirectNavigationEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebContentsDidRedirectNavigationEventParams] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameNull: Self = StObject.set(x, "frame", null)
    
    inline def setInitiator(value: WebFrameMain_): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setIsMainFrame(value: Boolean): Self = StObject.set(x, "isMainFrame", value.asInstanceOf[js.Any])
    
    inline def setIsSameDocument(value: Boolean): Self = StObject.set(x, "isSameDocument", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
