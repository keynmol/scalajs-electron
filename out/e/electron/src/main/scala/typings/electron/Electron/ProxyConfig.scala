package typings.electron.Electron

import typings.electron.electronStrings.auto_detect
import typings.electron.electronStrings.direct
import typings.electron.electronStrings.fixed_servers
import typings.electron.electronStrings.pac_script
import typings.electron.electronStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyConfig extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/proxy-config
  /**
    * The proxy mode. Should be one of `direct`, `auto_detect`, `pac_script`,
    * `fixed_servers` or `system`. Defaults to `pac_script` proxy mode if `pacScript`
    * option is specified otherwise defaults to `fixed_servers`.
    */
  var mode: js.UndefOr[direct | auto_detect | pac_script | fixed_servers | system] = js.undefined
  
  /**
    * The URL associated with the PAC file.
    */
  var pacScript: js.UndefOr[String] = js.undefined
  
  /**
    * Rules indicating which URLs should bypass the proxy settings.
    */
  var proxyBypassRules: js.UndefOr[String] = js.undefined
  
  /**
    * Rules indicating which proxies to use.
    */
  var proxyRules: js.UndefOr[String] = js.undefined
}
object ProxyConfig {
  
  inline def apply(): ProxyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyConfig] (val x: Self) extends AnyVal {
    
    inline def setMode(value: direct | auto_detect | pac_script | fixed_servers | system): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPacScript(value: String): Self = StObject.set(x, "pacScript", value.asInstanceOf[js.Any])
    
    inline def setPacScriptUndefined: Self = StObject.set(x, "pacScript", js.undefined)
    
    inline def setProxyBypassRules(value: String): Self = StObject.set(x, "proxyBypassRules", value.asInstanceOf[js.Any])
    
    inline def setProxyBypassRulesUndefined: Self = StObject.set(x, "proxyBypassRules", js.undefined)
    
    inline def setProxyRules(value: String): Self = StObject.set(x, "proxyRules", value.asInstanceOf[js.Any])
    
    inline def setProxyRulesUndefined: Self = StObject.set(x, "proxyRules", js.undefined)
  }
}
