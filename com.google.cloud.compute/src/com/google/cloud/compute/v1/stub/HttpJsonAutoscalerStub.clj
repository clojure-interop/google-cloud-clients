(ns com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonAutoscalerStub]))

(def *-aggregated-list-autoscalers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerAggregatedList>"
  HttpJsonAutoscalerStub/aggregatedListAutoscalersMethodDescriptor)

(def *-delete-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonAutoscalerStub/deleteAutoscalerMethodDescriptor)

(def *-get-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>"
  HttpJsonAutoscalerStub/getAutoscalerMethodDescriptor)

(def *-insert-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonAutoscalerStub/insertAutoscalerMethodDescriptor)

(def *-list-autoscalers-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerList>"
  HttpJsonAutoscalerStub/listAutoscalersMethodDescriptor)

(def *-patch-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonAutoscalerStub/patchAutoscalerMethodDescriptor)

(def *-update-autoscaler-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonAutoscalerStub/updateAutoscalerMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonAutoscalerStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonAutoscalerStub [^com.google.cloud.compute.v1.stub.AutoscalerStubSettings settings]
    (HttpJsonAutoscalerStub/create settings)))

(defn list-autoscalers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.listAutoscalersCallable))))

(defn update-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.updateAutoscalerCallable))))

(defn get-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.getAutoscalerCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonAutoscalerStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonAutoscalerStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonAutoscalerStub this]
    (-> this (.shutdown))))

(defn delete-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.deleteAutoscalerCallable))))

(defn insert-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.insertAutoscalerCallable))))

(defn close
  ""
  ([^HttpJsonAutoscalerStub this]
    (-> this (.close))))

(defn aggregated-list-autoscalers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.aggregatedListAutoscalersCallable))))

(defn patch-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.patchAutoscalerCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonAutoscalerStub this]
    (-> this (.isTerminated))))

(defn list-autoscalers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerClient$ListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.listAutoscalersPagedCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonAutoscalerStub this]
    (-> this (.shutdownNow))))

(defn aggregated-list-autoscalers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerClient$AggregatedListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAutoscalerStub this]
    (-> this (.aggregatedListAutoscalersPagedCallable))))

