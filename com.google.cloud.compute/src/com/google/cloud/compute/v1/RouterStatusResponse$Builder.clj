(ns com.google.cloud.compute.v1.RouterStatusResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatusResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterStatusResponse`

  returns: `com.google.cloud.compute.v1.RouterStatusResponse$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusResponse$Builder [^RouterStatusResponse$Builder this ^com.google.cloud.compute.v1.RouterStatusResponse other]
    (-> this (.mergeFrom other))))

(defn get-kind
  "Type of resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusResponse$Builder this]
    (-> this (.getKind))))

(defn set-kind
  "Type of resource.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusResponse$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusResponse$Builder [^RouterStatusResponse$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-result
  "returns: `com.google.cloud.compute.v1.RouterStatus`"
  (^com.google.cloud.compute.v1.RouterStatus [^RouterStatusResponse$Builder this]
    (-> this (.getResult))))

(defn set-result
  "result - `com.google.cloud.compute.v1.RouterStatus`

  returns: `com.google.cloud.compute.v1.RouterStatusResponse$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusResponse$Builder [^RouterStatusResponse$Builder this ^com.google.cloud.compute.v1.RouterStatus result]
    (-> this (.setResult result))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterStatusResponse`"
  (^com.google.cloud.compute.v1.RouterStatusResponse [^RouterStatusResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterStatusResponse$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusResponse$Builder [^RouterStatusResponse$Builder this]
    (-> this (.clone))))

