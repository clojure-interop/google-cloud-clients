(ns com.google.cloud.compute.v1.stub.HttpJsonTargetSslProxyStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonTargetSslProxyStub]))

(def *-delete-target-ssl-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetSslProxyStub/deleteTargetSslProxyMethodDescriptor)

(def *-get-target-ssl-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest,com.google.cloud.compute.v1.TargetSslProxy>"
  HttpJsonTargetSslProxyStub/getTargetSslProxyMethodDescriptor)

(def *-insert-target-ssl-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetSslProxyStub/insertTargetSslProxyMethodDescriptor)

(def *-list-target-ssl-proxies-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyList>"
  HttpJsonTargetSslProxyStub/listTargetSslProxiesMethodDescriptor)

(def *-set-backend-service-target-ssl-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetSslProxyStub/setBackendServiceTargetSslProxyMethodDescriptor)

(def *-set-proxy-header-target-ssl-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetSslProxyStub/setProxyHeaderTargetSslProxyMethodDescriptor)

(def *-set-ssl-certificates-target-ssl-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetSslProxyStub/setSslCertificatesTargetSslProxyMethodDescriptor)

(def *-set-ssl-policy-target-ssl-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetSslProxyStub/setSslPolicyTargetSslProxyMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonTargetSslProxyStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetSslProxyStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonTargetSslProxyStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetSslProxyStub [^com.google.cloud.compute.v1.stub.TargetSslProxyStubSettings settings]
    (HttpJsonTargetSslProxyStub/create settings)))

(defn set-ssl-certificates-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.setSslCertificatesTargetSslProxyCallable))))

(defn set-ssl-policy-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.setSslPolicyTargetSslProxyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetSslProxyStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonTargetSslProxyStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn insert-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.insertTargetSslProxyCallable))))

(defn delete-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.deleteTargetSslProxyCallable))))

(defn list-target-ssl-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.listTargetSslProxiesCallable))))

(defn shutdown
  ""
  ([^HttpJsonTargetSslProxyStub this]
    (-> this (.shutdown))))

(defn list-target-ssl-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetSslProxiesHttpRequest,com.google.cloud.compute.v1.TargetSslProxyClient$ListTargetSslProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.listTargetSslProxiesPagedCallable))))

(defn close
  ""
  ([^HttpJsonTargetSslProxyStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetSslProxyStub this]
    (-> this (.isTerminated))))

(defn set-proxy-header-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.setProxyHeaderTargetSslProxyCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonTargetSslProxyStub this]
    (-> this (.shutdownNow))))

(defn set-backend-service-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.setBackendServiceTargetSslProxyCallable))))

(defn get-target-ssl-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetSslProxyHttpRequest,com.google.cloud.compute.v1.TargetSslProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetSslProxyStub this]
    (-> this (.getTargetSslProxyCallable))))

