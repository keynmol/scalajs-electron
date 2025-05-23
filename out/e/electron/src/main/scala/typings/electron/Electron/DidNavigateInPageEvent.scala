package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidNavigateInPageEvent
  extends StObject
     with typings.std.Event {
  
  var isMainFrame: Boolean = js.native
  
  var url: String = js.native
}
