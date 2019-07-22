(ns com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPoliciesListAvailableFeaturesResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse`

  returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder [^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse prototype]
    (SslPoliciesListAvailableFeaturesResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder []
    (SslPoliciesListAvailableFeaturesResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse []
    (SslPoliciesListAvailableFeaturesResponse/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SslPoliciesListAvailableFeaturesResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SslPoliciesListAvailableFeaturesResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPoliciesListAvailableFeaturesResponse this]
    (-> this (.getFieldMask))))

(defn get-features-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPoliciesListAvailableFeaturesResponse this]
    (-> this (.getFeaturesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder`"
  (^com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse$Builder [^SslPoliciesListAvailableFeaturesResponse this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SslPoliciesListAvailableFeaturesResponse this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SslPoliciesListAvailableFeaturesResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SslPoliciesListAvailableFeaturesResponse this]
    (-> this (.hashCode))))

