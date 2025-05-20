package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationHistory extends StObject {
  
  // Docs: https://electronjs.org/docs/api/navigation-history
  /**
    * Whether the browser can go back to previous web page.
    */
  def canGoBack(): Boolean
  
  /**
    * Whether the browser can go forward to next web page.
    */
  def canGoForward(): Boolean
  
  /**
    * Whether the web page can go to the specified relative `offset` from the current
    * entry.
    */
  def canGoToOffset(offset: Double): Boolean
  
  /**
    * Clears the navigation history.
    */
  def clear(): Unit
  
  /**
    * The index of the current page, from which we would go back/forward or reload.
    */
  def getActiveIndex(): Double
  
  /**
    * WebContents complete history.
    */
  def getAllEntries(): js.Array[NavigationEntry]
  
  /**
    * Navigation entry at the given index.
    *
    * If index is out of bounds (greater than history length or less than 0), null
    * will be returned.
    */
  def getEntryAtIndex(index: Double): NavigationEntry
  
  /**
    * Makes the browser go back a web page.
    */
  def goBack(): Unit
  
  /**
    * Makes the browser go forward a web page.
    */
  def goForward(): Unit
  
  /**
    * Navigates browser to the specified absolute web page index.
    */
  def goToIndex(index: Double): Unit
  
  /**
    * Navigates to the specified relative offset from the current entry.
    */
  def goToOffset(offset: Double): Unit
  
  /**
    * History length.
    */
  def length(): Double
  
  /**
    * Removes the navigation entry at the given index. Can't remove entry at the
    * "current active index".
    *
    * Whether the navigation entry was removed from the webContents history.
    */
  def removeEntryAtIndex(index: Double): Boolean
  
  /**
    * the promise will resolve when the page has finished loading the selected
    * navigation entry (see `did-finish-load`), and rejects if the page fails to load
    * (see `did-fail-load`). A noop rejection handler is already attached, which
    * avoids unhandled rejection errors.
    */
  def restore(options: RestoreOptions): js.Promise[Unit]
}
object NavigationHistory {
  
  inline def apply(
    canGoBack: () => Boolean,
    canGoForward: () => Boolean,
    canGoToOffset: Double => Boolean,
    clear: () => Unit,
    getActiveIndex: () => Double,
    getAllEntries: () => js.Array[NavigationEntry],
    getEntryAtIndex: Double => NavigationEntry,
    goBack: () => Unit,
    goForward: () => Unit,
    goToIndex: Double => Unit,
    goToOffset: Double => Unit,
    length: () => Double,
    removeEntryAtIndex: Double => Boolean,
    restore: RestoreOptions => js.Promise[Unit]
  ): NavigationHistory = {
    val __obj = js.Dynamic.literal(canGoBack = js.Any.fromFunction0(canGoBack), canGoForward = js.Any.fromFunction0(canGoForward), canGoToOffset = js.Any.fromFunction1(canGoToOffset), clear = js.Any.fromFunction0(clear), getActiveIndex = js.Any.fromFunction0(getActiveIndex), getAllEntries = js.Any.fromFunction0(getAllEntries), getEntryAtIndex = js.Any.fromFunction1(getEntryAtIndex), goBack = js.Any.fromFunction0(goBack), goForward = js.Any.fromFunction0(goForward), goToIndex = js.Any.fromFunction1(goToIndex), goToOffset = js.Any.fromFunction1(goToOffset), length = js.Any.fromFunction0(length), removeEntryAtIndex = js.Any.fromFunction1(removeEntryAtIndex), restore = js.Any.fromFunction1(restore))
    __obj.asInstanceOf[NavigationHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationHistory] (val x: Self) extends AnyVal {
    
    inline def setCanGoBack(value: () => Boolean): Self = StObject.set(x, "canGoBack", js.Any.fromFunction0(value))
    
    inline def setCanGoForward(value: () => Boolean): Self = StObject.set(x, "canGoForward", js.Any.fromFunction0(value))
    
    inline def setCanGoToOffset(value: Double => Boolean): Self = StObject.set(x, "canGoToOffset", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetActiveIndex(value: () => Double): Self = StObject.set(x, "getActiveIndex", js.Any.fromFunction0(value))
    
    inline def setGetAllEntries(value: () => js.Array[NavigationEntry]): Self = StObject.set(x, "getAllEntries", js.Any.fromFunction0(value))
    
    inline def setGetEntryAtIndex(value: Double => NavigationEntry): Self = StObject.set(x, "getEntryAtIndex", js.Any.fromFunction1(value))
    
    inline def setGoBack(value: () => Unit): Self = StObject.set(x, "goBack", js.Any.fromFunction0(value))
    
    inline def setGoForward(value: () => Unit): Self = StObject.set(x, "goForward", js.Any.fromFunction0(value))
    
    inline def setGoToIndex(value: Double => Unit): Self = StObject.set(x, "goToIndex", js.Any.fromFunction1(value))
    
    inline def setGoToOffset(value: Double => Unit): Self = StObject.set(x, "goToOffset", js.Any.fromFunction1(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setRemoveEntryAtIndex(value: Double => Boolean): Self = StObject.set(x, "removeEntryAtIndex", js.Any.fromFunction1(value))
    
    inline def setRestore(value: RestoreOptions => js.Promise[Unit]): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
  }
}
