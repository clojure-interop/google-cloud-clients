(ns com.google.cloud.compute.v1.stub.GlobalAddressStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalAddressStub]))

(defn ->global-address-stub
  "Constructor."
  (^GlobalAddressStub []
    (new GlobalAddressStub )))

(defn delete-global-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressStub this]
    (-> this (.deleteGlobalAddressCallable))))

(defn get-global-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressStub this]
    (-> this (.getGlobalAddressCallable))))

(defn insert-global-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertGlobalAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressStub this]
    (-> this (.insertGlobalAddressCallable))))

(defn list-global-addresses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.GlobalAddressClient$ListGlobalAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressStub this]
    (-> this (.listGlobalAddressesPagedCallable))))

(defn list-global-addresses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalAddressStub this]
    (-> this (.listGlobalAddressesCallable))))

(defn close
  ""
  ([^GlobalAddressStub this]
    (-> this (.close))))

