(ns com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucketCdnPolicy$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendBucketCdnPolicy`

  returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder [^BackendBucketCdnPolicy$Builder this ^com.google.cloud.compute.v1.BackendBucketCdnPolicy other]
    (-> this (.mergeFrom other))))

(defn get-signed-url-cache-max-age-sec
  "Maximum number of seconds the response to a signed URL request will be considered fresh.
   After this time period, the response will be revalidated before being served. Defaults to 1hr
   (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   though all responses from this backend had a \"Cache-Control: public, max-age=[TTL]\" header,
   regardless of any existing Cache-Control header. The actual headers served in responses will
   not be altered.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendBucketCdnPolicy$Builder this]
    (-> this (.getSignedUrlCacheMaxAgeSec))))

(defn set-signed-url-cache-max-age-sec
  "Maximum number of seconds the response to a signed URL request will be considered fresh.
   After this time period, the response will be revalidated before being served. Defaults to 1hr
   (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as
   though all responses from this backend had a \"Cache-Control: public, max-age=[TTL]\" header,
   regardless of any existing Cache-Control header. The actual headers served in responses will
   not be altered.

  signed-url-cache-max-age-sec - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder [^BackendBucketCdnPolicy$Builder this ^java.lang.String signed-url-cache-max-age-sec]
    (-> this (.setSignedUrlCacheMaxAgeSec signed-url-cache-max-age-sec))))

(defn get-signed-url-key-names-list
  "[Output Only] Names of the keys for signing request URLs.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendBucketCdnPolicy$Builder this]
    (-> this (.getSignedUrlKeyNamesList))))

(defn add-all-signed-url-key-names
  "[Output Only] Names of the keys for signing request URLs.

  signed-url-key-names - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder [^BackendBucketCdnPolicy$Builder this ^java.util.List signed-url-key-names]
    (-> this (.addAllSignedUrlKeyNames signed-url-key-names))))

(defn add-signed-url-key-names
  "[Output Only] Names of the keys for signing request URLs.

  signed-url-key-names - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder [^BackendBucketCdnPolicy$Builder this ^java.lang.String signed-url-key-names]
    (-> this (.addSignedUrlKeyNames signed-url-key-names))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy [^BackendBucketCdnPolicy$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketCdnPolicy$Builder [^BackendBucketCdnPolicy$Builder this]
    (-> this (.clone))))

