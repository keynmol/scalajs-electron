package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevtoolsSearchQueryEvent
  extends StObject
     with typings.std.Event {
  
  var event: Event[js.Object] = js.native
  
  /**
    * text to query for.
    */
  var query: String = js.native
}
