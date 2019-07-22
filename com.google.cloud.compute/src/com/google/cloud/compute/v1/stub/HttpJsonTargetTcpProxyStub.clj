(ns com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonTargetTcpProxyStub]))

(def *-delete-target-tcp-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetTcpProxyStub/deleteTargetTcpProxyMethodDescriptor)

(def *-get-target-tcp-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.TargetTcpProxy>"
  HttpJsonTargetTcpProxyStub/getTargetTcpProxyMethodDescriptor)

(def *-insert-target-tcp-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetTcpProxyStub/insertTargetTcpProxyMethodDescriptor)

(def *-list-target-tcp-proxies-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyList>"
  HttpJsonTargetTcpProxyStub/listTargetTcpProxiesMethodDescriptor)

(def *-set-backend-service-target-tcp-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetTcpProxyStub/setBackendServiceTargetTcpProxyMethodDescriptor)

(def *-set-proxy-header-target-tcp-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetTcpProxyStub/setProxyHeaderTargetTcpProxyMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonTargetTcpProxyStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetTcpProxyStub [^com.google.cloud.compute.v1.stub.TargetTcpProxyStubSettings settings]
    (HttpJsonTargetTcpProxyStub/create settings)))

(defn list-target-tcp-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetTcpProxyStub this]
    (-> this (.listTargetTcpProxiesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetTcpProxyStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonTargetTcpProxyStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonTargetTcpProxyStub this]
    (-> this (.shutdown))))

(defn delete-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetTcpProxyStub this]
    (-> this (.deleteTargetTcpProxyCallable))))

(defn insert-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetTcpProxyStub this]
    (-> this (.insertTargetTcpProxyCallable))))

(defn close
  ""
  ([^HttpJsonTargetTcpProxyStub this]
    (-> this (.close))))

(defn set-backend-service-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetTcpProxyStub this]
    (-> this (.setBackendServiceTargetTcpProxyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetTcpProxyStub this]
    (-> this (.isTerminated))))

(defn get-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.TargetTcpProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetTcpProxyStub this]
    (-> this (.getTargetTcpProxyCallable))))

(defn list-target-tcp-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetTcpProxiesHttpRequest,com.google.cloud.compute.v1.TargetTcpProxyClient$ListTargetTcpProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetTcpProxyStub this]
    (-> this (.listTargetTcpProxiesPagedCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonTargetTcpProxyStub this]
    (-> this (.shutdownNow))))

(defn set-proxy-header-target-tcp-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetTcpProxyStub this]
    (-> this (.setProxyHeaderTargetTcpProxyCallable))))

