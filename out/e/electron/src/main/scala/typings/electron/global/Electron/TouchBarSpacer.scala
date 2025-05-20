package typings.electron.global.Electron

import typings.electron.Electron.TouchBarSpacerConstructorOptions
import typings.electron.electronStrings.flexible
import typings.electron.electronStrings.large
import typings.electron.electronStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarSpacer")
@js.native
open class TouchBarSpacer protected ()
  extends StObject
     with typings.electron.Electron.TouchBarSpacer {
  // Docs: https://electronjs.org/docs/api/touch-bar-spacer
  /**
    * TouchBarSpacer
    */
  def this(options: TouchBarSpacerConstructorOptions) = this()
  
  /**
    * A `string` representing the size of the spacer.  Can be `small`, `large` or
    * `flexible`.
    */
  /* CompleteClass */
  var size: small | large | flexible = js.native
}
