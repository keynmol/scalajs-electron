package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Planes extends StObject {
  
  /**
    * File descriptor for the underlying memory object (usually dmabuf).
    */
  var fd: Double
  
  /**
    * The strides and offsets in bytes to be used when accessing the buffers via a
    * memory mapping. One per plane per entry.
    */
  var offset: Double
  
  /**
    * Size in bytes of the plane. This is necessary to map the buffers.
    */
  var size: Double
  
  /**
    * The strides and offsets in bytes to be used when accessing the buffers via a
    * memory mapping. One per plane per entry.
    */
  var stride: Double
}
object Planes {
  
  inline def apply(fd: Double, offset: Double, size: Double, stride: Double): Planes = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Planes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Planes] (val x: Self) extends AnyVal {
    
    inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
  }
}
