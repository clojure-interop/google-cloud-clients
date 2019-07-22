(ns com.google.cloud.compute.v1.stub.HttpJsonRouterStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRouterStub]))

(def *-aggregated-list-routers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterAggregatedList>"
  HttpJsonRouterStub/aggregatedListRoutersMethodDescriptor)

(def *-delete-router-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteRouterHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRouterStub/deleteRouterMethodDescriptor)

(def *-get-router-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRouterHttpRequest,com.google.cloud.compute.v1.Router>"
  HttpJsonRouterStub/getRouterMethodDescriptor)

(def *-get-nat-mapping-info-routers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.VmEndpointNatMappingsList>"
  HttpJsonRouterStub/getNatMappingInfoRoutersMethodDescriptor)

(def *-get-router-status-router-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRouterStatusRouterHttpRequest,com.google.cloud.compute.v1.RouterStatusResponse>"
  HttpJsonRouterStub/getRouterStatusRouterMethodDescriptor)

(def *-insert-router-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertRouterHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRouterStub/insertRouterMethodDescriptor)

(def *-list-routers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterList>"
  HttpJsonRouterStub/listRoutersMethodDescriptor)

(def *-patch-router-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchRouterHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRouterStub/patchRouterMethodDescriptor)

(def *-preview-router-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PreviewRouterHttpRequest,com.google.cloud.compute.v1.RoutersPreviewResponse>"
  HttpJsonRouterStub/previewRouterMethodDescriptor)

(def *-update-router-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateRouterHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRouterStub/updateRouterMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRouterStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRouterStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRouterStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRouterStub [^com.google.cloud.compute.v1.stub.RouterStubSettings settings]
    (HttpJsonRouterStub/create settings)))

(defn insert-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.insertRouterCallable))))

(defn patch-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.patchRouterCallable))))

(defn list-routers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$ListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.listRoutersPagedCallable))))

(defn get-router-status-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouterStatusRouterHttpRequest,com.google.cloud.compute.v1.RouterStatusResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.getRouterStatusRouterCallable))))

(defn list-routers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRoutersHttpRequest,com.google.cloud.compute.v1.RouterList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.listRoutersCallable))))

(defn get-nat-mapping-info-routers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$GetNatMappingInfoRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.getNatMappingInfoRoutersPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRouterStub this]
    (-> this (.isShutdown))))

(defn get-nat-mapping-info-routers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNatMappingInfoRoutersHttpRequest,com.google.cloud.compute.v1.VmEndpointNatMappingsList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.getNatMappingInfoRoutersCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRouterStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn preview-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PreviewRouterHttpRequest,com.google.cloud.compute.v1.RoutersPreviewResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.previewRouterCallable))))

(defn shutdown
  ""
  ([^HttpJsonRouterStub this]
    (-> this (.shutdown))))

(defn update-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.updateRouterCallable))))

(defn close
  ""
  ([^HttpJsonRouterStub this]
    (-> this (.close))))

(defn delete-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRouterHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.deleteRouterCallable))))

(defn get-router-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRouterHttpRequest,com.google.cloud.compute.v1.Router>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.getRouterCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRouterStub this]
    (-> this (.isTerminated))))

(defn aggregated-list-routers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.aggregatedListRoutersCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRouterStub this]
    (-> this (.shutdownNow))))

(defn aggregated-list-routers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRoutersHttpRequest,com.google.cloud.compute.v1.RouterClient$AggregatedListRoutersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRouterStub this]
    (-> this (.aggregatedListRoutersPagedCallable))))

