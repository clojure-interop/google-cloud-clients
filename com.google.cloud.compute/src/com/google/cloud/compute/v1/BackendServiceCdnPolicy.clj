(ns com.google.cloud.compute.v1.BackendServiceCdnPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceCdnPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendServiceCdnPolicy`

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^com.google.cloud.compute.v1.BackendServiceCdnPolicy prototype]
    (BackendServiceCdnPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder []
    (BackendServiceCdnPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy []
    (BackendServiceCdnPolicy/getDefaultInstance )))

(defn get-signed-url-key-names-list
  "[Output Only] Names of the keys for signing request URLs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceCdnPolicy this]
    (-> this (.getSignedUrlKeyNamesList))))

(defn get-signed-url-cache-max-age-sec
  "Maximum number of seconds the response to a signed URL request will be considered fresh. After
   this time period, the response will be revalidated before being served. Defaults to 1hr
   (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   though all responses from this backend had a \"Cache-Control: public, max-age=[TTL]\" header,
   regardless of any existing Cache-Control header. The actual headers served in responses will
   not be altered.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceCdnPolicy this]
    (-> this (.getSignedUrlCacheMaxAgeSec))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceCdnPolicy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceCdnPolicy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendServiceCdnPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-cache-key-policy
  "The CacheKeyPolicy for this CdnPolicy.

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy [^BackendServiceCdnPolicy this]
    (-> this (.getCacheKeyPolicy))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendServiceCdnPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendServiceCdnPolicy this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendServiceCdnPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^BackendServiceCdnPolicy this]
    (-> this (.toBuilder))))

