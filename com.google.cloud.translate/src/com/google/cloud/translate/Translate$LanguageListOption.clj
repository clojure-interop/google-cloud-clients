(ns com.google.cloud.translate.Translate$LanguageListOption
  "Class for specifying supported language listing options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate Translate$LanguageListOption]))

(defn *target-language
  "Returns an option for setting the target language. If this option is not provided, the value
   returned by TranslateOptions.getTargetLanguage() is used. When provided, the returned
   Language.getName() will be in the language specified by the targetLanguage
   code.

  target-language - the target language code - `java.lang.String`

  returns: `com.google.cloud.translate.Translate$LanguageListOption`"
  (^com.google.cloud.translate.Translate$LanguageListOption [^java.lang.String target-language]
    (Translate$LanguageListOption/targetLanguage target-language)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Translate$LanguageListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Translate$LanguageListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Translate$LanguageListOption this]
    (-> this (.toString))))

