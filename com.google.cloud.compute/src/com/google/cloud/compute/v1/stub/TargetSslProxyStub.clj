(ns com.google.cloud.compute.v1.stub.TargetSslProxyStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetSslProxyStub]))

(defn ->target-ssl-proxy-stub
  "Constructor."
  (^TargetSslProxyStub []
    (new TargetSslProxyStub )))

(defn set-ssl-certificates-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.setSslCertificatesTargetSslProxyCallable))))

(defn set-ssl-policy-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.setSslPolicyTargetSslProxyCallable))))

(defn insert-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.insertTargetSslProxyCallable))))

(defn delete-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.deleteTargetSslProxyCallable))))

(defn list-target-ssl-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.listTargetSslProxiesCallable))))

(defn list-target-ssl-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.listTargetSslProxiesPagedCallable))))

(defn close
  ""
  ([^TargetSslProxyStub this]
    (-> this (.close))))

(defn set-proxy-header-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.setProxyHeaderTargetSslProxyCallable))))

(defn set-backend-service-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.setBackendServiceTargetSslProxyCallable))))

(defn get-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest,com.google.cloud.compute.v1.TargetSslProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetSslProxyStub this]
    (-> this (.getTargetSslProxyCallable))))

