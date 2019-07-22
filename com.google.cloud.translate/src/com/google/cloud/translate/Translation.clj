(ns com.google.cloud.translate.Translation
  "Information about a translation. Objects of this class contain the translated text and the source
  language's code. The source language's code can be optionally specified by the user or
  automatically detected by the Google Translation service."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate Translation]))

(defn get-translated-text
  "Returns the translated text.

  returns: `java.lang.String`"
  (^java.lang.String [^Translation this]
    (-> this (.getTranslatedText))))

(defn get-source-language
  "Returns the language code of the source text. If no source language was provided this value is
   the source language as detected by the Google Translation service.

  returns: `java.lang.String`"
  (^java.lang.String [^Translation this]
    (-> this (.getSourceLanguage))))

(defn get-model
  "Returns the translation model used to translate the text. This value is only available if a
   result from Translate.TranslateOption.model(String) was passed to Translate.translate(List, Translate.TranslateOption...).

   Please note that you must be whitelisted to use the Translate.TranslateOption.model(String) option, otherwise translation will fail.

  returns: `java.lang.String`"
  (^java.lang.String [^Translation this]
    (-> this (.getModel))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Translation this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Translation this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Translation this ^java.lang.Object obj]
    (-> this (.equals obj))))

