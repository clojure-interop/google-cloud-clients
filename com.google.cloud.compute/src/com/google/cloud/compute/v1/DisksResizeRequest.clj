(ns com.google.cloud.compute.v1.DisksResizeRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DisksResizeRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DisksResizeRequest`

  returns: `com.google.cloud.compute.v1.DisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.DisksResizeRequest$Builder [^com.google.cloud.compute.v1.DisksResizeRequest prototype]
    (DisksResizeRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.DisksResizeRequest$Builder []
    (DisksResizeRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DisksResizeRequest`"
  (^com.google.cloud.compute.v1.DisksResizeRequest []
    (DisksResizeRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DisksResizeRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DisksResizeRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DisksResizeRequest this]
    (-> this (.getFieldMask))))

(defn get-size-gb
  "The new size of the persistent disk, which is specified in GB.

  returns: `java.lang.String`"
  (^java.lang.String [^DisksResizeRequest this]
    (-> this (.getSizeGb))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.DisksResizeRequest$Builder [^DisksResizeRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DisksResizeRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DisksResizeRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DisksResizeRequest this]
    (-> this (.hashCode))))

