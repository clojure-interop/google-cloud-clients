(ns com.google.cloud.compute.v1.BackendServiceReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendServiceReference`

  returns: `com.google.cloud.compute.v1.BackendServiceReference$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceReference$Builder [^BackendServiceReference$Builder this ^com.google.cloud.compute.v1.BackendServiceReference other]
    (-> this (.mergeFrom other))))

(defn get-backend-service
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceReference$Builder this]
    (-> this (.getBackendService))))

(defn set-backend-service
  "backend-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendServiceReference$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceReference$Builder [^BackendServiceReference$Builder this ^java.lang.String backend-service]
    (-> this (.setBackendService backend-service))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendServiceReference`"
  (^com.google.cloud.compute.v1.BackendServiceReference [^BackendServiceReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendServiceReference$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceReference$Builder [^BackendServiceReference$Builder this]
    (-> this (.clone))))

