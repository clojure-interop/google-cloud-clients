(ns com.google.cloud.compute.v1.stub.AutoscalerStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AutoscalerStub]))

(defn ->autoscaler-stub
  "Constructor."
  (^AutoscalerStub []
    (new AutoscalerStub )))

(defn list-autoscalers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.listAutoscalersCallable))))

(defn update-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.updateAutoscalerCallable))))

(defn get-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.getAutoscalerCallable))))

(defn delete-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.deleteAutoscalerCallable))))

(defn insert-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.insertAutoscalerCallable))))

(defn close
  ""
  ([^AutoscalerStub this]
    (-> this (.close))))

(defn aggregated-list-autoscalers-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.aggregatedListAutoscalersCallable))))

(defn patch-autoscaler-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.patchAutoscalerCallable))))

(defn list-autoscalers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerClient$ListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.listAutoscalersPagedCallable))))

(defn aggregated-list-autoscalers-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerClient$AggregatedListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerStub this]
    (-> this (.aggregatedListAutoscalersPagedCallable))))

