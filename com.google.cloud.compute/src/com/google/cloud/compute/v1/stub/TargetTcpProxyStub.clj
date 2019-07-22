(ns com.google.cloud.compute.v1.stub.TargetTcpProxyStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetTcpProxyStub]))

(defn ->target-tcp-proxy-stub
  "Constructor."
  (^TargetTcpProxyStub []
    (new TargetTcpProxyStub )))

(defn delete-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyStub this]
    (-> this (.deleteTargetTcpProxyCallable))))

(defn get-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.TargetTcpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyStub this]
    (-> this (.getTargetTcpProxyCallable))))

(defn insert-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyStub this]
    (-> this (.insertTargetTcpProxyCallable))))

(defn list-target-tcp-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyStub this]
    (-> this (.listTargetTcpProxiesPagedCallable))))

(defn list-target-tcp-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyStub this]
    (-> this (.listTargetTcpProxiesCallable))))

(defn set-backend-service-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyStub this]
    (-> this (.setBackendServiceTargetTcpProxyCallable))))

(defn set-proxy-header-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetTcpProxyStub this]
    (-> this (.setProxyHeaderTargetTcpProxyCallable))))

(defn close
  ""
  ([^TargetTcpProxyStub this]
    (-> this (.close))))

