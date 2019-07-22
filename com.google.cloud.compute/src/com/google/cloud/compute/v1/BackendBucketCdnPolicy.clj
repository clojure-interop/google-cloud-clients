(ns com.google.cloud.compute.v1.BackendBucketCdnPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucketCdnPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendBucketCdnPolicy`

  returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder [^com.google.cloud.compute.v1.BackendBucketCdnPolicy prototype]
    (BackendBucketCdnPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder []
    (BackendBucketCdnPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy []
    (BackendBucketCdnPolicy/getDefaultInstance )))

(defn get-signed-url-key-names-list
  "[Output Only] Names of the keys for signing request URLs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendBucketCdnPolicy this]
    (-> this (.getSignedUrlKeyNamesList))))

(defn get-signed-url-cache-max-age-sec
  "Maximum number of seconds the response to a signed URL request will be considered fresh. After
   this time period, the response will be revalidated before being served. Defaults to 1hr
   (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   though all responses from this backend had a \"Cache-Control: public, max-age=[TTL]\" header,
   regardless of any existing Cache-Control header. The actual headers served in responses will
   not be altered.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucketCdnPolicy this]
    (-> this (.getSignedUrlCacheMaxAgeSec))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendBucketCdnPolicy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendBucketCdnPolicy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendBucketCdnPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendBucketCdnPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendBucketCdnPolicy this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendBucketCdnPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder [^BackendBucketCdnPolicy this]
    (-> this (.toBuilder))))

