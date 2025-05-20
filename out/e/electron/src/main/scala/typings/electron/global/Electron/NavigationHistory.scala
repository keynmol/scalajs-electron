package typings.electron.global.Electron

import typings.electron.Electron.NavigationEntry
import typings.electron.Electron.RestoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.NavigationHistory")
@js.native
open class NavigationHistory ()
  extends StObject
     with typings.electron.Electron.NavigationHistory {
  
  // Docs: https://electronjs.org/docs/api/navigation-history
  /**
    * Whether the browser can go back to previous web page.
    */
  /* CompleteClass */
  override def canGoBack(): Boolean = js.native
  
  /**
    * Whether the browser can go forward to next web page.
    */
  /* CompleteClass */
  override def canGoForward(): Boolean = js.native
  
  /**
    * Whether the web page can go to the specified relative `offset` from the current
    * entry.
    */
  /* CompleteClass */
  override def canGoToOffset(offset: Double): Boolean = js.native
  
  /**
    * Clears the navigation history.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /**
    * The index of the current page, from which we would go back/forward or reload.
    */
  /* CompleteClass */
  override def getActiveIndex(): Double = js.native
  
  /**
    * WebContents complete history.
    */
  /* CompleteClass */
  override def getAllEntries(): js.Array[NavigationEntry] = js.native
  
  /**
    * Navigation entry at the given index.
    *
    * If index is out of bounds (greater than history length or less than 0), null
    * will be returned.
    */
  /* CompleteClass */
  override def getEntryAtIndex(index: Double): NavigationEntry = js.native
  
  /**
    * Makes the browser go back a web page.
    */
  /* CompleteClass */
  override def goBack(): Unit = js.native
  
  /**
    * Makes the browser go forward a web page.
    */
  /* CompleteClass */
  override def goForward(): Unit = js.native
  
  /**
    * Navigates browser to the specified absolute web page index.
    */
  /* CompleteClass */
  override def goToIndex(index: Double): Unit = js.native
  
  /**
    * Navigates to the specified relative offset from the current entry.
    */
  /* CompleteClass */
  override def goToOffset(offset: Double): Unit = js.native
  
  /**
    * History length.
    */
  /* CompleteClass */
  override def length(): Double = js.native
  
  /**
    * Removes the navigation entry at the given index. Can't remove entry at the
    * "current active index".
    *
    * Whether the navigation entry was removed from the webContents history.
    */
  /* CompleteClass */
  override def removeEntryAtIndex(index: Double): Boolean = js.native
  
  /**
    * the promise will resolve when the page has finished loading the selected
    * navigation entry (see `did-finish-load`), and rejects if the page fails to load
    * (see `did-fail-load`). A noop rejection handler is already attached, which
    * avoids unhandled rejection errors.
    */
  /* CompleteClass */
  override def restore(options: RestoreOptions): js.Promise[Unit] = js.native
}
