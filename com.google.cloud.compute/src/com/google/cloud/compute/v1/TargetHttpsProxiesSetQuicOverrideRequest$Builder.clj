(ns com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxiesSetQuicOverrideRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder [^TargetHttpsProxiesSetQuicOverrideRequest$Builder this ^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest other]
    (-> this (.mergeFrom other))))

(defn get-quic-override
  "QUIC policy for the TargetHttpsProxy resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxiesSetQuicOverrideRequest$Builder this]
    (-> this (.getQuicOverride))))

(defn set-quic-override
  "QUIC policy for the TargetHttpsProxy resource.

  quic-override - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder [^TargetHttpsProxiesSetQuicOverrideRequest$Builder this ^java.lang.String quic-override]
    (-> this (.setQuicOverride quic-override))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest [^TargetHttpsProxiesSetQuicOverrideRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest$Builder [^TargetHttpsProxiesSetQuicOverrideRequest$Builder this]
    (-> this (.clone))))

