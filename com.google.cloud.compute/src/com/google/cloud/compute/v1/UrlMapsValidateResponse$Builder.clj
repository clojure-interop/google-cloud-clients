(ns com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapsValidateResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UrlMapsValidateResponse`

  returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder [^UrlMapsValidateResponse$Builder this ^com.google.cloud.compute.v1.UrlMapsValidateResponse other]
    (-> this (.mergeFrom other))))

(defn get-result
  "returns: `com.google.cloud.compute.v1.UrlMapValidationResult`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult [^UrlMapsValidateResponse$Builder this]
    (-> this (.getResult))))

(defn set-result
  "result - `com.google.cloud.compute.v1.UrlMapValidationResult`

  returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder [^UrlMapsValidateResponse$Builder this ^com.google.cloud.compute.v1.UrlMapValidationResult result]
    (-> this (.setResult result))))

(defn build
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse`"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse [^UrlMapsValidateResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder`"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse$Builder [^UrlMapsValidateResponse$Builder this]
    (-> this (.clone))))

