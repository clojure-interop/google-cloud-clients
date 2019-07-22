(ns com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonTargetHttpProxyStub]))

(def *-delete-target-http-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpProxyStub/deleteTargetHttpProxyMethodDescriptor)

(def *-get-target-http-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpProxy>"
  HttpJsonTargetHttpProxyStub/getTargetHttpProxyMethodDescriptor)

(def *-insert-target-http-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpProxyStub/insertTargetHttpProxyMethodDescriptor)

(def *-list-target-http-proxies-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyList>"
  HttpJsonTargetHttpProxyStub/listTargetHttpProxiesMethodDescriptor)

(def *-set-url-map-target-http-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpProxyStub/setUrlMapTargetHttpProxyMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonTargetHttpProxyStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetHttpProxyStub [^com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings settings]
    (HttpJsonTargetHttpProxyStub/create settings)))

(defn insert-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpProxyStub this]
    (-> this (.insertTargetHttpProxyCallable))))

(defn list-target-http-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpProxyStub this]
    (-> this (.listTargetHttpProxiesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetHttpProxyStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonTargetHttpProxyStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-target-http-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpProxyClient$ListTargetHttpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpProxyStub this]
    (-> this (.listTargetHttpProxiesPagedCallable))))

(defn shutdown
  ""
  ([^HttpJsonTargetHttpProxyStub this]
    (-> this (.shutdown))))

(defn get-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpProxyStub this]
    (-> this (.getTargetHttpProxyCallable))))

(defn close
  ""
  ([^HttpJsonTargetHttpProxyStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetHttpProxyStub this]
    (-> this (.isTerminated))))

(defn delete-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpProxyStub this]
    (-> this (.deleteTargetHttpProxyCallable))))

(defn set-url-map-target-http-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUrlMapTargetHttpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpProxyStub this]
    (-> this (.setUrlMapTargetHttpProxyCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonTargetHttpProxyStub this]
    (-> this (.shutdownNow))))

