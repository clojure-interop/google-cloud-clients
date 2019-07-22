(ns com.google.cloud.translate.TranslateOptions$DefaultTranslateRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate TranslateOptions$DefaultTranslateRpcFactory]))

(defn ->default-translate-rpc-factory
  "Constructor."
  (^TranslateOptions$DefaultTranslateRpcFactory []
    (new TranslateOptions$DefaultTranslateRpcFactory )))

(defn create
  "options - `com.google.cloud.translate.TranslateOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^TranslateOptions$DefaultTranslateRpcFactory this ^com.google.cloud.translate.TranslateOptions options]
    (-> this (.create options))))

