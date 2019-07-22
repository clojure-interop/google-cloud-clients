(ns com.google.cloud.compute.v1.stub.HttpJsonRouteStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRouteStub]))

(def *-delete-route-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRouteStub/deleteRouteMethodDescriptor)

(def *-get-route-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>"
  HttpJsonRouteStub/getRouteMethodDescriptor)

(def *-insert-route-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRouteStub/insertRouteMethodDescriptor)

(def *-list-routes-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList>"
  HttpJsonRouteStub/listRoutesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRouteStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRouteStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRouteStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRouteStub [^com.google.cloud.compute.v1.stub.RouteStubSettings settings]
    (HttpJsonRouteStub/create settings)))

(defn get-route-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouteHttpRequest,com.google.cloud.compute.v1.Route>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouteStub this]
    (-> this (.getRouteCallable))))

(defn list-routes-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteClient$ListRoutesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouteStub this]
    (-> this (.listRoutesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRouteStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRouteStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRouteStub this]
    (-> this (.shutdown))))

(defn delete-route-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouteStub this]
    (-> this (.deleteRouteCallable))))

(defn close
  ""
  ([^HttpJsonRouteStub this]
    (-> this (.close))))

(defn insert-route-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRouteHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouteStub this]
    (-> this (.insertRouteCallable))))

(defn list-routes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutesHttpRequest,com.google.cloud.compute.v1.RouteList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouteStub this]
    (-> this (.listRoutesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRouteStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonRouteStub this]
    (-> this (.shutdownNow))))

