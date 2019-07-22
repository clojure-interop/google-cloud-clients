(ns com.google.cloud.compute.v1.ScratchDisks
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ScratchDisks]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ScratchDisks`

  returns: `com.google.cloud.compute.v1.ScratchDisks$Builder`"
  (^com.google.cloud.compute.v1.ScratchDisks$Builder [^com.google.cloud.compute.v1.ScratchDisks prototype]
    (ScratchDisks/newBuilder prototype))
  (^com.google.cloud.compute.v1.ScratchDisks$Builder []
    (ScratchDisks/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ScratchDisks`"
  (^com.google.cloud.compute.v1.ScratchDisks []
    (ScratchDisks/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ScratchDisks this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ScratchDisks this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ScratchDisks this]
    (-> this (.getFieldMask))))

(defn get-disk-gb
  "Size of the scratch disk, defined in GB.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ScratchDisks this]
    (-> this (.getDiskGb))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ScratchDisks$Builder`"
  (^com.google.cloud.compute.v1.ScratchDisks$Builder [^ScratchDisks this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ScratchDisks this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ScratchDisks this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ScratchDisks this]
    (-> this (.hashCode))))

