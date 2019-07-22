(ns com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonUrlMapStub]))

(def *-delete-url-map-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonUrlMapStub/deleteUrlMapMethodDescriptor)

(def *-get-url-map-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMap>"
  HttpJsonUrlMapStub/getUrlMapMethodDescriptor)

(def *-insert-url-map-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonUrlMapStub/insertUrlMapMethodDescriptor)

(def *-invalidate-cache-url-map-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonUrlMapStub/invalidateCacheUrlMapMethodDescriptor)

(def *-list-url-maps-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapList>"
  HttpJsonUrlMapStub/listUrlMapsMethodDescriptor)

(def *-patch-url-map-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonUrlMapStub/patchUrlMapMethodDescriptor)

(def *-update-url-map-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonUrlMapStub/updateUrlMapMethodDescriptor)

(def *-validate-url-map-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ValidateUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMapsValidateResponse>"
  HttpJsonUrlMapStub/validateUrlMapMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonUrlMapStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonUrlMapStub [^com.google.cloud.compute.v1.stub.UrlMapStubSettings settings]
    (HttpJsonUrlMapStub/create settings)))

(defn delete-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.deleteUrlMapCallable))))

(defn get-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMap>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.getUrlMapCallable))))

(defn patch-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.patchUrlMapCallable))))

(defn insert-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.insertUrlMapCallable))))

(defn invalidate-cache-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.invalidateCacheUrlMapCallable))))

(defn validate-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ValidateUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMapsValidateResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.validateUrlMapCallable))))

(defn list-url-maps-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.listUrlMapsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonUrlMapStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonUrlMapStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonUrlMapStub this]
    (-> this (.shutdown))))

(defn update-url-map-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.updateUrlMapCallable))))

(defn close
  ""
  ([^HttpJsonUrlMapStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonUrlMapStub this]
    (-> this (.isTerminated))))

(defn list-url-maps-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonUrlMapStub this]
    (-> this (.listUrlMapsPagedCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonUrlMapStub this]
    (-> this (.shutdownNow))))

