(ns com.google.cloud.compute.v1.stub.MachineTypeStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub MachineTypeStub]))

(defn ->machine-type-stub
  "Constructor."
  (^MachineTypeStub []
    (new MachineTypeStub )))

(defn aggregated-list-machine-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeClient$AggregatedListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeStub this]
    (-> this (.aggregatedListMachineTypesPagedCallable))))

(defn aggregated-list-machine-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeStub this]
    (-> this (.aggregatedListMachineTypesCallable))))

(defn get-machine-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetMachineTypeHttpRequest,com.google.cloud.compute.v1.MachineType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeStub this]
    (-> this (.getMachineTypeCallable))))

(defn list-machine-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeClient$ListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeStub this]
    (-> this (.listMachineTypesPagedCallable))))

(defn list-machine-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^MachineTypeStub this]
    (-> this (.listMachineTypesCallable))))

(defn close
  ""
  ([^MachineTypeStub this]
    (-> this (.close))))

