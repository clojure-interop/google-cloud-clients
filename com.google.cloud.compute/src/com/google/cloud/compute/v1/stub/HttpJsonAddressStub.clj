(ns com.google.cloud.compute.v1.stub.HttpJsonAddressStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonAddressStub]))

(def *-aggregated-list-addresses-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList>"
  HttpJsonAddressStub/aggregatedListAddressesMethodDescriptor)

(def *-delete-address-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonAddressStub/deleteAddressMethodDescriptor)

(def *-get-address-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>"
  HttpJsonAddressStub/getAddressMethodDescriptor)

(def *-insert-address-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonAddressStub/insertAddressMethodDescriptor)

(def *-list-addresses-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>"
  HttpJsonAddressStub/listAddressesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonAddressStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonAddressStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonAddressStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonAddressStub [^com.google.cloud.compute.v1.stub.AddressStubSettings settings]
    (HttpJsonAddressStub/create settings)))

(defn aggregated-list-addresses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAddressStub this]
    (-> this (.aggregatedListAddressesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonAddressStub this]
    (-> this (.isShutdown))))

(defn list-addresses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressClient$ListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAddressStub this]
    (-> this (.listAddressesPagedCallable))))

(defn insert-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAddressStub this]
    (-> this (.insertAddressCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonAddressStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonAddressStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonAddressStub this]
    (-> this (.close))))

(defn get-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAddressHttpRequest,com.google.cloud.compute.v1.Address>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAddressStub this]
    (-> this (.getAddressCallable))))

(defn delete-address-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAddressHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAddressStub this]
    (-> this (.deleteAddressCallable))))

(defn aggregated-list-addresses-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAddressesHttpRequest,com.google.cloud.compute.v1.AddressClient$AggregatedListAddressesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAddressStub this]
    (-> this (.aggregatedListAddressesPagedCallable))))

(defn list-addresses-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAddressesHttpRequest,com.google.cloud.compute.v1.AddressList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAddressStub this]
    (-> this (.listAddressesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonAddressStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonAddressStub this]
    (-> this (.shutdownNow))))

