(ns com.google.cloud.storage.Cors$Builder
  "CORS configuration builder."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Cors$Builder]))

(defn set-max-age-seconds
  "Sets the max time in seconds in which a client can issue requests before sending a new
   preflight request.

  max-age-seconds - `java.lang.Integer`

  returns: `com.google.cloud.storage.Cors$Builder`"
  (^com.google.cloud.storage.Cors$Builder [^Cors$Builder this ^java.lang.Integer max-age-seconds]
    (-> this (.setMaxAgeSeconds max-age-seconds))))

(defn set-methods
  "Sets the HTTP methods supported by this CORS configuration.

  methods - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Cors$Builder`"
  (^com.google.cloud.storage.Cors$Builder [^Cors$Builder this ^java.lang.Iterable methods]
    (-> this (.setMethods methods))))

(defn set-origins
  "Sets the origins for this CORS configuration.

  origins - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Cors$Builder`"
  (^com.google.cloud.storage.Cors$Builder [^Cors$Builder this ^java.lang.Iterable origins]
    (-> this (.setOrigins origins))))

(defn set-response-headers
  "Sets the response headers supported by this CORS configuration.

  headers - `java.lang.Iterable`

  returns: `com.google.cloud.storage.Cors$Builder`"
  (^com.google.cloud.storage.Cors$Builder [^Cors$Builder this ^java.lang.Iterable headers]
    (-> this (.setResponseHeaders headers))))

(defn build
  "Creates a CORS configuration.

  returns: `com.google.cloud.storage.Cors`"
  (^com.google.cloud.storage.Cors [^Cors$Builder this]
    (-> this (.build))))

