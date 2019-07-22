(ns com.google.cloud.compute.v1.CacheKeyPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CacheKeyPolicy$Builder]))

(defn get-include-protocol?
  "If true, http and https requests will be cached separately.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CacheKeyPolicy$Builder this]
    (-> this (.getIncludeProtocol))))

(defn get-query-string-whitelist-list
  "Names of query string parameters to include in cache keys. All other parameters will be
   excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CacheKeyPolicy$Builder this]
    (-> this (.getQueryStringWhitelistList))))

(defn add-all-query-string-whitelist
  "Names of query string parameters to include in cache keys. All other parameters will be
   excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  query-string-whitelist - `java.util.List`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^java.util.List query-string-whitelist]
    (-> this (.addAllQueryStringWhitelist query-string-whitelist))))

(defn get-include-host?
  "If true, requests to different hosts will be cached separately.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CacheKeyPolicy$Builder this]
    (-> this (.getIncludeHost))))

(defn build
  "returns: `com.google.cloud.compute.v1.CacheKeyPolicy`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy [^CacheKeyPolicy$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.CacheKeyPolicy`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^com.google.cloud.compute.v1.CacheKeyPolicy other]
    (-> this (.mergeFrom other))))

(defn set-include-protocol
  "If true, http and https requests will be cached separately.

  include-protocol - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^java.lang.Boolean include-protocol]
    (-> this (.setIncludeProtocol include-protocol))))

(defn set-include-query-string
  "If true, include query string parameters in the cache key according to query_string_whitelist
   and query_string_blacklist. If neither is set, the entire query string will be included. If
   false, the query string will be excluded from the cache key entirely.

  include-query-string - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^java.lang.Boolean include-query-string]
    (-> this (.setIncludeQueryString include-query-string))))

(defn add-query-string-blacklist
  "Names of query string parameters to exclude in cache keys. All other parameters will be
   included. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  query-string-blacklist - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^java.lang.String query-string-blacklist]
    (-> this (.addQueryStringBlacklist query-string-blacklist))))

(defn clone
  "returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this]
    (-> this (.clone))))

(defn add-all-query-string-blacklist
  "Names of query string parameters to exclude in cache keys. All other parameters will be
   included. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  query-string-blacklist - `java.util.List`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^java.util.List query-string-blacklist]
    (-> this (.addAllQueryStringBlacklist query-string-blacklist))))

(defn get-query-string-blacklist-list
  "Names of query string parameters to exclude in cache keys. All other parameters will be
   included. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CacheKeyPolicy$Builder this]
    (-> this (.getQueryStringBlacklistList))))

(defn add-query-string-whitelist
  "Names of query string parameters to include in cache keys. All other parameters will be
   excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&'
   and '=' will be percent encoded and not treated as delimiters.

  query-string-whitelist - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^java.lang.String query-string-whitelist]
    (-> this (.addQueryStringWhitelist query-string-whitelist))))

(defn set-include-host
  "If true, requests to different hosts will be cached separately.

  include-host - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy$Builder`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy$Builder [^CacheKeyPolicy$Builder this ^java.lang.Boolean include-host]
    (-> this (.setIncludeHost include-host))))

(defn get-include-query-string?
  "If true, include query string parameters in the cache key according to query_string_whitelist
   and query_string_blacklist. If neither is set, the entire query string will be included. If
   false, the query string will be excluded from the cache key entirely.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CacheKeyPolicy$Builder this]
    (-> this (.getIncludeQueryString))))

