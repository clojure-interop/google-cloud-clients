(ns com.google.cloud.compute.v1.CacheKeyPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CacheKeyPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.CacheKeyPolicy`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^com.google.cloud.compute.v1.CacheKeyPolicy prototype]
    (CacheKeyPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder []
    (CacheKeyPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.CacheKeyPolicy`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy []
    (CacheKeyPolicy/getDefaultInstance )))

(defn get-include-protocol?
  "If true, http and https requests will be cached separately.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CacheKeyPolicy this]
    (-> this (.getIncludeProtocol))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CacheKeyPolicy this]
    (-> this (.getFieldMask))))

(defn get-query-string-whitelist-list
  "Names of query string parameters to include in cache keys. All other parameters will be
   excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CacheKeyPolicy this]
    (-> this (.getQueryStringWhitelistList))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CacheKeyPolicy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^CacheKeyPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-include-host?
  "If true, requests to different hosts will be cached separately.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CacheKeyPolicy this]
    (-> this (.getIncludeHost))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^CacheKeyPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CacheKeyPolicy this]
    (-> this (.hashCode))))

(defn get-query-string-blacklist-list
  "Names of query string parameters to exclude in cache keys. All other parameters will be
   included. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CacheKeyPolicy this]
    (-> this (.getQueryStringBlacklistList))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CacheKeyPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy this]
    (-> this (.toBuilder))))

(defn get-include-query-string?
  "If true, include query string parameters in the cache key according to query_string_whitelist
   and query_string_blacklist. If neither is set, the entire query string will be included. If
   false, the query string will be excluded from the cache key entirely.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CacheKeyPolicy this]
    (-> this (.getIncludeQueryString))))

