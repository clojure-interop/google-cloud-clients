(ns com.google.cloud.compute.v1.SecurityPolicyReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SecurityPolicyReference`

  returns: `com.google.cloud.compute.v1.SecurityPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyReference$Builder [^com.google.cloud.compute.v1.SecurityPolicyReference prototype]
    (SecurityPolicyReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.SecurityPolicyReference$Builder []
    (SecurityPolicyReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SecurityPolicyReference`"
  (^com.google.cloud.compute.v1.SecurityPolicyReference []
    (SecurityPolicyReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SecurityPolicyReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SecurityPolicyReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SecurityPolicyReference this]
    (-> this (.getFieldMask))))

(defn get-security-policy
  "returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyReference this]
    (-> this (.getSecurityPolicy))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SecurityPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyReference$Builder [^SecurityPolicyReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SecurityPolicyReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SecurityPolicyReference this]
    (-> this (.hashCode))))

