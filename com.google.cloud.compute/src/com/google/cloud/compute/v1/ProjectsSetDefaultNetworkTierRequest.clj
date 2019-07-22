(ns com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsSetDefaultNetworkTierRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest`

  returns: `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder [^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest prototype]
    (ProjectsSetDefaultNetworkTierRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder []
    (ProjectsSetDefaultNetworkTierRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest`"
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest []
    (ProjectsSetDefaultNetworkTierRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ProjectsSetDefaultNetworkTierRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^ProjectsSetDefaultNetworkTierRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ProjectsSetDefaultNetworkTierRequest this]
    (-> this (.getFieldMask))))

(defn get-network-tier
  "Default network tier to be set.

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectsSetDefaultNetworkTierRequest this]
    (-> this (.getNetworkTier))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest$Builder [^ProjectsSetDefaultNetworkTierRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectsSetDefaultNetworkTierRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectsSetDefaultNetworkTierRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectsSetDefaultNetworkTierRequest this]
    (-> this (.hashCode))))

