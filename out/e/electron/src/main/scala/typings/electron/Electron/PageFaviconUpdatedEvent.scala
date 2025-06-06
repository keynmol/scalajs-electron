package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageFaviconUpdatedEvent
  extends StObject
     with typings.std.Event {
  
  /**
    * Array of URLs.
    */
  var favicons: js.Array[String] = js.native
}
