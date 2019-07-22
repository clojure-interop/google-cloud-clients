(ns com.google.cloud.compute.v1.Errors$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Errors$Builder]))

(defn get-location
  "[Output Only] Indicates the field in the request that caused the error. This property is
   optional.

  returns: `java.lang.String`"
  (^java.lang.String [^Errors$Builder this]
    (-> this (.getLocation))))

(defn set-location
  "[Output Only] Indicates the field in the request that caused the error. This property is
   optional.

  location - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Errors$Builder`"
  (^com.google.cloud.compute.v1.Errors$Builder [^Errors$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn get-code
  "[Output Only] The error type identifier for this error.

  returns: `java.lang.String`"
  (^java.lang.String [^Errors$Builder this]
    (-> this (.getCode))))

(defn build
  "returns: `com.google.cloud.compute.v1.Errors`"
  (^com.google.cloud.compute.v1.Errors [^Errors$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Errors`

  returns: `com.google.cloud.compute.v1.Errors$Builder`"
  (^com.google.cloud.compute.v1.Errors$Builder [^Errors$Builder this ^com.google.cloud.compute.v1.Errors other]
    (-> this (.mergeFrom other))))

(defn set-code
  "[Output Only] The error type identifier for this error.

  code - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Errors$Builder`"
  (^com.google.cloud.compute.v1.Errors$Builder [^Errors$Builder this ^java.lang.String code]
    (-> this (.setCode code))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Errors$Builder`"
  (^com.google.cloud.compute.v1.Errors$Builder [^Errors$Builder this]
    (-> this (.clone))))

(defn get-message
  "[Output Only] An optional, human-readable error message.

  returns: `java.lang.String`"
  (^java.lang.String [^Errors$Builder this]
    (-> this (.getMessage))))

(defn set-message
  "[Output Only] An optional, human-readable error message.

  message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Errors$Builder`"
  (^com.google.cloud.compute.v1.Errors$Builder [^Errors$Builder this ^java.lang.String message]
    (-> this (.setMessage message))))

