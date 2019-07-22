(ns com.google.cloud.compute.v1.RouterStatusResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatusResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterStatusResponse`

  returns: `com.google.cloud.compute.v1.RouterStatusResponse$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusResponse$Builder [^com.google.cloud.compute.v1.RouterStatusResponse prototype]
    (RouterStatusResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterStatusResponse$Builder []
    (RouterStatusResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterStatusResponse`"
  (^com.google.cloud.compute.v1.RouterStatusResponse []
    (RouterStatusResponse/getDefaultInstance )))

(defn get-kind
  "Type of resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusResponse this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusResponse this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusResponse this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterStatusResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterStatusResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterStatusResponse this]
    (-> this (.hashCode))))

(defn get-result
  "returns: `com.google.cloud.compute.v1.RouterStatus`"
  (^com.google.cloud.compute.v1.RouterStatus [^RouterStatusResponse this]
    (-> this (.getResult))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterStatusResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterStatusResponse$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusResponse$Builder [^RouterStatusResponse this]
    (-> this (.toBuilder))))

