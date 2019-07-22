(ns com.google.cloud.translate.Detection
  "Information about a language detection. Objects of this class contain the detected language and
  possibly a confidence level."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate Detection]))

(defn get-language
  "Returns the code of the detected language.

  returns: `java.lang.String`"
  (^java.lang.String [^Detection this]
    (-> this (.getLanguage))))

(defn get-confidence
  "Returns an optional confidence value in the interval [0,1]. The closer this value is to 1, the
   higher the confidence level for the language detection. Note that this value is not always
   available.

  returns: `float`"
  (^Float [^Detection this]
    (-> this (.getConfidence))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Detection this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Detection this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Detection this ^java.lang.Object obj]
    (-> this (.equals obj))))

