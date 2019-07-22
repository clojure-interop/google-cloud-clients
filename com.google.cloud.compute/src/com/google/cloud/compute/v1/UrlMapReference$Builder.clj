(ns com.google.cloud.compute.v1.UrlMapReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UrlMapReference`

  returns: `com.google.cloud.compute.v1.UrlMapReference$Builder`"
  (^com.google.cloud.compute.v1.UrlMapReference$Builder [^UrlMapReference$Builder this ^com.google.cloud.compute.v1.UrlMapReference other]
    (-> this (.mergeFrom other))))

(defn get-url-map
  "returns: `java.lang.String`"
  (^java.lang.String [^UrlMapReference$Builder this]
    (-> this (.getUrlMap))))

(defn set-url-map
  "url-map - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMapReference$Builder`"
  (^com.google.cloud.compute.v1.UrlMapReference$Builder [^UrlMapReference$Builder this ^java.lang.String url-map]
    (-> this (.setUrlMap url-map))))

(defn build
  "returns: `com.google.cloud.compute.v1.UrlMapReference`"
  (^com.google.cloud.compute.v1.UrlMapReference [^UrlMapReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UrlMapReference$Builder`"
  (^com.google.cloud.compute.v1.UrlMapReference$Builder [^UrlMapReference$Builder this]
    (-> this (.clone))))

