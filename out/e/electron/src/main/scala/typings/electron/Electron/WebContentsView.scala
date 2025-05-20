package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebContentsView
  extends StObject
     with View {
  
  /**
    * A `WebContents` property containing a reference to the displayed `WebContents`.
    * Use this to interact with the `WebContents`, for instance to load a URL.
    *
    */
  val webContents: WebContents_ = js.native
}
