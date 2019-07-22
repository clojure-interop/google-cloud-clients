(ns com.google.cloud.compute.v1.SourceInstanceParams
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SourceInstanceParams]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SourceInstanceParams`

  returns: `com.google.cloud.compute.v1.SourceInstanceParams$Builder`"
  (^com.google.cloud.compute.v1.SourceInstanceParams$Builder [^com.google.cloud.compute.v1.SourceInstanceParams prototype]
    (SourceInstanceParams/newBuilder prototype))
  (^com.google.cloud.compute.v1.SourceInstanceParams$Builder []
    (SourceInstanceParams/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SourceInstanceParams`"
  (^com.google.cloud.compute.v1.SourceInstanceParams []
    (SourceInstanceParams/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SourceInstanceParams this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SourceInstanceParams this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SourceInstanceParams this]
    (-> this (.getFieldMask))))

(defn get-disk-configs-list
  "Attached disks configuration. If not provided, defaults are applied: For boot disk and any
   other R/W disks, new custom images will be created from each disk. For read-only disks, they
   will be attached in read-only mode. Local SSD disks will be created as blank volumes.

  returns: `java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig>`"
  (^java.util.List [^SourceInstanceParams this]
    (-> this (.getDiskConfigsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SourceInstanceParams$Builder`"
  (^com.google.cloud.compute.v1.SourceInstanceParams$Builder [^SourceInstanceParams this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SourceInstanceParams this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SourceInstanceParams this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SourceInstanceParams this]
    (-> this (.hashCode))))

