package typings.electron.global.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WebContents` */
@JSGlobal("Electron.webContents")
@js.native
open class webContents ()
  extends StObject
     with typings.electron.Electron.WebContents_
/* was `typeof WebContents` */
object webContents {
  
  @JSGlobal("Electron.webContents")
  @js.native
  val ^ : js.Any = js.native
  
  // Docs: https://electronjs.org/docs/api/web-contents
  /**
    * A WebContents instance with the given TargetID, or `undefined` if there is no
    * WebContents associated with the given TargetID.
    *
    * When communicating with the Chrome DevTools Protocol, it can be useful to lookup
    * a WebContents instance based on its assigned TargetID.
    */
  /* static member */
  inline def fromDevToolsTargetId(targetId: String): js.UndefOr[typings.electron.Electron.WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDevToolsTargetId")(targetId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.electron.Electron.WebContents_]]
  
  /**
    * A WebContents instance with the given WebFrameMain, or `undefined` if there is
    * no WebContents associated with the given WebFrameMain.
    */
  /* static member */
  inline def fromFrame(frame: typings.electron.Electron.WebFrameMain_): js.UndefOr[typings.electron.Electron.WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.electron.Electron.WebContents_]]
  
  /**
    * A WebContents instance with the given ID, or `undefined` if there is no
    * WebContents associated with the given ID.
    */
  /* static member */
  inline def fromId(id: Double): js.UndefOr[typings.electron.Electron.WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.electron.Electron.WebContents_]]
  
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  /* static member */
  inline def getAllWebContents(): js.Array[typings.electron.Electron.WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWebContents")().asInstanceOf[js.Array[typings.electron.Electron.WebContents_]]
  
  /**
    * The web contents that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  inline def getFocusedWebContents(): typings.electron.Electron.WebContents_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWebContents")().asInstanceOf[typings.electron.Electron.WebContents_ | Null]
}
