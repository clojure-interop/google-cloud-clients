(ns com.google.cloud.compute.v1.RegionDisksResizeRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionDisksResizeRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionDisksResizeRequest`

  returns: `com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder [^com.google.cloud.compute.v1.RegionDisksResizeRequest prototype]
    (RegionDisksResizeRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder []
    (RegionDisksResizeRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionDisksResizeRequest`"
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest []
    (RegionDisksResizeRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionDisksResizeRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionDisksResizeRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionDisksResizeRequest this]
    (-> this (.getFieldMask))))

(defn get-size-gb
  "The new size of the regional persistent disk, which is specified in GB.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionDisksResizeRequest this]
    (-> this (.getSizeGb))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionDisksResizeRequest$Builder [^RegionDisksResizeRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionDisksResizeRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionDisksResizeRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionDisksResizeRequest this]
    (-> this (.hashCode))))

