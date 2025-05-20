package typings.electron.Electron

import typings.electron.electronStrings.`origin-in-all-contexts`
import typings.electron.electronStrings.`third-parties-included`
import typings.electron.electronStrings.backgroundFetch
import typings.electron.electronStrings.cache
import typings.electron.electronStrings.cookies
import typings.electron.electronStrings.downloads
import typings.electron.electronStrings.fileSystems
import typings.electron.electronStrings.indexedDB
import typings.electron.electronStrings.localStorage
import typings.electron.electronStrings.serviceWorkers
import typings.electron.electronStrings.webSQL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearDataOptions extends StObject {
  
  /**
    * Skips deleting cookies that would close current network connections. (Default:
    * `false`)
    */
  var avoidClosingConnections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The types of data to clear. By default, this will clear all types of data. This
    * can potentially include data types not explicitly listed here. (See Chromium's
    * `BrowsingDataRemover` for the full list.)
    */
  var dataTypes: js.UndefOr[
    js.Array[
      backgroundFetch | cache | cookies | downloads | fileSystems | indexedDB | localStorage | serviceWorkers | webSQL
    ]
  ] = js.undefined
  
  /**
    * Clear data for all origins except these ones. Cannot be used with `origins`.
    */
  var excludeOrigins: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The behavior for matching data to origins.
    */
  var originMatchingMode: js.UndefOr[`third-parties-included` | `origin-in-all-contexts`] = js.undefined
  
  /**
    * Clear data for only these origins. Cannot be used with `excludeOrigins`.
    */
  var origins: js.UndefOr[js.Array[String]] = js.undefined
}
object ClearDataOptions {
  
  inline def apply(): ClearDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearDataOptions] (val x: Self) extends AnyVal {
    
    inline def setAvoidClosingConnections(value: Boolean): Self = StObject.set(x, "avoidClosingConnections", value.asInstanceOf[js.Any])
    
    inline def setAvoidClosingConnectionsUndefined: Self = StObject.set(x, "avoidClosingConnections", js.undefined)
    
    inline def setDataTypes(
      value: js.Array[
          backgroundFetch | cache | cookies | downloads | fileSystems | indexedDB | localStorage | serviceWorkers | webSQL
        ]
    ): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
    
    inline def setDataTypesVarargs(
      value: (backgroundFetch | cache | cookies | downloads | fileSystems | indexedDB | localStorage | serviceWorkers | webSQL)*
    ): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setExcludeOrigins(value: js.Array[String]): Self = StObject.set(x, "excludeOrigins", value.asInstanceOf[js.Any])
    
    inline def setExcludeOriginsUndefined: Self = StObject.set(x, "excludeOrigins", js.undefined)
    
    inline def setExcludeOriginsVarargs(value: String*): Self = StObject.set(x, "excludeOrigins", js.Array(value*))
    
    inline def setOriginMatchingMode(value: `third-parties-included` | `origin-in-all-contexts`): Self = StObject.set(x, "originMatchingMode", value.asInstanceOf[js.Any])
    
    inline def setOriginMatchingModeUndefined: Self = StObject.set(x, "originMatchingMode", js.undefined)
    
    inline def setOrigins(value: js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    inline def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value*))
  }
}
