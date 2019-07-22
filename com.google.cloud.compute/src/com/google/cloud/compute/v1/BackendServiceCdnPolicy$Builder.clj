(ns com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceCdnPolicy$Builder]))

(defn set-cache-key-policy
  "The CacheKeyPolicy for this CdnPolicy.

  cache-key-policy - `com.google.cloud.compute.v1.CacheKeyPolicy`

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^BackendServiceCdnPolicy$Builder this ^com.google.cloud.compute.v1.CacheKeyPolicy cache-key-policy]
    (-> this (.setCacheKeyPolicy cache-key-policy))))

(defn get-signed-url-key-names-list
  "[Output Only] Names of the keys for signing request URLs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceCdnPolicy$Builder this]
    (-> this (.getSignedUrlKeyNamesList))))

(defn get-signed-url-cache-max-age-sec
  "Maximum number of seconds the response to a signed URL request will be considered fresh.
   After this time period, the response will be revalidated before being served. Defaults to 1hr
   (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   though all responses from this backend had a \"Cache-Control: public, max-age=[TTL]\" header,
   regardless of any existing Cache-Control header. The actual headers served in responses will
   not be altered.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceCdnPolicy$Builder this]
    (-> this (.getSignedUrlCacheMaxAgeSec))))

(defn set-signed-url-cache-max-age-sec
  "Maximum number of seconds the response to a signed URL request will be considered fresh.
   After this time period, the response will be revalidated before being served. Defaults to 1hr
   (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   though all responses from this backend had a \"Cache-Control: public, max-age=[TTL]\" header,
   regardless of any existing Cache-Control header. The actual headers served in responses will
   not be altered.

  signed-url-cache-max-age-sec - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^BackendServiceCdnPolicy$Builder this ^java.lang.String signed-url-cache-max-age-sec]
    (-> this (.setSignedUrlCacheMaxAgeSec signed-url-cache-max-age-sec))))

(defn add-all-signed-url-key-names
  "[Output Only] Names of the keys for signing request URLs.

  signed-url-key-names - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^BackendServiceCdnPolicy$Builder this ^java.util.List signed-url-key-names]
    (-> this (.addAllSignedUrlKeyNames signed-url-key-names))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy [^BackendServiceCdnPolicy$Builder this]
    (-> this (.build))))

(defn add-signed-url-key-names
  "[Output Only] Names of the keys for signing request URLs.

  signed-url-key-names - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^BackendServiceCdnPolicy$Builder this ^java.lang.String signed-url-key-names]
    (-> this (.addSignedUrlKeyNames signed-url-key-names))))

(defn get-cache-key-policy
  "The CacheKeyPolicy for this CdnPolicy.

  returns: `com.google.cloud.compute.v1.CacheKeyPolicy`"
  (^com.google.cloud.compute.v1.CacheKeyPolicy [^BackendServiceCdnPolicy$Builder this]
    (-> this (.getCacheKeyPolicy))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendServiceCdnPolicy`

  returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^BackendServiceCdnPolicy$Builder this ^com.google.cloud.compute.v1.BackendServiceCdnPolicy other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceCdnPolicy$Builder [^BackendServiceCdnPolicy$Builder this]
    (-> this (.clone))))

