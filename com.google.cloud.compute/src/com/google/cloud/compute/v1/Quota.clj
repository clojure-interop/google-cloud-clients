(ns com.google.cloud.compute.v1.Quota
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Quota]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Quota`

  returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^com.google.cloud.compute.v1.Quota prototype]
    (Quota/newBuilder prototype))
  (^com.google.cloud.compute.v1.Quota$Builder []
    (Quota/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Quota`"
  (^com.google.cloud.compute.v1.Quota []
    (Quota/getDefaultInstance )))

(defn get-metric
  "[Output Only] Name of the quota metric.

  returns: `java.lang.String`"
  (^java.lang.String [^Quota this]
    (-> this (.getMetric))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Quota this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Quota this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Quota this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-usage
  "[Output Only] Current usage of this metric.

  returns: `java.lang.Double`"
  (^java.lang.Double [^Quota this]
    (-> this (.getUsage))))

(defn get-owner
  "[Output Only] Owning resource. This is the resource on which this quota is applied.

  returns: `java.lang.String`"
  (^java.lang.String [^Quota this]
    (-> this (.getOwner))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Quota this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Quota this]
    (-> this (.hashCode))))

(defn get-limit
  "[Output Only] Quota limit for this metric.

  returns: `java.lang.Double`"
  (^java.lang.Double [^Quota this]
    (-> this (.getLimit))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Quota this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Quota$Builder`"
  (^com.google.cloud.compute.v1.Quota$Builder [^Quota this]
    (-> this (.toBuilder))))

