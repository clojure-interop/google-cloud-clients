(ns com.google.cloud.compute.v1.stub.TargetInstanceStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetInstanceStub]))

(defn ->target-instance-stub
  "Constructor."
  (^TargetInstanceStub []
    (new TargetInstanceStub )))

(defn aggregated-list-target-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceStub this]
    (-> this (.aggregatedListTargetInstancesPagedCallable))))

(defn aggregated-list-target-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceStub this]
    (-> this (.aggregatedListTargetInstancesCallable))))

(defn delete-target-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceStub this]
    (-> this (.deleteTargetInstanceCallable))))

(defn get-target-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetInstanceHttpRequest,com.google.cloud.compute.v1.TargetInstance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceStub this]
    (-> this (.getTargetInstanceCallable))))

(defn insert-target-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceStub this]
    (-> this (.insertTargetInstanceCallable))))

(defn list-target-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceStub this]
    (-> this (.listTargetInstancesPagedCallable))))

(defn list-target-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetInstanceStub this]
    (-> this (.listTargetInstancesCallable))))

(defn close
  ""
  ([^TargetInstanceStub this]
    (-> this (.close))))

