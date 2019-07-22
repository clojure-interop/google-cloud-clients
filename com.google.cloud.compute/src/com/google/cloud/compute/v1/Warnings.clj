(ns com.google.cloud.compute.v1.Warnings
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Warnings]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Warnings`

  returns: `com.google.cloud.compute.v1.Warnings$Builder`"
  (^com.google.cloud.compute.v1.Warnings$Builder [^com.google.cloud.compute.v1.Warnings prototype]
    (Warnings/newBuilder prototype))
  (^com.google.cloud.compute.v1.Warnings$Builder []
    (Warnings/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Warnings`"
  (^com.google.cloud.compute.v1.Warnings []
    (Warnings/getDefaultInstance )))

(defn get-code
  "[Output Only] A warning code, if applicable. For example, Compute Engine returns
   NO_RESULTS_ON_PAGE if there are no results in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^Warnings this]
    (-> this (.getCode))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Warnings this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Warnings this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Warnings this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-data-list
  "[Output Only] Metadata about this warning in key: value format. For example: \"data\": [ { \"key\":
   \"scope\", \"value\": \"zones/us-east1-d\" }

  returns: `java.util.List<com.google.cloud.compute.v1.Data>`"
  (^java.util.List [^Warnings this]
    (-> this (.getDataList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Warnings this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Warnings this]
    (-> this (.hashCode))))

(defn get-message
  "[Output Only] A human-readable description of the warning code.

  returns: `java.lang.String`"
  (^java.lang.String [^Warnings this]
    (-> this (.getMessage))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Warnings this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Warnings$Builder`"
  (^com.google.cloud.compute.v1.Warnings$Builder [^Warnings this]
    (-> this (.toBuilder))))

