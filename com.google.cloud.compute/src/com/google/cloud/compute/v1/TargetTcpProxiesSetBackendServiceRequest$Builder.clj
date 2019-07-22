(ns com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxiesSetBackendServiceRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest`

  returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder [^TargetTcpProxiesSetBackendServiceRequest$Builder this ^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest other]
    (-> this (.mergeFrom other))))

(defn get-service
  "The URL of the new BackendService resource for the targetTcpProxy.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxiesSetBackendServiceRequest$Builder this]
    (-> this (.getService))))

(defn set-service
  "The URL of the new BackendService resource for the targetTcpProxy.

  service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder [^TargetTcpProxiesSetBackendServiceRequest$Builder this ^java.lang.String service]
    (-> this (.setService service))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest [^TargetTcpProxiesSetBackendServiceRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetBackendServiceRequest$Builder [^TargetTcpProxiesSetBackendServiceRequest$Builder this]
    (-> this (.clone))))

