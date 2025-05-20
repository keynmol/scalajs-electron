package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffscreenSharedTexture extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/offscreen-shared-texture
  /**
    * Release the resources. The `texture` cannot be directly passed to another
    * process, users need to maintain texture lifecycles in main process, but it is
    * safe to pass the `textureInfo` to another process. Only a limited number of
    * textures can exist at the same time, so it's important that you call
    * `texture.release()` as soon as you're done with the texture.
    */
  def release(): Unit
  
  /**
    * The shared texture info.
    */
  var textureInfo: TextureInfo
}
object OffscreenSharedTexture {
  
  inline def apply(release: () => Unit, textureInfo: TextureInfo): OffscreenSharedTexture = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), textureInfo = textureInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffscreenSharedTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffscreenSharedTexture] (val x: Self) extends AnyVal {
    
    inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    inline def setTextureInfo(value: TextureInfo): Self = StObject.set(x, "textureInfo", value.asInstanceOf[js.Any])
  }
}
