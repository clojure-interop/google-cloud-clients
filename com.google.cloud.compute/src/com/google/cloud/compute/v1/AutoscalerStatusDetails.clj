(ns com.google.cloud.compute.v1.AutoscalerStatusDetails
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalerStatusDetails]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AutoscalerStatusDetails`

  returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder [^com.google.cloud.compute.v1.AutoscalerStatusDetails prototype]
    (AutoscalerStatusDetails/newBuilder prototype))
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder []
    (AutoscalerStatusDetails/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails []
    (AutoscalerStatusDetails/getDefaultInstance )))

(defn get-type
  "The type of error returned.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerStatusDetails this]
    (-> this (.getType))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AutoscalerStatusDetails this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerStatusDetails this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AutoscalerStatusDetails this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AutoscalerStatusDetails this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AutoscalerStatusDetails this]
    (-> this (.hashCode))))

(defn get-message
  "The status message.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerStatusDetails this]
    (-> this (.getMessage))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AutoscalerStatusDetails this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder [^AutoscalerStatusDetails this]
    (-> this (.toBuilder))))

