(ns com.google.cloud.compute.v1.stub.InterconnectStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectStub]))

(defn ->interconnect-stub
  "Constructor."
  (^InterconnectStub []
    (new InterconnectStub )))

(defn delete-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectStub this]
    (-> this (.deleteInterconnectCallable))))

(defn get-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectStub this]
    (-> this (.getInterconnectCallable))))

(defn get-diagnostics-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectStub this]
    (-> this (.getDiagnosticsInterconnectCallable))))

(defn insert-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectStub this]
    (-> this (.insertInterconnectCallable))))

(defn list-interconnects-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectStub this]
    (-> this (.listInterconnectsPagedCallable))))

(defn list-interconnects-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectStub this]
    (-> this (.listInterconnectsCallable))))

(defn patch-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectStub this]
    (-> this (.patchInterconnectCallable))))

(defn close
  ""
  ([^InterconnectStub this]
    (-> this (.close))))

