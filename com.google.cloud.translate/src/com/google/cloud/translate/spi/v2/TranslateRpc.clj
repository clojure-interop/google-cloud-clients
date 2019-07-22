(ns com.google.cloud.translate.spi.v2.TranslateRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.spi.v2 TranslateRpc]))

(defn list-supported-languages
  "Returns a list of the languages supported by Google Translation.

  option-map - options to listing language translations - `java.util.Map`

  returns: `java.util.List<com.google.api.services.translate.model.LanguagesResource>`"
  (^java.util.List [^TranslateRpc this ^java.util.Map option-map]
    (-> this (.listSupportedLanguages option-map))))

(defn detect
  "Detects the language of the provided texts.

  texts - the texts to translate - `java.util.List`

  returns: a list of lists of detections, one list of detections for each provided text, in order - `java.util.List<java.util.List<com.google.api.services.translate.model.DetectionsResourceItems>>`"
  (^java.util.List [^TranslateRpc this ^java.util.List texts]
    (-> this (.detect texts))))

(defn translate
  "Translates the provided texts.

  texts - the texts to translate - `java.util.List`
  option-map - options to text translation - `java.util.Map`

  returns: a list of resources containing translation information, in the same order of the
       provided texts - `java.util.List<com.google.api.services.translate.model.TranslationsResource>`"
  (^java.util.List [^TranslateRpc this ^java.util.List texts ^java.util.Map option-map]
    (-> this (.translate texts option-map))))

