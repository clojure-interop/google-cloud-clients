(ns com.google.cloud.translate.Language
  "Information about a language supported by Google Translation. Objects of this class contain the
  language's code and the language name."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate Language]))

(defn get-code
  "Returns the code of the language.

  returns: `java.lang.String`"
  (^java.lang.String [^Language this]
    (-> this (.getCode))))

(defn get-name
  "Returns the name of the language.

  returns: `java.lang.String`"
  (^java.lang.String [^Language this]
    (-> this (.getName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Language this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Language this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Language this ^java.lang.Object obj]
    (-> this (.equals obj))))

