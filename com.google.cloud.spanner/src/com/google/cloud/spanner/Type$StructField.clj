(ns com.google.cloud.spanner.Type$StructField
  "Describes an individual field in a STRUCT type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Type$StructField]))

(defn *of
  "name - `java.lang.String`
  type - `com.google.cloud.spanner.Type`

  returns: `com.google.cloud.spanner.Type$StructField`"
  (^com.google.cloud.spanner.Type$StructField [^java.lang.String name ^com.google.cloud.spanner.Type type]
    (Type$StructField/of name type)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Type$StructField this]
    (-> this (.getName))))

(defn get-type
  "returns: `com.google.cloud.spanner.Type`"
  (^com.google.cloud.spanner.Type [^Type$StructField this]
    (-> this (.getType))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Type$StructField this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Type$StructField this]
    (-> this (.hashCode))))

