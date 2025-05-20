package typings.electron.Electron

import typings.electron.electronStrings.dark
import typings.electron.electronStrings.light
import typings.electron.electronStrings.system
import typings.electron.electronStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.EventEmitter * / any */ trait NativeTheme extends StObject {
  
  @JSName("addListener")
  def addListener_updated(event: updated, listener: js.Function0[Unit]): this.type
  
  /**
    * A `boolean` indicating whether Chromium is in forced colors mode, controlled by
    * system accessibility settings. Currently, Windows high contrast is the only
    * system setting that triggers forced colors mode.
    *
    * @platform win32
    */
  val inForcedColorsMode: Boolean
  
  @JSName("off")
  def off_updated(event: updated, listener: js.Function0[Unit]): this.type
  
  // Docs: https://electronjs.org/docs/api/native-theme
  /**
    * Emitted when something in the underlying NativeTheme has changed. This normally
    * means that either the value of `shouldUseDarkColors`,
    * `shouldUseHighContrastColors` or `shouldUseInvertedColorScheme` has changed. You
    * will have to check them to determine which one has changed.
    */
  @JSName("on")
  def on_updated(event: updated, listener: js.Function0[Unit]): this.type
  
  @JSName("once")
  def once_updated(event: updated, listener: js.Function0[Unit]): this.type
  
  /**
    * A `boolean` that indicates the whether the user has chosen via system
    * accessibility settings to reduce transparency at the OS level.
    *
    */
  val prefersReducedTransparency: Boolean
  
  @JSName("removeListener")
  def removeListener_updated(event: updated, listener: js.Function0[Unit]): this.type
  
  /**
    * A `boolean` for if the OS / Chromium currently has a dark mode enabled or is
    * being instructed to show a dark-style UI.  If you want to modify this value you
    * should use `themeSource` below.
    *
    */
  val shouldUseDarkColors: Boolean
  
  /**
    * A `boolean` property indicating whether or not the system theme has been set to
    * dark or light.
    *
    * On Windows this property distinguishes between system and app light/dark theme,
    * returning `true` if the system theme is set to dark theme and `false` otherwise.
    * On macOS the return value will be the same as `nativeTheme.shouldUseDarkColors`.
    *
    * @platform darwin,win32
    */
  val shouldUseDarkColorsForSystemIntegratedUI: Boolean
  
  /**
    * A `boolean` for if the OS / Chromium currently has high-contrast mode enabled or
    * is being instructed to show a high-contrast UI.
    *
    * @platform darwin,win32
    */
  val shouldUseHighContrastColors: Boolean
  
  /**
    * A `boolean` for if the OS / Chromium currently has an inverted color scheme or
    * is being instructed to use an inverted color scheme.
    *
    * @platform darwin,win32
    */
  val shouldUseInvertedColorScheme: Boolean
  
  /**
    * A `string` property that can be `system`, `light` or `dark`.  It is used to
    * override and supersede the value that Chromium has chosen to use internally.
    *
    * Setting this property to `system` will remove the override and everything will
    * be reset to the OS default.  By default `themeSource` is `system`.
    *
    * Settings this property to `dark` will have the following effects:
    *
    * * `nativeTheme.shouldUseDarkColors` will be `true` when accessed
    * * Any UI Electron renders on Linux and Windows including context menus,
    * devtools, etc. will use the dark UI.
    * * Any UI the OS renders on macOS including menus, window frames, etc. will use
    * the dark UI.
    * * The `prefers-color-scheme` CSS query will match `dark` mode.
    * * The `updated` event will be emitted
    *
    * Settings this property to `light` will have the following effects:
    *
    * * `nativeTheme.shouldUseDarkColors` will be `false` when accessed
    * * Any UI Electron renders on Linux and Windows including context menus,
    * devtools, etc. will use the light UI.
    * * Any UI the OS renders on macOS including menus, window frames, etc. will use
    * the light UI.
    * * The `prefers-color-scheme` CSS query will match `light` mode.
    * * The `updated` event will be emitted
    *
    * The usage of this property should align with a classic "dark mode" state machine
    * in your application where the user has three options.
    *
    * * `Follow OS` --> `themeSource = 'system'`
    * * `Dark Mode` --> `themeSource = 'dark'`
    * * `Light Mode` --> `themeSource = 'light'`
    *
    * Your application should then always use `shouldUseDarkColors` to determine what
    * CSS to apply.
    */
  var themeSource: system | light | dark
}
object NativeTheme {
  
  inline def apply(
    addListener: (updated, js.Function0[Unit]) => NativeTheme,
    inForcedColorsMode: Boolean,
    off: (updated, js.Function0[Unit]) => NativeTheme,
    on: (updated, js.Function0[Unit]) => NativeTheme,
    once: (updated, js.Function0[Unit]) => NativeTheme,
    prefersReducedTransparency: Boolean,
    removeListener: (updated, js.Function0[Unit]) => NativeTheme,
    shouldUseDarkColors: Boolean,
    shouldUseDarkColorsForSystemIntegratedUI: Boolean,
    shouldUseHighContrastColors: Boolean,
    shouldUseInvertedColorScheme: Boolean,
    themeSource: system | light | dark
  ): NativeTheme = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), inForcedColorsMode = inForcedColorsMode.asInstanceOf[js.Any], off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prefersReducedTransparency = prefersReducedTransparency.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener), shouldUseDarkColors = shouldUseDarkColors.asInstanceOf[js.Any], shouldUseDarkColorsForSystemIntegratedUI = shouldUseDarkColorsForSystemIntegratedUI.asInstanceOf[js.Any], shouldUseHighContrastColors = shouldUseHighContrastColors.asInstanceOf[js.Any], shouldUseInvertedColorScheme = shouldUseInvertedColorScheme.asInstanceOf[js.Any], themeSource = themeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeTheme] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: (updated, js.Function0[Unit]) => NativeTheme): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setInForcedColorsMode(value: Boolean): Self = StObject.set(x, "inForcedColorsMode", value.asInstanceOf[js.Any])
    
    inline def setOff(value: (updated, js.Function0[Unit]) => NativeTheme): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (updated, js.Function0[Unit]) => NativeTheme): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnce(value: (updated, js.Function0[Unit]) => NativeTheme): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    inline def setPrefersReducedTransparency(value: Boolean): Self = StObject.set(x, "prefersReducedTransparency", value.asInstanceOf[js.Any])
    
    inline def setRemoveListener(value: (updated, js.Function0[Unit]) => NativeTheme): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    inline def setShouldUseDarkColors(value: Boolean): Self = StObject.set(x, "shouldUseDarkColors", value.asInstanceOf[js.Any])
    
    inline def setShouldUseDarkColorsForSystemIntegratedUI(value: Boolean): Self = StObject.set(x, "shouldUseDarkColorsForSystemIntegratedUI", value.asInstanceOf[js.Any])
    
    inline def setShouldUseHighContrastColors(value: Boolean): Self = StObject.set(x, "shouldUseHighContrastColors", value.asInstanceOf[js.Any])
    
    inline def setShouldUseInvertedColorScheme(value: Boolean): Self = StObject.set(x, "shouldUseInvertedColorScheme", value.asInstanceOf[js.Any])
    
    inline def setThemeSource(value: system | light | dark): Self = StObject.set(x, "themeSource", value.asInstanceOf[js.Any])
  }
}
