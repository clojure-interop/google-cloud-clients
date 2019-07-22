(ns com.google.cloud.compute.v1.stub.AddressStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AddressStub]))

(defn ->address-stub
  "Constructor."
  (^AddressStub []
    (new AddressStub )))

(defn aggregated-list-addresses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressStub this]
    (-> this (.aggregatedListAddressesPagedCallable))))

(defn aggregated-list-addresses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressStub this]
    (-> this (.aggregatedListAddressesCallable))))

(defn delete-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressStub this]
    (-> this (.deleteAddressCallable))))

(defn get-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressStub this]
    (-> this (.getAddressCallable))))

(defn insert-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressStub this]
    (-> this (.insertAddressCallable))))

(defn list-addresses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressStub this]
    (-> this (.listAddressesPagedCallable))))

(defn list-addresses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AddressStub this]
    (-> this (.listAddressesCallable))))

(defn close
  ""
  ([^AddressStub this]
    (-> this (.close))))

