(ns com.google.cloud.translate.TranslateException
  "Google Translation service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate TranslateException]))

(defn ->translate-exception
  "Constructor.

  exception - `java.io.IOException`"
  (^TranslateException [^java.io.IOException exception]
    (new TranslateException exception)))

