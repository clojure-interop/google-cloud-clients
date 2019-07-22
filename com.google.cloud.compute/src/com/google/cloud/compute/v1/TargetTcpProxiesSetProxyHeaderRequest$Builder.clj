(ns com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetTcpProxiesSetProxyHeaderRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest`

  returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder [^TargetTcpProxiesSetProxyHeaderRequest$Builder this ^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest other]
    (-> this (.mergeFrom other))))

(defn get-proxy-header
  "The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1
   are allowed.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetTcpProxiesSetProxyHeaderRequest$Builder this]
    (-> this (.getProxyHeader))))

(defn set-proxy-header
  "The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1
   are allowed.

  proxy-header - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder [^TargetTcpProxiesSetProxyHeaderRequest$Builder this ^java.lang.String proxy-header]
    (-> this (.setProxyHeader proxy-header))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest [^TargetTcpProxiesSetProxyHeaderRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest$Builder [^TargetTcpProxiesSetProxyHeaderRequest$Builder this]
    (-> this (.clone))))

