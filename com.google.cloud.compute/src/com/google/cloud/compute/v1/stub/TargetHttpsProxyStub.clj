(ns com.google.cloud.compute.v1.stub.TargetHttpsProxyStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetHttpsProxyStub]))

(defn ->target-https-proxy-stub
  "Constructor."
  (^TargetHttpsProxyStub []
    (new TargetHttpsProxyStub )))

(defn set-quic-override-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.setQuicOverrideTargetHttpsProxyCallable))))

(defn set-url-map-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.setUrlMapTargetHttpsProxyCallable))))

(defn list-target-https-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.listTargetHttpsProxiesCallable))))

(defn set-ssl-policy-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.setSslPolicyTargetHttpsProxyCallable))))

(defn insert-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.insertTargetHttpsProxyCallable))))

(defn close
  ""
  ([^TargetHttpsProxyStub this]
    (-> this (.close))))

(defn delete-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.deleteTargetHttpsProxyCallable))))

(defn set-ssl-certificates-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.setSslCertificatesTargetHttpsProxyCallable))))

(defn get-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.getTargetHttpsProxyCallable))))

(defn list-target-https-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyClient$ListTargetHttpsProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpsProxyStub this]
    (-> this (.listTargetHttpsProxiesPagedCallable))))

