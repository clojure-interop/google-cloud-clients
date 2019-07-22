(ns com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxiesSetProxyHeaderRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder [^TargetSslProxiesSetProxyHeaderRequest$Builder this ^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest other]
    (-> this (.mergeFrom other))))

(defn get-proxy-header
  "The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1
   are allowed.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxiesSetProxyHeaderRequest$Builder this]
    (-> this (.getProxyHeader))))

(defn set-proxy-header
  "The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1
   are allowed.

  proxy-header - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder [^TargetSslProxiesSetProxyHeaderRequest$Builder this ^java.lang.String proxy-header]
    (-> this (.setProxyHeader proxy-header))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest [^TargetSslProxiesSetProxyHeaderRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetProxyHeaderRequest$Builder [^TargetSslProxiesSetProxyHeaderRequest$Builder this]
    (-> this (.clone))))

