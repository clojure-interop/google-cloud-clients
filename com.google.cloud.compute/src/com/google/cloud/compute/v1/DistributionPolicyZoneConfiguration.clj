(ns com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DistributionPolicyZoneConfiguration]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration`

  returns: `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder [^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration prototype]
    (DistributionPolicyZoneConfiguration/newBuilder prototype))
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder []
    (DistributionPolicyZoneConfiguration/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration`"
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration []
    (DistributionPolicyZoneConfiguration/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DistributionPolicyZoneConfiguration this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DistributionPolicyZoneConfiguration this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DistributionPolicyZoneConfiguration this]
    (-> this (.getFieldMask))))

(defn get-zone
  "The URL of the zone. The zone must exist in the region where the managed instance group is
   located.

  returns: `java.lang.String`"
  (^java.lang.String [^DistributionPolicyZoneConfiguration this]
    (-> this (.getZone))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder`"
  (^com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration$Builder [^DistributionPolicyZoneConfiguration this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DistributionPolicyZoneConfiguration this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DistributionPolicyZoneConfiguration this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DistributionPolicyZoneConfiguration this]
    (-> this (.hashCode))))

