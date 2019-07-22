(ns com.google.cloud.storage.Cors
  "Cross-Origin Resource Sharing (CORS) configuration for a bucket."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Cors]))

(defn *new-builder
  "Returns a CORS configuration builder.

  returns: `com.google.cloud.storage.Cors$Builder`"
  (^com.google.cloud.storage.Cors$Builder []
    (Cors/newBuilder )))

(defn get-max-age-seconds
  "Returns the max time in seconds in which a client can issue requests before sending a new
   preflight request.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Cors this]
    (-> this (.getMaxAgeSeconds))))

(defn get-methods
  "Returns the HTTP methods supported by this CORS configuration.

  returns: `java.util.List<com.google.cloud.storage.HttpMethod>`"
  (^java.util.List [^Cors this]
    (-> this (.getMethods))))

(defn get-origins
  "Returns the origins in this CORS configuration.

  returns: `java.util.List<com.google.cloud.storage.Cors$Origin>`"
  (^java.util.List [^Cors this]
    (-> this (.getOrigins))))

(defn get-response-headers
  "Returns the response headers supported by this CORS configuration.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Cors this]
    (-> this (.getResponseHeaders))))

(defn to-builder
  "Returns a builder for this CORS configuration.

  returns: `com.google.cloud.storage.Cors$Builder`"
  (^com.google.cloud.storage.Cors$Builder [^Cors this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Cors this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Cors this ^java.lang.Object obj]
    (-> this (.equals obj))))

