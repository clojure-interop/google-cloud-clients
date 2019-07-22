(ns com.google.cloud.compute.v1.RoutersPreviewResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RoutersPreviewResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RoutersPreviewResponse`

  returns: `com.google.cloud.compute.v1.RoutersPreviewResponse$Builder`"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse$Builder [^com.google.cloud.compute.v1.RoutersPreviewResponse prototype]
    (RoutersPreviewResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.RoutersPreviewResponse$Builder []
    (RoutersPreviewResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RoutersPreviewResponse`"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse []
    (RoutersPreviewResponse/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RoutersPreviewResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RoutersPreviewResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RoutersPreviewResponse this]
    (-> this (.getFieldMask))))

(defn get-resource
  "Preview of given router.

  returns: `com.google.cloud.compute.v1.Router`"
  (^com.google.cloud.compute.v1.Router [^RoutersPreviewResponse this]
    (-> this (.getResource))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RoutersPreviewResponse$Builder`"
  (^com.google.cloud.compute.v1.RoutersPreviewResponse$Builder [^RoutersPreviewResponse this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RoutersPreviewResponse this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RoutersPreviewResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RoutersPreviewResponse this]
    (-> this (.hashCode))))

