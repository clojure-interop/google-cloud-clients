(ns com.google.cloud.compute.v1.CacheInvalidationRule$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CacheInvalidationRule$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.CacheInvalidationRule`

  returns: `com.google.cloud.compute.v1.CacheInvalidationRule$Builder`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule$Builder [^CacheInvalidationRule$Builder this ^com.google.cloud.compute.v1.CacheInvalidationRule other]
    (-> this (.mergeFrom other))))

(defn get-host
  "If set, this invalidation rule will only apply to requests with a Host header matching host.

  returns: `java.lang.String`"
  (^java.lang.String [^CacheInvalidationRule$Builder this]
    (-> this (.getHost))))

(defn set-host
  "If set, this invalidation rule will only apply to requests with a Host header matching host.

  host - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CacheInvalidationRule$Builder`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule$Builder [^CacheInvalidationRule$Builder this ^java.lang.String host]
    (-> this (.setHost host))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^CacheInvalidationRule$Builder this]
    (-> this (.getPath))))

(defn set-path
  "path - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CacheInvalidationRule$Builder`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule$Builder [^CacheInvalidationRule$Builder this ^java.lang.String path]
    (-> this (.setPath path))))

(defn build
  "returns: `com.google.cloud.compute.v1.CacheInvalidationRule`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule [^CacheInvalidationRule$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.CacheInvalidationRule$Builder`"
  (^com.google.cloud.compute.v1.CacheInvalidationRule$Builder [^CacheInvalidationRule$Builder this]
    (-> this (.clone))))

