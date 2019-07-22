(ns com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxiesSetBackendServiceRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder [^TargetSslProxiesSetBackendServiceRequest$Builder this ^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest other]
    (-> this (.mergeFrom other))))

(defn get-service
  "The URL of the new BackendService resource for the targetSslProxy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxiesSetBackendServiceRequest$Builder this]
    (-> this (.getService))))

(defn set-service
  "The URL of the new BackendService resource for the targetSslProxy.

  service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder [^TargetSslProxiesSetBackendServiceRequest$Builder this ^java.lang.String service]
    (-> this (.setService service))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest [^TargetSslProxiesSetBackendServiceRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetBackendServiceRequest$Builder [^TargetSslProxiesSetBackendServiceRequest$Builder this]
    (-> this (.clone))))

