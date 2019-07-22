(ns com.google.cloud.compute.v1.stub.TargetHttpProxyStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetHttpProxyStub]))

(defn ->target-http-proxy-stub
  "Constructor."
  (^TargetHttpProxyStub []
    (new TargetHttpProxyStub )))

(defn delete-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyStub this]
    (-> this (.deleteTargetHttpProxyCallable))))

(defn get-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyStub this]
    (-> this (.getTargetHttpProxyCallable))))

(defn insert-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyStub this]
    (-> this (.insertTargetHttpProxyCallable))))

(defn list-target-http-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyClient$ListTargetHttpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyStub this]
    (-> this (.listTargetHttpProxiesPagedCallable))))

(defn list-target-http-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyStub this]
    (-> this (.listTargetHttpProxiesCallable))))

(defn set-url-map-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetHttpProxyStub this]
    (-> this (.setUrlMapTargetHttpProxyCallable))))

(defn close
  ""
  ([^TargetHttpProxyStub this]
    (-> this (.close))))

