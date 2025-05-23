package typings.electron.Electron

import typings.electron.electronStrings.best
import typings.electron.electronStrings.better
import typings.electron.electronStrings.good
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeOptions extends StObject {
  
  /**
    * Defaults to the image's height.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The desired quality of the resize image. Possible values include `good`,
    * `better`, or `best`. The default is `best`. These values express a desired
    * quality/speed tradeoff. They are translated into an algorithm-specific method
    * that depends on the capabilities (CPU, GPU) of the underlying platform. It is
    * possible for all three methods to be mapped to the same algorithm on a given
    * platform.
    */
  var quality: js.UndefOr[good | better | best] = js.undefined
  
  /**
    * Defaults to the image's width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ResizeOptions {
  
  inline def apply(): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setQuality(value: good | better | best): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
