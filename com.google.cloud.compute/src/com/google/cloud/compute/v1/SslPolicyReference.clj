(ns com.google.cloud.compute.v1.SslPolicyReference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPolicyReference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SslPolicyReference`

  returns: `com.google.cloud.compute.v1.SslPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SslPolicyReference$Builder [^com.google.cloud.compute.v1.SslPolicyReference prototype]
    (SslPolicyReference/newBuilder prototype))
  (^com.google.cloud.compute.v1.SslPolicyReference$Builder []
    (SslPolicyReference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SslPolicyReference`"
  (^com.google.cloud.compute.v1.SslPolicyReference []
    (SslPolicyReference/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SslPolicyReference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SslPolicyReference this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPolicyReference this]
    (-> this (.getFieldMask))))

(defn get-ssl-policy
  "URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy
   associated with the target proxy resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicyReference this]
    (-> this (.getSslPolicy))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SslPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SslPolicyReference$Builder [^SslPolicyReference this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SslPolicyReference this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SslPolicyReference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SslPolicyReference this]
    (-> this (.hashCode))))

