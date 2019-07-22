(ns com.google.cloud.translate.TranslateOptions$DefaultTranslateFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate TranslateOptions$DefaultTranslateFactory]))

(defn ->default-translate-factory
  "Constructor."
  (^TranslateOptions$DefaultTranslateFactory []
    (new TranslateOptions$DefaultTranslateFactory )))

(defn create
  "options - `com.google.cloud.translate.TranslateOptions`

  returns: `com.google.cloud.translate.Translate`"
  (^com.google.cloud.translate.Translate [^TranslateOptions$DefaultTranslateFactory this ^com.google.cloud.translate.TranslateOptions options]
    (-> this (.create options))))

