(ns com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionAutoscalerStub]))

(def *-delete-region-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionAutoscalerStub/deleteRegionAutoscalerMethodDescriptor)

(def *-get-region-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>"
  HttpJsonRegionAutoscalerStub/getRegionAutoscalerMethodDescriptor)

(def *-insert-region-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionAutoscalerStub/insertRegionAutoscalerMethodDescriptor)

(def *-list-region-autoscalers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerList>"
  HttpJsonRegionAutoscalerStub/listRegionAutoscalersMethodDescriptor)

(def *-patch-region-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionAutoscalerStub/patchRegionAutoscalerMethodDescriptor)

(def *-update-region-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionAutoscalerStub/updateRegionAutoscalerMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionAutoscalerStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionAutoscalerStub [^com.google.cloud.compute.v1.stub.RegionAutoscalerStubSettings settings]
    (HttpJsonRegionAutoscalerStub/create settings)))

(defn get-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionAutoscalerStub this]
    (-> this (.getRegionAutoscalerCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionAutoscalerStub this]
    (-> this (.isShutdown))))

(defn patch-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionAutoscalerStub this]
    (-> this (.patchRegionAutoscalerCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionAutoscalerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRegionAutoscalerStub this]
    (-> this (.shutdown))))

(defn list-region-autoscalers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionAutoscalerStub this]
    (-> this (.listRegionAutoscalersPagedCallable))))

(defn close
  ""
  ([^HttpJsonRegionAutoscalerStub this]
    (-> this (.close))))

(defn insert-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionAutoscalerStub this]
    (-> this (.insertRegionAutoscalerCallable))))

(defn delete-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionAutoscalerStub this]
    (-> this (.deleteRegionAutoscalerCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionAutoscalerStub this]
    (-> this (.isTerminated))))

(defn list-region-autoscalers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionAutoscalerStub this]
    (-> this (.listRegionAutoscalersCallable))))

(defn update-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionAutoscalerStub this]
    (-> this (.updateRegionAutoscalerCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionAutoscalerStub this]
    (-> this (.shutdownNow))))

