(ns com.google.cloud.compute.v1.DistributionPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DistributionPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DistributionPolicy`

  returns: `com.google.cloud.compute.v1.DistributionPolicy$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicy$Builder [^com.google.cloud.compute.v1.DistributionPolicy prototype]
    (DistributionPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.DistributionPolicy$Builder []
    (DistributionPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DistributionPolicy`"
  (^com.google.cloud.compute.v1.DistributionPolicy []
    (DistributionPolicy/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DistributionPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DistributionPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DistributionPolicy this]
    (-> this (.getFieldMask))))

(defn get-zones-list
  "Zones where the regional managed instance group will create and manage instances.

  returns: `java.util.List<com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration>`"
  (^java.util.List [^DistributionPolicy this]
    (-> this (.getZonesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DistributionPolicy$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicy$Builder [^DistributionPolicy this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DistributionPolicy this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DistributionPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DistributionPolicy this]
    (-> this (.hashCode))))

