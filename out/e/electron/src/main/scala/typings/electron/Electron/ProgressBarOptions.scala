package typings.electron.Electron

import typings.electron.electronStrings.error
import typings.electron.electronStrings.indeterminate
import typings.electron.electronStrings.none
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.paused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarOptions extends StObject {
  
  /**
    * Mode for the progress bar. Can be `none`, `normal`, `indeterminate`, `error` or
    * `paused`.
    *
    * @platform win32
    */
  var mode: none | normal | indeterminate | error | paused
}
object ProgressBarOptions {
  
  inline def apply(mode: none | normal | indeterminate | error | paused): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    
    inline def setMode(value: none | normal | indeterminate | error | paused): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
