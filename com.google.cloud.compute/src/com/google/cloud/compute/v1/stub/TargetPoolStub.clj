(ns com.google.cloud.compute.v1.stub.TargetPoolStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetPoolStub]))

(defn ->target-pool-stub
  "Constructor."
  (^TargetPoolStub []
    (new TargetPoolStub )))

(defn set-backup-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.setBackupTargetPoolCallable))))

(defn add-instance-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.addInstanceTargetPoolCallable))))

(defn delete-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.deleteTargetPoolCallable))))

(defn list-target-pools-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.listTargetPoolsCallable))))

(defn get-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPool>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.getTargetPoolCallable))))

(defn add-health-check-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.addHealthCheckTargetPoolCallable))))

(defn get-health-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest,com.google.cloud.compute.v1.TargetPoolInstanceHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.getHealthTargetPoolCallable))))

(defn aggregated-list-target-pools-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolClient$AggregatedListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.aggregatedListTargetPoolsPagedCallable))))

(defn insert-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.insertTargetPoolCallable))))

(defn aggregated-list-target-pools-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.aggregatedListTargetPoolsCallable))))

(defn close
  ""
  ([^TargetPoolStub this]
    (-> this (.close))))

(defn list-target-pools-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetPoolsHttpRequest,com.google.cloud.compute.v1.TargetPoolClient$ListTargetPoolsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.listTargetPoolsPagedCallable))))

(defn remove-health-check-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.removeHealthCheckTargetPoolCallable))))

(defn remove-instance-target-pool-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveInstanceTargetPoolHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetPoolStub this]
    (-> this (.removeInstanceTargetPoolCallable))))

