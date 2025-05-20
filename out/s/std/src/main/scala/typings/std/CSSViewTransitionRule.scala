package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSViewTransitionRule
  extends StObject
     with CSSRule {
  
  /* standard dom */
  val navigation: java.lang.String
  
  /* standard dom */
  val types: js.Array[java.lang.String]
}
object CSSViewTransitionRule {
  
  inline def apply(
    cssText: java.lang.String,
    navigation: java.lang.String,
    `type`: Double,
    types: js.Array[java.lang.String]
  ): CSSViewTransitionRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, COUNTER_STYLE_RULE = 11, FONT_FACE_RULE = 5, FONT_FEATURE_VALUES_RULE = 14, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSViewTransitionRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSViewTransitionRule] (val x: Self) extends AnyVal {
    
    inline def setNavigation(value: java.lang.String): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
