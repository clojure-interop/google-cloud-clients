(ns com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapsValidateRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UrlMapsValidateRequest`

  returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder [^UrlMapsValidateRequest$Builder this ^com.google.cloud.compute.v1.UrlMapsValidateRequest other]
    (-> this (.mergeFrom other))))

(defn get-resource
  "Content of the UrlMap to be validated.

  returns: `com.google.cloud.compute.v1.UrlMap`"
  (^com.google.cloud.compute.v1.UrlMap [^UrlMapsValidateRequest$Builder this]
    (-> this (.getResource))))

(defn set-resource
  "Content of the UrlMap to be validated.

  resource - `com.google.cloud.compute.v1.UrlMap`

  returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder [^UrlMapsValidateRequest$Builder this ^com.google.cloud.compute.v1.UrlMap resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest [^UrlMapsValidateRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateRequest$Builder [^UrlMapsValidateRequest$Builder this]
    (-> this (.clone))))

