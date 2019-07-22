(ns com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonTargetHttpsProxyStub]))

(def *-delete-target-https-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpsProxyStub/deleteTargetHttpsProxyMethodDescriptor)

(def *-get-target-https-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxy>"
  HttpJsonTargetHttpsProxyStub/getTargetHttpsProxyMethodDescriptor)

(def *-insert-target-https-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpsProxyStub/insertTargetHttpsProxyMethodDescriptor)

(def *-list-target-https-proxies-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyList>"
  HttpJsonTargetHttpsProxyStub/listTargetHttpsProxiesMethodDescriptor)

(def *-set-quic-override-target-https-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpsProxyStub/setQuicOverrideTargetHttpsProxyMethodDescriptor)

(def *-set-ssl-certificates-target-https-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpsProxyStub/setSslCertificatesTargetHttpsProxyMethodDescriptor)

(def *-set-ssl-policy-target-https-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpsProxyStub/setSslPolicyTargetHttpsProxyMethodDescriptor)

(def *-set-url-map-target-https-proxy-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetHttpsProxyStub/setUrlMapTargetHttpsProxyMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonTargetHttpsProxyStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetHttpsProxyStub [^com.google.cloud.compute.v1.stub.TargetHttpsProxyStubSettings settings]
    (HttpJsonTargetHttpsProxyStub/create settings)))

(defn set-quic-override-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.setQuicOverrideTargetHttpsProxyCallable))))

(defn set-url-map-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.setUrlMapTargetHttpsProxyCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.isShutdown))))

(defn list-target-https-proxies-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.listTargetHttpsProxiesCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonTargetHttpsProxyStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonTargetHttpsProxyStub this]
    (-> this (.shutdown))))

(defn set-ssl-policy-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.setSslPolicyTargetHttpsProxyCallable))))

(defn insert-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.insertTargetHttpsProxyCallable))))

(defn close
  ""
  ([^HttpJsonTargetHttpsProxyStub this]
    (-> this (.close))))

(defn delete-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.deleteTargetHttpsProxyCallable))))

(defn set-ssl-certificates-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.setSslCertificatesTargetHttpsProxyCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.isTerminated))))

(defn get-target-https-proxy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetHttpsProxyHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.getTargetHttpsProxyCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonTargetHttpsProxyStub this]
    (-> this (.shutdownNow))))

(defn list-target-https-proxies-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetHttpsProxiesHttpRequest,com.google.cloud.compute.v1.TargetHttpsProxyClient$ListTargetHttpsProxiesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetHttpsProxyStub this]
    (-> this (.listTargetHttpsProxiesPagedCallable))))

