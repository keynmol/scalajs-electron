package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.stdStrings.`2-digit`
import typings.std.stdStrings.`best fit`
import typings.std.stdStrings.`case`
import typings.std.stdStrings.`false`
import typings.std.stdStrings.accent
import typings.std.stdStrings.base
import typings.std.stdStrings.basic
import typings.std.stdStrings.big5han
import typings.std.stdStrings.compat
import typings.std.stdStrings.dict
import typings.std.stdStrings.direct
import typings.std.stdStrings.ducet
import typings.std.stdStrings.emoji
import typings.std.stdStrings.eor
import typings.std.stdStrings.gb2312
import typings.std.stdStrings.long
import typings.std.stdStrings.longGeneric
import typings.std.stdStrings.longOffset
import typings.std.stdStrings.lookup
import typings.std.stdStrings.lower
import typings.std.stdStrings.narrow
import typings.std.stdStrings.numeric
import typings.std.stdStrings.phonebk
import typings.std.stdStrings.phonetic
import typings.std.stdStrings.pinyin
import typings.std.stdStrings.reformed
import typings.std.stdStrings.search
import typings.std.stdStrings.searchjl
import typings.std.stdStrings.short
import typings.std.stdStrings.shortGeneric
import typings.std.stdStrings.shortOffset
import typings.std.stdStrings.sort
import typings.std.stdStrings.stroke
import typings.std.stdStrings.trad
import typings.std.stdStrings.unihan
import typings.std.stdStrings.upper
import typings.std.stdStrings.variant
import typings.std.stdStrings.zhuyin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  trait Collator extends StObject {
    
    /* standard es5 */
    def compare(x: java.lang.String, y: java.lang.String): Double
    
    /* standard es5 */
    def resolvedOptions(): ResolvedCollatorOptions
  }
  object Collator {
    
    inline def apply(
      compare: (java.lang.String, java.lang.String) => Double,
      resolvedOptions: () => ResolvedCollatorOptions
    ): Collator = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[Collator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collator] (val x: Self) extends AnyVal {
      
      inline def setCompare(value: (java.lang.String, java.lang.String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      inline def setResolvedOptions(value: () => ResolvedCollatorOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CollatorConstructor
    extends StObject
       with /* standard es5 */
  Instantiable0[Collator]
       with Instantiable1[
          (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
          Collator
        ]
       with Instantiable2[
          (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String) | (/* locales */ Unit), 
          /* options */ CollatorOptions, 
          Collator
        ] {
    
    /* standard es5 */
    def apply(): Collator = js.native
    def apply(locales: java.lang.String): Collator = js.native
    def apply(locales: java.lang.String, options: CollatorOptions): Collator = js.native
    def apply(locales: js.Array[java.lang.String]): Collator = js.native
    def apply(locales: js.Array[java.lang.String], options: CollatorOptions): Collator = js.native
    def apply(locales: Unit, options: CollatorOptions): Collator = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: CollatorOptions): js.Array[java.lang.String] = js.native
  }
  
  trait CollatorOptions extends StObject {
    
    /* standard es5 */
    var caseFirst: js.UndefOr[upper | lower | `false`] = js.undefined
    
    /* standard es5 */
    var collation: js.UndefOr[
        big5han | compat | dict | direct | ducet | emoji | eor | gb2312 | phonebk | phonetic | pinyin | reformed | searchjl | stroke | trad | unihan | zhuyin
      ] = js.undefined
    
    /* standard es5 */
    var ignorePunctuation: js.UndefOr[scala.Boolean] = js.undefined
    
    /* standard es5 */
    var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
    
    /* standard es5 */
    var numeric: js.UndefOr[scala.Boolean] = js.undefined
    
    /* standard es5 */
    var sensitivity: js.UndefOr[base | accent | `case` | variant] = js.undefined
    
    /* standard es5 */
    var usage: js.UndefOr[sort | search] = js.undefined
  }
  object CollatorOptions {
    
    inline def apply(): CollatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollatorOptions] (val x: Self) extends AnyVal {
      
      inline def setCaseFirst(value: upper | lower | `false`): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
      
      inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
      
      inline def setCollation(
        value: big5han | compat | dict | direct | ducet | emoji | eor | gb2312 | phonebk | phonetic | pinyin | reformed | searchjl | stroke | trad | unihan | zhuyin
      ): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
      
      inline def setIgnorePunctuation(value: scala.Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      inline def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
      
      inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setNumeric(value: scala.Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      inline def setSensitivity(value: base | accent | `case` | variant): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      inline def setUsage(value: sort | search): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  @js.native
  trait DateTimeFormat extends StObject {
    
    /* standard es5 */
    def format(): java.lang.String = js.native
    def format(date: js.Date): java.lang.String = js.native
    def format(date: Double): java.lang.String = js.native
    
    /* standard es5 */
    def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
  }
  
  @js.native
  trait DateTimeFormatConstructor
    extends StObject
       with /* standard es5 */
  Instantiable0[DateTimeFormat]
       with Instantiable1[
          (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
          DateTimeFormat
        ]
       with Instantiable2[
          (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String) | (/* locales */ Unit), 
          /* options */ DateTimeFormatOptions, 
          DateTimeFormat
        ] {
    
    /* standard es5 */
    def apply(): DateTimeFormat = js.native
    def apply(locales: java.lang.String): DateTimeFormat = js.native
    def apply(locales: java.lang.String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[java.lang.String]): DateTimeFormat = js.native
    def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: Unit, options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
  }
  
  trait DateTimeFormatOptions extends StObject {
    
    /* standard es5 */
    var day: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    /* standard es5 */
    var era: js.UndefOr[long | short | narrow] = js.undefined
    
    /* standard es5 */
    var formatMatcher: js.UndefOr[(`best fit`) | basic] = js.undefined
    
    /* standard es5 */
    var hour: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    /* standard es5 */
    var hour12: js.UndefOr[scala.Boolean] = js.undefined
    
    /* standard es5 */
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
    
    /* standard es5 */
    var minute: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    /* standard es5 */
    var month: js.UndefOr[numeric | `2-digit` | long | short | narrow] = js.undefined
    
    /* standard es5 */
    var second: js.UndefOr[numeric | `2-digit`] = js.undefined
    
    /* standard es5 */
    var timeZone: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var timeZoneName: js.UndefOr[short | long | shortOffset | longOffset | shortGeneric | longGeneric] = js.undefined
    
    /* standard es5 */
    var weekday: js.UndefOr[long | short | narrow] = js.undefined
    
    /* standard es5 */
    var year: js.UndefOr[numeric | `2-digit`] = js.undefined
  }
  object DateTimeFormatOptions {
    
    inline def apply(): DateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setDay(value: numeric | `2-digit`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEra(value: long | short | narrow): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setFormatMatcher(value: (`best fit`) | basic): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      inline def setHour(value: numeric | `2-digit`): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHour12(value: scala.Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setMinute(value: numeric | `2-digit`): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: numeric | `2-digit` | long | short | narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setSecond(value: numeric | `2-digit`): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setTimeZone(value: java.lang.String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: short | long | shortOffset | longOffset | shortGeneric | longGeneric): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      inline def setWeekday(value: long | short | narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: numeric | `2-digit`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait NumberFormat extends StObject {
    
    /* standard es5 */
    def format(value: Double): java.lang.String
    
    /* standard es5 */
    def resolvedOptions(): ResolvedNumberFormatOptions
  }
  object NumberFormat {
    
    inline def apply(format: Double => java.lang.String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[NumberFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: Double => java.lang.String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setResolvedOptions(value: () => ResolvedNumberFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait NumberFormatConstructor
    extends StObject
       with /* standard es5 */
  Instantiable0[NumberFormat]
       with Instantiable1[
          (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
          NumberFormat
        ]
       with Instantiable2[
          (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String) | (/* locales */ Unit), 
          /* options */ NumberFormatOptions, 
          NumberFormat
        ] {
    
    /* standard es5 */
    def apply(): NumberFormat = js.native
    def apply(locales: java.lang.String): NumberFormat = js.native
    def apply(locales: java.lang.String, options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: js.Array[java.lang.String]): NumberFormat = js.native
    def apply(locales: js.Array[java.lang.String], options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: Unit, options: NumberFormatOptions): NumberFormat = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: NumberFormatOptions): js.Array[java.lang.String] = js.native
  }
  
  trait NumberFormatOptions extends StObject {
    
    /* standard es5 */
    var currency: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var currencyDisplay: js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.undefined
    
    /* standard es5 */
    var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
    
    /* standard es5 */
    var maximumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var minimumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var style: js.UndefOr[NumberFormatOptionsStyle] = js.undefined
    
    /* standard es5 */
    var useGrouping: js.UndefOr[NumberFormatOptionsUseGrouping] = js.undefined
  }
  object NumberFormatOptions {
    
    inline def apply(): NumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
      
      inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
      
      inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
      
      inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
      
      inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
      
      inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
      
      inline def setStyle(value: NumberFormatOptionsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUseGrouping(value: NumberFormatOptionsUseGrouping): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
      
      inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.stdStrings.code
    - typings.std.stdStrings.symbol
    - typings.std.stdStrings.name
  */
  trait NumberFormatOptionsCurrencyDisplay extends StObject
  
  trait NumberFormatOptionsCurrencyDisplayRegistry extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.stdStrings.decimal
    - typings.std.stdStrings.percent
    - typings.std.stdStrings.currency
  */
  trait NumberFormatOptionsStyle extends StObject
  
  trait NumberFormatOptionsStyleRegistry extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    {} extends std.Intl.NumberFormatOptionsUseGroupingRegistry ? boolean : keyof std.Intl.NumberFormatOptionsUseGroupingRegistry | 'true' | 'false' | boolean
    }}}
    */
  type NumberFormatOptionsUseGrouping = scala.Boolean
  
  trait NumberFormatOptionsUseGroupingRegistry extends StObject
  
  trait ResolvedCollatorOptions extends StObject {
    
    /* standard es5 */
    var caseFirst: java.lang.String
    
    /* standard es5 */
    var collation: java.lang.String
    
    /* standard es5 */
    var ignorePunctuation: scala.Boolean
    
    /* standard es5 */
    var locale: java.lang.String
    
    /* standard es5 */
    var numeric: scala.Boolean
    
    /* standard es5 */
    var sensitivity: java.lang.String
    
    /* standard es5 */
    var usage: java.lang.String
  }
  object ResolvedCollatorOptions {
    
    inline def apply(
      caseFirst: java.lang.String,
      collation: java.lang.String,
      ignorePunctuation: scala.Boolean,
      locale: java.lang.String,
      numeric: scala.Boolean,
      sensitivity: java.lang.String,
      usage: java.lang.String
    ): ResolvedCollatorOptions = {
      val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedCollatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedCollatorOptions] (val x: Self) extends AnyVal {
      
      inline def setCaseFirst(value: java.lang.String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
      
      inline def setCollation(value: java.lang.String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      inline def setIgnorePunctuation(value: scala.Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNumeric(value: scala.Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setSensitivity(value: java.lang.String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: java.lang.String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolvedDateTimeFormatOptions extends StObject {
    
    /* standard es5 */
    var calendar: java.lang.String
    
    /* standard es5 */
    var day: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var era: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var hour: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var hour12: js.UndefOr[scala.Boolean] = js.undefined
    
    /* standard es5 */
    var locale: java.lang.String
    
    /* standard es5 */
    var minute: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var month: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var numberingSystem: java.lang.String
    
    /* standard es5 */
    var second: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var timeZone: java.lang.String
    
    /* standard es5 */
    var timeZoneName: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var weekday: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var year: js.UndefOr[java.lang.String] = js.undefined
  }
  object ResolvedDateTimeFormatOptions {
    
    inline def apply(
      calendar: java.lang.String,
      locale: java.lang.String,
      numberingSystem: java.lang.String,
      timeZone: java.lang.String
    ): ResolvedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedDateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setCalendar(value: java.lang.String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setDay(value: java.lang.String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setEra(value: java.lang.String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      inline def setHour(value: java.lang.String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHour12(value: scala.Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      inline def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: java.lang.String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: java.lang.String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setNumberingSystem(value: java.lang.String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: java.lang.String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setTimeZone(value: java.lang.String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: java.lang.String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      inline def setWeekday(value: java.lang.String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: java.lang.String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait ResolvedNumberFormatOptions extends StObject {
    
    /* standard es5 */
    var currency: js.UndefOr[java.lang.String] = js.undefined
    
    /* standard es5 */
    var currencyDisplay: js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.undefined
    
    /* standard es5 */
    var locale: java.lang.String
    
    /* standard es5 */
    var maximumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var minimumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var minimumIntegerDigits: Double
    
    /* standard es5 */
    var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
    
    /* standard es5 */
    var numberingSystem: java.lang.String
    
    /* standard es5 */
    var style: NumberFormatOptionsStyle
    
    /* standard es5 */
    var useGrouping: ResolvedNumberFormatOptionsUseGrouping
  }
  object ResolvedNumberFormatOptions {
    
    inline def apply(
      locale: java.lang.String,
      minimumIntegerDigits: Double,
      numberingSystem: java.lang.String,
      style: NumberFormatOptionsStyle,
      useGrouping: ResolvedNumberFormatOptionsUseGrouping
    ): ResolvedNumberFormatOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedNumberFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedNumberFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
      
      inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
      
      inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
      
      inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
      
      inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
      
      inline def setNumberingSystem(value: java.lang.String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: NumberFormatOptionsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setUseGrouping(value: ResolvedNumberFormatOptionsUseGrouping): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    {} extends std.Intl.NumberFormatOptionsUseGroupingRegistry ? boolean : keyof std.Intl.NumberFormatOptionsUseGroupingRegistry | false
    }}}
    */
  type ResolvedNumberFormatOptionsUseGrouping = scala.Boolean
}
