(ns com.google.cloud.translate.spi.v2.HttpTranslateRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.spi.v2 HttpTranslateRpc]))

(defn ->http-translate-rpc
  "Constructor.

  options - `com.google.cloud.translate.TranslateOptions`"
  (^HttpTranslateRpc [^com.google.cloud.translate.TranslateOptions options]
    (new HttpTranslateRpc options)))

(defn detect
  "Description copied from interface: TranslateRpc

  texts - the texts to translate - `java.util.List`

  returns: a list of lists of detections, one list of detections for each provided text, in order - `java.util.List<java.util.List<com.google.api.services.translate.model.DetectionsResourceItems>>`"
  (^java.util.List [^HttpTranslateRpc this ^java.util.List texts]
    (-> this (.detect texts))))

(defn list-supported-languages
  "Description copied from interface: TranslateRpc

  option-map - options to listing language translations - `java.util.Map`

  returns: `java.util.List<com.google.api.services.translate.model.LanguagesResource>`"
  (^java.util.List [^HttpTranslateRpc this ^java.util.Map option-map]
    (-> this (.listSupportedLanguages option-map))))

(defn translate
  "Description copied from interface: TranslateRpc

  texts - the texts to translate - `java.util.List`
  option-map - options to text translation - `java.util.Map`

  returns: a list of resources containing translation information, in the same order of the
       provided texts - `java.util.List<com.google.api.services.translate.model.TranslationsResource>`"
  (^java.util.List [^HttpTranslateRpc this ^java.util.List texts ^java.util.Map option-map]
    (-> this (.translate texts option-map))))

