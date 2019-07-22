(ns com.google.cloud.translate.Translate$TranslateOption
  "Class for specifying translate options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate Translate$TranslateOption]))

(defn *source-language
  "Returns an option for setting the source language. If not provided, Google Translation will
   try to detect the language of the text to translate.

  source-language - the source language code - `java.lang.String`

  returns: `com.google.cloud.translate.Translate$TranslateOption`"
  (^com.google.cloud.translate.Translate$TranslateOption [^java.lang.String source-language]
    (Translate$TranslateOption/sourceLanguage source-language)))

(defn *target-language
  "Returns an option for setting the target language. If this option is not provided, the value
   returned by TranslateOptions.getTargetLanguage() is used.

  target-language - the target language code - `java.lang.String`

  returns: `com.google.cloud.translate.Translate$TranslateOption`"
  (^com.google.cloud.translate.Translate$TranslateOption [^java.lang.String target-language]
    (Translate$TranslateOption/targetLanguage target-language)))

(defn *model
  "Sets the language translation model. You can use this parameter to take advantage of Neural
   Machine Translation. Possible values are base and nmt. Google Translation
   could use a different model to translate your text: use Translation.getModel() to
   know which model was used for translation. Please note that you must be whitelisted to use
   this option, otherwise translation will fail.

  model - the language translation model - `java.lang.String`

  returns: `com.google.cloud.translate.Translate$TranslateOption`"
  (^com.google.cloud.translate.Translate$TranslateOption [^java.lang.String model]
    (Translate$TranslateOption/model model)))

(defn *format
  "Sets the format of the source text, in either HTML (default) or plain-text. A value of html indicates HTML and a value of text indicates plain-text.

  format - the format of the source text - `java.lang.String`

  returns: `com.google.cloud.translate.Translate$TranslateOption`"
  (^com.google.cloud.translate.Translate$TranslateOption [^java.lang.String format]
    (Translate$TranslateOption/format format)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Translate$TranslateOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Translate$TranslateOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Translate$TranslateOption this]
    (-> this (.toString))))

