(ns com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonTargetPoolStub]))

(def *-add-health-check-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetPoolStub/addHealthCheckTargetPoolMethodDescriptor)

(def *-add-instance-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetPoolStub/addInstanceTargetPoolMethodDescriptor)

(def *-aggregated-list-target-pools-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolAggregatedList>"
  HttpJsonTargetPoolStub/aggregatedListTargetPoolsMethodDescriptor)

(def *-delete-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetPoolStub/deleteTargetPoolMethodDescriptor)

(def *-get-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPool>"
  HttpJsonTargetPoolStub/getTargetPoolMethodDescriptor)

(def *-get-health-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPoolInstanceHealth>"
  HttpJsonTargetPoolStub/getHealthTargetPoolMethodDescriptor)

(def *-insert-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetPoolStub/insertTargetPoolMethodDescriptor)

(def *-list-target-pools-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolList>"
  HttpJsonTargetPoolStub/listTargetPoolsMethodDescriptor)

(def *-remove-health-check-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetPoolStub/removeHealthCheckTargetPoolMethodDescriptor)

(def *-remove-instance-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetPoolStub/removeInstanceTargetPoolMethodDescriptor)

(def *-set-backup-target-pool-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetPoolStub/setBackupTargetPoolMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonTargetPoolStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetPoolStub [^com.google.cloud.compute.v1.stub.TargetPoolStubSettings settings]
    (HttpJsonTargetPoolStub/create settings)))

(defn set-backup-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.setBackupTargetPoolCallable))))

(defn add-instance-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.addInstanceTargetPoolCallable))))

(defn delete-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.deleteTargetPoolCallable))))

(defn list-target-pools-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.listTargetPoolsCallable))))

(defn get-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPool>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.getTargetPoolCallable))))

(defn add-health-check-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.addHealthCheckTargetPoolCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetPoolStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonTargetPoolStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-health-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPoolInstanceHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.getHealthTargetPoolCallable))))

(defn shutdown
  ""
  ([^HttpJsonTargetPoolStub this]
    (-> this (.shutdown))))

(defn aggregated-list-target-pools-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.aggregatedListTargetPoolsPagedCallable))))

(defn insert-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.insertTargetPoolCallable))))

(defn aggregated-list-target-pools-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.aggregatedListTargetPoolsCallable))))

(defn close
  ""
  ([^HttpJsonTargetPoolStub this]
    (-> this (.close))))

(defn list-target-pools-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.listTargetPoolsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetPoolStub this]
    (-> this (.isTerminated))))

(defn remove-health-check-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.removeHealthCheckTargetPoolCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonTargetPoolStub this]
    (-> this (.shutdownNow))))

(defn remove-instance-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetPoolStub this]
    (-> this (.removeInstanceTargetPoolCallable))))

