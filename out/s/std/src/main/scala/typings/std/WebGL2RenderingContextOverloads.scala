package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGL2RenderingContextOverloads extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bufferData) */
  /* standard dom */
  def bufferData(target: GLenum, size: GLsizeiptr, usage: GLenum): Unit = js.native
  /* standard dom */
  def bufferData(target: GLenum, srcData: js.typedarray.ArrayBufferView, usage: GLenum, srcOffset: Double): Unit = js.native
  def bufferData(
    target: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    usage: GLenum,
    srcOffset: Double,
    length: GLuint
  ): Unit = js.native
  def bufferData(target: GLenum, srcData: Null, usage: GLenum): Unit = js.native
  /* standard dom */
  def bufferData(target: GLenum, srcData: AllowSharedBufferSource, usage: GLenum): Unit = js.native
  
  /* standard dom */
  def bufferSubData(target: GLenum, dstByteOffset: GLintptr, srcData: js.typedarray.ArrayBufferView, srcOffset: Double): Unit = js.native
  def bufferSubData(
    target: GLenum,
    dstByteOffset: GLintptr,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Double,
    length: GLuint
  ): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bufferSubData) */
  /* standard dom */
  def bufferSubData(target: GLenum, dstByteOffset: GLintptr, srcData: AllowSharedBufferSource): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexImage2D) */
  /* standard dom */
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    imageSize: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  /* standard dom */
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Double,
    srcLengthOverride: GLuint
  ): Unit = js.native
  def compressedTexImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLenum,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Unit,
    srcLengthOverride: GLuint
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D) */
  /* standard dom */
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    imageSize: GLsizei,
    offset: GLintptr
  ): Unit = js.native
  /* standard dom */
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Double,
    srcLengthOverride: GLuint
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Unit,
    srcLengthOverride: GLuint
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/readPixels) */
  /* standard dom */
  def readPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, `type`: GLenum): Unit = js.native
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    dstData: js.typedarray.ArrayBufferView
  ): Unit = js.native
  /* standard dom */
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    dstData: js.typedarray.ArrayBufferView,
    dstOffset: Double
  ): Unit = js.native
  /* standard dom */
  def readPixels(
    x: GLint,
    y: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    offset: GLintptr
  ): Unit = js.native
  
  /* standard dom */
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texImage2D) */
  /* standard dom */
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum
  ): Unit = js.native
  /* standard dom */
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    pboOffset: GLintptr
  ): Unit = js.native
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    pixels: js.typedarray.ArrayBufferView
  ): Unit = js.native
  /* standard dom */
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  /* standard dom */
  def texImage2D(
    target: GLenum,
    level: GLint,
    internalformat: GLint,
    width: GLsizei,
    height: GLsizei,
    border: GLint,
    format: GLenum,
    `type`: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  
  /* standard dom */
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texSubImage2D) */
  /* standard dom */
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum
  ): Unit = js.native
  /* standard dom */
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    pboOffset: GLintptr
  ): Unit = js.native
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    pixels: js.typedarray.ArrayBufferView
  ): Unit = js.native
  /* standard dom */
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    source: TexImageSource
  ): Unit = js.native
  /* standard dom */
  def texSubImage2D(
    target: GLenum,
    level: GLint,
    xoffset: GLint,
    yoffset: GLint,
    width: GLsizei,
    height: GLsizei,
    format: GLenum,
    `type`: GLenum,
    srcData: js.typedarray.ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform1fv(location: org.scalajs.dom.WebGLUniformLocation, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform1fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double
  ): Unit = js.native
  def uniform1fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1fv(location: Null, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform1fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double): Unit = js.native
  def uniform1fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform1fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform1iv(location: org.scalajs.dom.WebGLUniformLocation, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform1iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double
  ): Unit = js.native
  def uniform1iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform1iv(location: Null, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform1iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double): Unit = js.native
  def uniform1iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform1iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform2fv(location: org.scalajs.dom.WebGLUniformLocation, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform2fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double
  ): Unit = js.native
  def uniform2fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2fv(location: Null, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform2fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double): Unit = js.native
  def uniform2fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform2fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform2iv(location: org.scalajs.dom.WebGLUniformLocation, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform2iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double
  ): Unit = js.native
  def uniform2iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform2iv(location: Null, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform2iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double): Unit = js.native
  def uniform2iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform2iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform3fv(location: org.scalajs.dom.WebGLUniformLocation, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform3fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double
  ): Unit = js.native
  def uniform3fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3fv(location: Null, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform3fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double): Unit = js.native
  def uniform3fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform3fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform3iv(location: org.scalajs.dom.WebGLUniformLocation, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform3iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double
  ): Unit = js.native
  def uniform3iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform3iv(location: Null, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform3iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double): Unit = js.native
  def uniform3iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform3iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform4fv(location: org.scalajs.dom.WebGLUniformLocation, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform4fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double
  ): Unit = js.native
  def uniform4fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4fv(location: Null, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniform4fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double): Unit = js.native
  def uniform4fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform4fv(location: Null, data: Float32List | js.Iterable[GLfloat], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
  /* standard dom */
  /* standard dom.iterable */
  def uniform4iv(location: org.scalajs.dom.WebGLUniformLocation, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform4iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double
  ): Unit = js.native
  def uniform4iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4iv(
    location: org.scalajs.dom.WebGLUniformLocation,
    data: Int32List | js.Iterable[GLint],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniform4iv(location: Null, data: Int32List | js.Iterable[GLint]): Unit = js.native
  def uniform4iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double): Unit = js.native
  def uniform4iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Double, srcLength: GLuint): Unit = js.native
  def uniform4iv(location: Null, data: Int32List | js.Iterable[GLint], srcOffset: Unit, srcLength: GLuint): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix) */
  /* standard dom */
  /* standard dom.iterable */
  def uniformMatrix2fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: GLboolean, data: Float32List | js.Iterable[GLfloat], srcOffset: Double): Unit = js.native
  def uniformMatrix2fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix2fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
  /* standard dom */
  /* standard dom.iterable */
  def uniformMatrix3fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: GLboolean, data: Float32List | js.Iterable[GLfloat], srcOffset: Double): Unit = js.native
  def uniformMatrix3fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix3fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
  /* standard dom */
  /* standard dom.iterable */
  def uniformMatrix4fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat]
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(
    location: org.scalajs.dom.WebGLUniformLocation,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List | js.Iterable[GLfloat]): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: GLboolean, data: Float32List | js.Iterable[GLfloat], srcOffset: Double): Unit = js.native
  def uniformMatrix4fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Double,
    srcLength: GLuint
  ): Unit = js.native
  def uniformMatrix4fv(
    location: Null,
    transpose: GLboolean,
    data: Float32List | js.Iterable[GLfloat],
    srcOffset: Unit,
    srcLength: GLuint
  ): Unit = js.native
}
