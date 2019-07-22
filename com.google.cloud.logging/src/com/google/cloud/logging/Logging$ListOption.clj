(ns com.google.cloud.logging.Logging$ListOption
  "Class for specifying options for listing sinks, monitored resources and monitored resource
  descriptors."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Logging$ListOption]))

(defn *page-size
  "Returns an option to specify the maximum number of resources returned per page.

  page-size - `int`

  returns: `com.google.cloud.logging.Logging$ListOption`"
  (^com.google.cloud.logging.Logging$ListOption [^Integer page-size]
    (Logging$ListOption/pageSize page-size)))

(defn *page-token
  "Returns an option to specify the page token from which to start listing resources.

  page-token - `java.lang.String`

  returns: `com.google.cloud.logging.Logging$ListOption`"
  (^com.google.cloud.logging.Logging$ListOption [^java.lang.String page-token]
    (Logging$ListOption/pageToken page-token)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Logging$ListOption this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Logging$ListOption this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Logging$ListOption this]
    (-> this (.toString))))

