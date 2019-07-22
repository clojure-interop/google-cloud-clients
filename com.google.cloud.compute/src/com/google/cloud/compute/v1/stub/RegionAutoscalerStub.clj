(ns com.google.cloud.compute.v1.stub.RegionAutoscalerStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionAutoscalerStub]))

(defn ->region-autoscaler-stub
  "Constructor."
  (^RegionAutoscalerStub []
    (new RegionAutoscalerStub )))

(defn delete-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerStub this]
    (-> this (.deleteRegionAutoscalerCallable))))

(defn get-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerStub this]
    (-> this (.getRegionAutoscalerCallable))))

(defn insert-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerStub this]
    (-> this (.insertRegionAutoscalerCallable))))

(defn list-region-autoscalers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerStub this]
    (-> this (.listRegionAutoscalersPagedCallable))))

(defn list-region-autoscalers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerStub this]
    (-> this (.listRegionAutoscalersCallable))))

(defn patch-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerStub this]
    (-> this (.patchRegionAutoscalerCallable))))

(defn update-region-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerStub this]
    (-> this (.updateRegionAutoscalerCallable))))

(defn close
  ""
  ([^RegionAutoscalerStub this]
    (-> this (.close))))

