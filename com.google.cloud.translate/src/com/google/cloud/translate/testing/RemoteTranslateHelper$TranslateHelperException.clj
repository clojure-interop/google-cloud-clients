(ns com.google.cloud.translate.testing.RemoteTranslateHelper$TranslateHelperException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.testing RemoteTranslateHelper$TranslateHelperException]))

(defn ->translate-helper-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^RemoteTranslateHelper$TranslateHelperException [^java.lang.String message ^java.lang.Throwable cause]
    (new RemoteTranslateHelper$TranslateHelperException message cause))
  (^RemoteTranslateHelper$TranslateHelperException [^java.lang.String message]
    (new RemoteTranslateHelper$TranslateHelperException message)))

(defn *translate
  "ex - `java.lang.Exception`

  returns: `com.google.cloud.translate.testing.RemoteTranslateHelper$TranslateHelperException`"
  (^com.google.cloud.translate.testing.RemoteTranslateHelper$TranslateHelperException [^java.lang.Exception ex]
    (RemoteTranslateHelper$TranslateHelperException/translate ex)))

