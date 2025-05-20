package typings.electron.global.Electron

import typings.electron.Electron.BaseWindowConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.BaseWindow")
@js.native
/**
  * BaseWindow
  */
open class BaseWindow ()
  extends StObject
     with typings.electron.Electron.BaseWindow {
  def this(options: BaseWindowConstructorOptions) = this()
}
object BaseWindow {
  
  @JSGlobal("Electron.BaseWindow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The window with the given `id`.
    */
  /* static member */
  inline def fromId(id: Double): typings.electron.Electron.BaseWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.BaseWindow | Null]
  
  /**
    * An array of all opened browser windows.
    */
  /* static member */
  inline def getAllWindows(): js.Array[typings.electron.Electron.BaseWindow] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWindows")().asInstanceOf[js.Array[typings.electron.Electron.BaseWindow]]
  
  /**
    * The window that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  inline def getFocusedWindow(): typings.electron.Electron.BaseWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWindow")().asInstanceOf[typings.electron.Electron.BaseWindow | Null]
}
