(ns com.google.cloud.compute.v1.LogConfigDataAccessOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfigDataAccessOptions]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.LogConfigDataAccessOptions`

  returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder [^com.google.cloud.compute.v1.LogConfigDataAccessOptions prototype]
    (LogConfigDataAccessOptions/newBuilder prototype))
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder []
    (LogConfigDataAccessOptions/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions []
    (LogConfigDataAccessOptions/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^LogConfigDataAccessOptions this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^LogConfigDataAccessOptions this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^LogConfigDataAccessOptions this]
    (-> this (.getFieldMask))))

(defn get-log-mode
  "Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant only
   in the LocalIAM implementation, for now.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigDataAccessOptions this]
    (-> this (.getLogMode))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder [^LogConfigDataAccessOptions this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogConfigDataAccessOptions this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LogConfigDataAccessOptions this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LogConfigDataAccessOptions this]
    (-> this (.hashCode))))

